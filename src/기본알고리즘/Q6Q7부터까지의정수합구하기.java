package 기본알고리즘;

import java.util.Scanner;


public class Q6Q7부터까지의정수합구하기 {
	
	
	public static void main(String[] args) {
		//실습1-3
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int n= stdIn.nextInt();
		
		int sum =0;
		int i=1;
		
		//실습1-4
		/*
		 * while(i<=n) { sum+=i; i++; //Q6 변수 i의 값이 n+1이 됨을 확인하세요 System.out.println(i);
		 * }
		 */
		
		//실습1-5
		//Q7 n이 7이면 1+2+3+4+5+6+7=28로 출력하는 프로그램을 작성하세요
		for(int j=1; j<=n; j++) { 
			sum+=j; 
			if(j<n){
				System.out.print(j+ "+");
			}
			if(j==n) {
				System.out.print(j+"=");
			}
		}

		System.out.print(sum);

	}
	


}


