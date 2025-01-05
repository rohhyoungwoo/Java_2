package task;

import java.util.Scanner;

public class TeamProject01 {
   public static void main(String[] args) {
      TeamProject01 mt = new TeamProject01 ();
      Scanner sc = new Scanner(System.in);
      // 0~9까지의 수를 총 10번 입력을 받을 것인데 이중에서 다른수가 나오면
      // 반복을해서 입력을 받으니 10칸자리 배열을 생성하고 0~9까지의 수만입력받음
      // 반복문은 while을 통해서 생성
      // 논리형boolean형 메소드를 통해서 0~9가 아닌 다른 숫자가 나오면 false
      // 0~9사이의 수가 나오면 true가 되도록 설정함
      // 이때 논리형 메소드를 사용해서 0~9의 값만 입력이 되도록 설정함
      // 재입력하라는 메시지가나오고 그렇게 10번을 입력을 맞추면 그 10까지
      // 나온 숫자들의 합 for-each문을 사용
      int[] ar = new int[10];
      int count = 0;
      int sum = 0;
      while (count != 10) {
    	  System.out.println("0~9 까지 더하고 싶은 수를 적어주세요 : ");
         int num = sc.nextInt();
         if (mt.nt(num) == true) {
            ar[count] = num;
            count++;
         } else {
            System.out.println("제대로된 숫자를 출력해주세요");
         }
      }
      for (int number : ar) {
         System.out.print(number + " ");
         sum += number;
         
      }
      System.out.println();
      System.out.println("입력하신 값의 총 합 : " + sum);

   }
   boolean nt(int num) {
      boolean tf;
     
    switch (num) {
		case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9: {
			tf = true;
			break;
		}
		default:
			tf = false;
			break;
		}
		return tf;
      
    
   }
}
