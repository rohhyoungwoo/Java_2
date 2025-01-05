package ex04_노형우;

public class Student extends Person {

	//필드
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;
	
	//Person의 생성자 호출
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
	}


	//메소드 생성
	int getTotalScore(int Score1, int Score2, int Score3) {
		return Score1 + Score2 + Score3;
	}
	
	//메소드 생성
	int getAverageScore(int Score) {
		return Score/3;
	}
	
	
}
