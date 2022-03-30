package 기본알고리즘;

import java.util.Scanner;


public class 세값의최대값 {
	
	//1-2
	//a,b,c의 최대값을 구하여 반환합니다.
	static int max3(int a, int b, int c) {
		
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max;
	}
	
	//Q1 네 값의 최대값을 구하는 max4 메서드를 작성하세요
	//a,b,c의 최대값을 구하여 반환합니다.
	static int max4(int a, int b, int c, int d) {
		
		
	}
	
	//Q2 네 값의 최소값을 구하는 min3 메서드를 작성하세요
	//a,b,c의 최대값을 구하여 반환합니다.
	static int min3(int a, int b, int c) {
		
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max;
	}
	
	public static void main(String[] args) {
		//실습1-1
		Scanner stdIn = new Scanner(System.in);
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		int d= stdIn.nextInt();
		
		System.out.println("최댓값은"+max3(a,b,c)+"입니다.");
		System.out.println("최댓값은"+max4(a,b,c,d)+"입니다.");
	}
	


}


