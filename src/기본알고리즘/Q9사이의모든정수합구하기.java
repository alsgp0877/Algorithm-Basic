package 기본알고리즘;

import java.util.Scanner;


public class Q9사이의모든정수합구하기 {
	static int sumof(int a, int b) {
		int sum =0;
		
		if(a<b) {
			for(int j=a; j<=b; j++) { 
				sum+=j; 
			}
		}
		
		if(a>b) {
			for(int j=a; j>=b; j--) { 
				sum+=j; 
			}
		}
		
		return sum;

	}
	
	//Q9 정수 a,b 를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요
	//대소 관계에 상관없이 합을 구하세요(3,5,12 5,3,12)
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("사이값  a를 입력하세요:");
		int a= stdIn.nextInt();
		System.out.print("사이값  b를 입력하세요:");
		int b= stdIn.nextInt();
	

		System.out.print("=" + sumof(a,b));
	}
	
}


