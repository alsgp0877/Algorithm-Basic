package 기본알고리즘;

import java.util.Scanner;


public class Q1Q2Q3세값의최대값 {
	
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
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		
		return max;
		
	}
	
	//Q2 세 값의 최소값을 구하는 min3 메서드를 작성하세요
	//a,b,c의 최대값을 구하여 반환합니다.
	static int min3(int a, int b, int c) {
		
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		
		return min;
	}
	
	//Q3 네 값의 최소값을 구하는 min3 메서드를 작성하세요
	//a,b,c의 최대값을 구하여 반환합니다.
	static int min4(int a, int b, int c,int d) {
			
			int min = a;
			if(b<min) min=b;
			if(c<min) min=c;
			if(d<min) min=d;
			
			return min;
	}
	
	//세값의 중앙값 구하기 실습 1c-1
	static int med3(int a, int b, int c) {
		
		if(a>=b)//a가b보다 크다는 전제에 
			if(b>=c)//b가 c보다 크다는 전제면
				return b; // a>b>c
			else if(a<=c)//b가c보다 작다는 전제에 b<c => a ? c > b 
				return a;// c >= a > b
			else //b가c보다 작고  a가 c보다 크다 b<c a>c 
				return c; //a>c>b
		else if(a>c)//a가b보다 작다는 전제에  a가c보다 크다는 전제에 a<b a>c
			return a; //b>a>c
		else if(b>c)//a가b보다 작다는 전제에  a가c보다 작다 전제에 b가 c보다 크다는 전제 a<b a<c b>c
			return c;//b>c>a
		else
			return b;//a가b보다 작다는 전제에  a가c보다 작다 전제에 b가 c보다 작다는 전제 a<b a<c b<c
			//c>b>a
	}
	
	
	public static void main(String[] args) {
		//실습1-1
		Scanner stdIn = new Scanner(System.in);
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		
		System.out.println("최댓값은"+max3(a,b,c)+"입니다.");
		System.out.println("최소값은"+min3(a,b,c)+"입니다.");
		System.out.println("최소값은"+med3(a,b,c)+"입니다.");
		
		/*
		 * int d= stdIn.nextInt(); System.out.println("최댓값은"+max4(a,b,c,d)+"입니다.");
		 * System.out.println("최댓값은"+min4(a,b,c,d)+"입니다.");
		 */

	}
	


}


