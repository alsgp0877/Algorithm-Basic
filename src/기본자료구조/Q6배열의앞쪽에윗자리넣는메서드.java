package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q6배열의앞쪽에윗자리넣는메서드 {
	
		
	
		//입력받은 10진수를 2진수~36진수로 기수 변환하여 나타냄
		//정숫값 x를 r진수로 변환하여 
		//배열d에 아랫자리부터 넣어주고 자릿수를 반환한다. 
		//Q6배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요 
		static int cardConvR(int x, int r, char[] d) {
			int digits = 0; //변환후의 자릿수
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			//String dchar = "ZYXWVUTSRQPONMLKJIHGFEDCBA9876543210";
			do {
				d[digits++]=dchar.charAt(x%r);
				x/=r;//x가 0이 될때까지 반복
			}while(x!=0);
			
			return digits;
		}
		
		public static void main(String[] args) {

			 Scanner stdIn = new Scanner(System.in);
			 int no;//변환하는정수
			 int cd;//기수
			 
			 int dno;//변환후의자릿수
			 int retry;//다시한번?
			 char[] cno = new char[32];//변환후각자리의 숫자를 넣어두는 문자의 배열
			  
			 System.out.println("10진수를 기수 변환합니다."); 
			 do {
				 do {
					 System.out.print("변환하는 음이 아닌 정수:"); 
					 no= stdIn.nextInt();
				 }while(no<0);
				 
				 do {
					 System.out.print("어떤진수로 변환할까요?(2~36):"); 
					 cd = stdIn.nextInt();
				 }while(cd<2 || cd>36);
					
				 dno = cardConvR(no,cd,cno);//no를 cd진수로 변환;
				 
				 System.out.print(cd+"진수로는");
				 for(int i=0;i<=dno-1;i++) {//윗자리부터차례로 나타냄
					 System.out.print(cno[i]); 
				 }
				 System.out.println("입니다"); 
				 
				 System.out.print("한번더할까요?(1.예/0.아니오)"); 
				 retry=stdIn.nextInt();
					 
			 }while(retry==1);
			 
		}

}
