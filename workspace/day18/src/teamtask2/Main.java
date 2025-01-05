package teamtask2;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
//      2. Employee 클래스와 EmployeeService 클래스를 선언하여 아래 요구사항 맞춰 구현하기
//      - 회사 직원들의 정보를 HashMap에 저장한다
//         HashMap의 key는 사원의 Id(String), value는 이름, 나이, 부서로 설정
//         
//      - 조건1.    새로운 사원정보를 추가
//         각 팀원들 이름, 나이, 부서(개발부서 or 보안부서 중 택1)
//      - 조건2. 특정 ID(팀장)의 사원정보를 출력
//      - 조건3. 모든 사원의 정보 출력(반드시 entrySet 사용)
//      - 조건4. 모든 사원 정보에 연봉 추가(연봉은 3000으로 통일)
//      - Object 클래스의 메소드 오버라이딩 필수(사원의 ID가 동일하면 같은 사원으로 본다)

//1. 클래스 (Employee, EmployeeService, Main) 3개 생성
//2. Employee 필드 이름, 나이, 부서, 연봉 --> Employee의 필드 생성
//3. Key : ID, 
//4. 팀장 결정하는 메서드 void setLeader
//5. 모든 사원 정보 출력하는 메서드 void printAllInfo()
//6. EmployeeSercive : 메서드만
//6-1. setLeader() : 필드의 isLeader false or true 판단 -> 명진 님
//6-2. printAllInfo() : 객체의 모든 정보를 출력하는 메서드 -> entrySet -> 지수 님 (HashMapTest02 활용)
//6-3. printLeader() : (toString 오버라이딩하여 if(팀장=true)면 팀장 정보만 출력, 아니면 모든 팀원 정보 출력)
//7. Main에서 무얼 하는가? HashMap<String, Employee> employees = new HashMap<>();
//employee.put("1111", new employee1("홍길동", 25, "보안부서"))
//employee.put("2222", new employee1("홍길동", 25, "보안부서"))
//employee.put("3333", new employee1("홍길동", 25, "보안부서"))
//HashMap에 ID랑 직원 객체 연결해준다


      EmployeeService es = new EmployeeService();

      HashMap<String, Employee> map = new HashMap<String, Employee>();

      map.put("1", new Employee("송명진", 10, "개발부서"));
      map.put("2", new Employee("조은혜", 12, "보안부서"));
      map.put("3", new Employee("윤지수", 12, "보안부서"));
      map.put("4", new Employee("김태현", 12, "보안부서"));

      es.setLeader(map, "1"); // 처음으로 팀장을 설정해본다
      es.setLeader(map, "2"); // 팀장을 바꿀 경우 리더를 변경하시겠습니까? 출력 -> 변경할 경우
      // 리더가 변경됨. 
      es.salaryUpdate(map); // 모든 Employee 객체의 연봉을 3000으로 설정하는 메서드
      es.printAllInfo(map); // 모든 Employee 객체의 정보를 출력하는 메서드 (toString 오버라이딩 사용)
      es.printLeaderInfo(map); // 모든 Employee 객체의 isLeader 필드를 확인하여 true일 경우
      // 출력하는 메서드
   }

}
