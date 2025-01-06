package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.domain.BookDTO;

public class LibDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
//	public ResultSet resultSet;
	
	//도서 등록 addBook
	public void addBook(BookDTO bookDTO) {
		String query = "INSERT INTO TBL_BOOK "
				+ "VALUES(SEQ_BOOK.NEXTVAL, ?, ?)";
		
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bookDTO.getBookTitle());
			preparedStatement.setString(2, bookDTO.getBookAuthor());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("addBook() SQL오류");
			e.printStackTrace();
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
	
	
	
}
