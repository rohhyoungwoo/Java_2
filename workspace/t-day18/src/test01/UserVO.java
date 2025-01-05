package test01;

public class UserVO {
	// - UserVO 클래스
	// 유저번호, 아이디, 비밀번호, 이름, 나이
	// 모든 필드는 private으로 선언하고 생성자를 통해서만 초기화한다
	// toString() 재정의하여 모든 필드의 값을 확인할 수 있도록해야하며 유저 번호 값으로 객체의 동일성을 비교한다
	// 필드
	private int userNo;
	private String id;
	private String password;
	private String name;
	private int age;

	// 생성자
	public UserVO(int userNo, String id, String password, String name, int age) {
		this.userNo = userNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	// Getter 메서드
	public int getUserNo() {
		return userNo;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "UserVO{" + "userNo=" + userNo + ", id='" + id + '\'' + ", password='" + password + '\'' + ", name='"
				+ name + '\'' + ", age=" + age + '}';
	}

	// equals 재정의 (userNo로 동일성 판단)
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		UserVO userVO = (UserVO) obj;
		return userNo == userVO.userNo;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(userNo);
	}
}
