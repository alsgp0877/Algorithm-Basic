package 기본알고리즘;

import java.util.Scanner;


public class Q11자릿수구하기 {
	
	
	public static void main(String[] args) {
		
		//Q11 임의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요
		//135를 입력할 경우 '그 수는 3자리입니다' 라고 출력합니다.
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int count=0;
		System.out.print("정수를 입력하세요:"); 
		a = stdIn.nextInt();
		
		  do {
			  //100/10 - 10
			  //10/10 - 1
			  //1/10 - 0(정수형이여서 소숫점없이 0이 나온다.)
			  a = a/10;
		      ++count;
		  }while(a!=0);
		
		System.out.print(count+"자리입니다.");

	}
	


}


