package teamtask2;

public class Employee {
	 // 필드
	   private String name;
	   private int age;
	   private String department;
	   private int salary;
	   private boolean isLeader;

	   // 생성자
	   public Employee(String name, int age, String department) {
	      super();
	      this.name = name;
	      this.age = age;
	      this.department = department;
	      this.salary = 3000;
	      this.isLeader = false;
	   }

	   // getter & setter
	   public void setSalary(int salary) {
	      this.salary = salary;
	   }

	   public boolean isLeader() {
	      return isLeader;
	   }

	   public void setLeader(boolean isLeader) {
	      this.isLeader = isLeader;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   public String getDepartment() {
	      return department;
	   }

	   public void setDepartment(String department) {
	      this.department = department;
	   }

	   public int getSalary() {
	      return salary;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public String getName() {
	      return name;
	   }

	   @Override
	   public String toString() {
	      return "Employee [이름: " + name + ", 나이: " + age + ", 부서: " + department + ", 연봉: " + salary + "]";
	   }

	}

