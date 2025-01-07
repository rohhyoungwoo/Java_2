package task_재시험;

public class UserDTO {
	//필드
	private String id;
	private int pw;
	private String name;
	private int age;
	
	//생성자
	public UserDTO(String id, int pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
	
	//toString 재정의
@Override
	public String toString() {
		return super.toString();
	}







	//getter
	public String getId() {
		return id;
	}


	public int getPasswd() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	
	
	
	
	
	
	
	
	
	
}
