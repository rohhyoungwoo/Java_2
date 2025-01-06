package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.UserDTO;

public class UserDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

	// 아이디 중복검사
	public boolean checkId(String userId) {
		String query = "SELECT user_number FROM tbl_user WHERE user_id = ?";

		try {
			// DBConnector에서 커넥션 객체를 얻어온다(DB와 연결완료)
			connection = DBConnector.getConnection();
			// 쿼리를 보내기 위한 preparedStatement 객체를 커넥션 객체에서 가져온다
			preparedStatement = connection.prepareStatement(query);
			// 우리가 문자열로 작성한 쿼리가 preparedStatement에 들어가서 sql명령어로 사용된다
			// 쿼리에 ?가 있다(미완성상태) -> ?를 매개변수로 받은 userId로 바꿔야한다
			// preparedStatement의 기능으로 완성시켜준다
			// set자료형(물음표의 순서, 넣을 값);
			preparedStatement.setString(1, userId);

			// 완성된 쿼리를 실행시키는 방법
			// 1. executeQuery()
			// select할 때 반환되는 결과 값을 받기 위해 사용
			// 2. executeUpdate()
			// select를 제외하고 반환되는 값이 없으면 사용
			// 쿼리가 반영된 행이 몇개인지 리턴

			// executeQuery()의 반환타입은 ResultSet이다
			resultSet = preparedStatement.executeQuery();

			// resultSet은 쿼리의 결과(테이블)를 저장하고 있다
			// 각 데이터에 접근하는 방식은 Iterator와 동일하게 커서를 사용한다
			// next() : 현재 커서 다음에 데이터가 존재하는지를 true/false 반환한다
			// get자료형(컬럼번호) : 커서를 다음행으로 옮기고 해당 컬럼의 값을 자료형에 맞게 가져온다
			if (resultSet.next()) {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("checkId() 메소드 sql오류");
		} finally {
			// jdbc에서 제공하는 객체들을 사용 후 닫아줘야한다
			// 오류 여부와 상관없이 반드시 닫아야하므로 finally에 작성한다
			// 닫을 때는 여는 순서와 반대로 닫는다
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return true;

	}

	// 회원가입 메소드(Create => INSERT){
	public void join(UserDTO userDTO) {
		String qurey = "INSERT INTO TBL_USER(USER_NUMBER, USER_ID, USER_PW, USER_NAME, USER_AGE, USER_GENDER, USER_BIRTH) "
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?)";

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(qurey);
			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setInt(4, userDTO.getUserAge());
			preparedStatement.setString(5, userDTO.getUserGender());
			preparedStatement.setString(6, userDTO.getUserBirth());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("join() SQL오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 로그인 메소드(매개변수 id, pw)
	public int login(String userId, String userPw) {
		String query = "SELECT user_number " + "FROM TBL_USER " + "WHERE USER_ID = ? AND USER_PW = ?";
		int userNumber = -1;

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				// (쿼리실행결과를 테이블형식으로)
				// resultSet의 초기 상태는 첫번째 행 이전에 커서가 위치함
				// next을 호출하면 커서를 다음 행으로 이동시키고 해당 행이 있으면 true를 반환함
				// 더 이상 행이 없다면 false를 반환
				// 결과 테이블에 행이 하나라도 있는지 판단
				userNumber = resultSet.getInt(1);
				// resultSet.getInt(int columIndex) : 결과 집합에서 현재 커서가 위치한 행의 특정 열값을 정수로 가져오는 메소드
				// 1은 첫번째 열(컬럼)을 의미한다 => 열번호는 1부터 시작!!
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userNumber;
	}

	// 이름과 생일로 아이디 찾기
	public List<String> findId(String userName, String userBirth) {
		String query = "SELECT user_id " + "FROM TBL_USER " + "WHERE USER_NAME = ? AND USER_BIRTH = ?";

//		String userId = null;
		List<String> userId = new ArrayList<String>();

		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, userBirth);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

//				userID = resultSet.getString(1);
//				userIds.add(userId);
				userId.add(resultSet.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userId;
	}

	//회원 전체 정보 수정
	public void update(UserDTO userDTO) {
		String query = "UPDATE TBL_USER \r\n"
				+ "SET USER_ID = ?, USER_PW = ?, USER_NAME = ?,"
				+ " USER_AGE =?, USER_GENDER = ?, USER_BIRTH = ?";
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userDTO.getUserId());
			preparedStatement.setString(2, userDTO.getUserPw());
			preparedStatement.setString(3, userDTO.getUserName());
			preparedStatement.setInt(4, userDTO.getUserAge());
			preparedStatement.setString(5, userDTO.getUserGender());
			preparedStatement.setString(6, userDTO.getUserBirth());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update() sql오류!!");
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//회원 1명 전체 정보 조회
	//단, 쿼리문을 사용할 때 *를 가능하면 사용하지 않는다. 속도가 저하된다.
	public UserDTO findUser(int userNumber) {
		String query = "SELECT USER_ID, USER_PW, USER_NAME, USER_AGE, USER_GENDER, USER_BIRTH "
				+ "FROM TBL_USER "
				+ "WHERE USER_NUMBER = ?";
		UserDTO userDTO = null;
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				userDTO = new UserDTO();
				
				userDTO.setUserNumber(userNumber);
				userDTO.setUserId(resultSet.getString("user_id"));
				userDTO.setUserPw(resultSet.getString("user_pw"));
				userDTO.setUserName(resultSet.getString("user_name"));
				userDTO.setUserAge(resultSet.getInt("user_age"));
				userDTO.setUserGender(resultSet.getString("user_gender"));
				userDTO.setUserBirth(resultSet.getString("user_birth"));
			}
		} catch (SQLException e) {
			System.out.println("findUser() SQL오류!");
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return userDTO;
	}
	
	//회원탈퇴
	public boolean delete(int userNumber) {
		String query = "DELETE FROM TBL_USER "
				+ "WHERE USER_NUMBER = ?";
		int result = 0;
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete() SQL오류!!");
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result > 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
