package 기본알고리즘;

import java.util.Scanner;

public class Q16피라미드 {
	//Q16 n단 피라미드를 출력하는 메서드를 작성하세요
	static void spira(int n) {
		//---*---
		//--***--
		//-*****-
		//*******
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {//그리고 이건 앞에만 신경쓰면된다 뒤에도 신경써서..ㅠㅠ
				
				System.out.print('-');
			}
			
			for(int k=0;k<i*2+1;k++) {//나눗셈까지 접근했었는데.. 곱하기를 생각못했다..ㅠㅠ
				//1,1+2,1+2+2,...
				//1+(0*2), 1+(1*2), 1+(2*2)
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
	
	//Q16 n단 숫자피라미드를 출력하는 메서드를 작성하세요
	static void npira(int n) {
		//---*---
		//--***--
		//-*****-
		//*******
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {
				
				System.out.print('-');
			}
			
			for(int k=0;k<i*2+1;k++) {
				
				System.out.print(i+1);
			}
			
			System.out.println();
		}
	}


	

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int n= 0;
		
		do {
			System.out.print("몇단입니까?:");
			n= stdIn.nextInt();
		}while(n<=0);
		
		spira(n);
		npira(n);

	}

}


