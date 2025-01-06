package com.app.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.app.dao.DBConnector;
import com.app.dao.LibDAO;
import com.app.domain.BookDTO;

public class Main {
	public static void main(String[] args) {
		//연결 테스트
		
//		try {
//			Connection conn = DBConnector.getConnection();
//			System.out.println("연결 성공");
//			conn.close();
//		} catch (SQLException e) {
//			System.out.println("연결 실패");
//		}
//		
//		INSERT INTO TBL_BOOK
//		--VALUES(SEQ_BOOK.NEXTVAL,'웹 표준의 정석', '고경희');
//		--VALUES(SEQ_BOOK.NEXTVAL,'DBMS의 정석', '노형우');
//		--VALUES(SEQ_BOOK.NEXTVAL,'Java의 정석', '송명진');
//		--VALUES(SEQ_BOOK.NEXTVAL,'JavaScript의 정석', '김태현');
//		VALUES(SEQ_BOOK.NEXTVAL,'정석의 정석', '신동석');
		
		
		BookDTO bookDTO = new BookDTO();
		LibDAO libDAO = new LibDAO();
		
//		bookDTO.setBookNumber(1);
		bookDTO.setBookTitle("웹 표준의 정석");
		bookDTO.setBookAuthor("고경희");
		libDAO.addBook(bookDTO);

		bookDTO.setBookTitle("DBMS의 정석");
		bookDTO.setBookAuthor("노형우");
		libDAO.addBook(bookDTO);
		
		bookDTO.setBookTitle("Java의 정석");
		bookDTO.setBookAuthor("송명진");
		libDAO.addBook(bookDTO);
		
		bookDTO.setBookTitle("JavaScript의 정석");
		bookDTO.setBookAuthor("김태현");
		libDAO.addBook(bookDTO);
		
		bookDTO.setBookTitle("정석의 정석");
		bookDTO.setBookAuthor("신동석");
		libDAO.addBook(bookDTO);
		
		
		
	}
}
