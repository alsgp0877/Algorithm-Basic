package 기본알고리즘;

import java.util.Scanner;


public class 조건판단과분기 {
	
	
	public static void main(String[] args) {
		//실습1-3
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int n= stdIn.nextInt();
		
		if(n>0)
			System.out.print("이수는 양수입니다.");
		else if(n<0)
			System.out.print("이수는 음수입니다.");
		else
			System.out.print("이수는 0입니다.");

	}
	


}


