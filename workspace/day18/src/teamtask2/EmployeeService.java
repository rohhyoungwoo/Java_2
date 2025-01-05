package teamtask2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeService {
	// 팀장을 선출하는 메서드 - 송명진 님
	   void setLeader(HashMap m, String id) {
	      Scanner scan = new Scanner(System.in);
	      Set<Entry<String, Employee>> set = m.entrySet();
	      Iterator<Entry<String, Employee>> iter = set.iterator();

	      boolean hasLeader = false;
	      String leader = null;
	      String answer = null;

	      while (iter.hasNext()) {
	         Entry<String, Employee> inext = iter.next();
	         if (inext.getValue().isLeader() == true) {
	            hasLeader = true;
	            leader = inext.getKey();
	         }
	      }
	      if (!hasLeader) {
	         ((Employee) m.get(id)).setLeader(true);
	         System.out.println("리더는 " + ((Employee) m.get(id)).getName() + "입니다");

	      } else {
	         System.out.print("기존 리더는 " + ((Employee) m.get(leader)).getName() + "입니다 리더를 변경하겠습니까?(T/F) : ");
	         answer = scan.next();
	         if (answer.equals("t") || answer.equals("T")) {
	            ((Employee) m.get(leader)).setLeader(false);
	            ((Employee) m.get(id)).setLeader(true);
	            System.out.println("리더는 " + ((Employee) m.get(id)).getName() + "입니다");
	         } else {
	            System.out.println("리더는 변경되지 않았습니다");
	         }
	      }
	   }
	// 모든 사원의 정보를 출력하는 메서드 - 윤지수 님, 김태현 님, 조은혜 님
	   void printAllInfo(HashMap<String, Employee> employees) {
	      for (Entry<String, Employee> entry : employees.entrySet()) {
	         System.out.println("ID는 : " + entry.getKey() + " value : " + entry.getValue().toString());

	      }
	   }
	// 연봉을 3000으로 설정하는 메서드 - 김태현 님
	   void salaryUpdate(HashMap<String, Employee> employees) {
	      for (Employee emp : employees.values()) {
	         emp.setSalary(3000);
	         System.out.println(emp.getName() + "님 연봉 : " + emp.getSalary());

	      }
	   }
	   // 팀장의 정보만 출력하는 메서드 - 송명진 님
		void printLeaderInfo(HashMap<String, Employee> employees) {
				for (Employee emp : employees.values()) {
				if (emp.isLeader() == true)
					System.out.println(emp.toString());
			}
		}
	}


