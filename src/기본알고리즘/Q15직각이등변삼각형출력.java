package 기본알고리즘;

import java.util.Scanner;

public class Q15직각이등변삼각형출력 {
	static void triangleLB(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		//*****
		//****
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		//n=5
		//*****
		// ****
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		//n이 4이면 
		//*
		for(int i=n-1;i>=0;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print('-');
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	//Q15 직각이등변 삼각형을 출력하는 부분을 메서드 형식으로 작성하세요
	//왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드 작성
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int n= 0;
		
		do {
			System.out.print("몇단삼각형입니까?:");
			n= stdIn.nextInt();
		}while(n<=0);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		triangleLB(n);
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다");
		triangleLU(n);
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다");
		triangleRU(n);
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		triangleRB(n);

	}

}


