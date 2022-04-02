package 기본알고리즘;

import java.util.Scanner;


public class Q10bminusa {
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		int sum =0;
		
		//실습1-6
		//do while
		//양수만 입력해야하는데 양수가 아닌 숫자를 입력할 경우에 대한 대처
		
		/*
		 * do { System.out.print("정수를 입력하세요:"); n= stdIn.nextInt(); }while(n<=0);
		 * 
		 * for(int j=1; j<=n; j++) { sum+=j;
		 * 
		 * }
		 */
		
		//Q10 두변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하시오
		//단 b<=a일 경우 변수 b의 값을 다시 입력하세요 
		
		int a;
		int b;
		
		  do { 
			  System.out.print("정수를 a를 입력하세요:"); 
			  a = stdIn.nextInt(); 
			  System.out.print("정수를 b를 입력하세요:"); 
			  b = stdIn.nextInt(); 
		  }while(b<=a);
		  
		 
		System.out.print(b-a);

	}
	


}


