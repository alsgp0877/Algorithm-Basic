package 기본알고리즘;

import java.util.Scanner;


public class Q8가우스덧셈 {
	
	//Q8 1부터10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있다.
	//가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int n= stdIn.nextInt()+1;//4일경우 
		//{1,2,3,4}
		int sum =0;
		for(int j=1; j<=n; j++) { 
			
			//2+3
			if(j<--n) {
				sum=sum+j+n;
			}
			//3+3
			if(j==n) {
				sum=sum+j;
				break;
			}
			//3+2
			if(j>n) {
				break;
			}
		}

		System.out.print("=" + sum);
	}
	
}


