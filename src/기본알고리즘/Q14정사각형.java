package 기본알고리즘;

import java.util.Scanner;

public class Q14정사각형 {
	
	//Q14 입력한 수를 한변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int n= stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}


