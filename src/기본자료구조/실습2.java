package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class 실습2 {
	
		//두배열a,b의 모든 요소가같은가?
		static boolean equals(int[] a, int[] b) {
			if(a.length != b.length) {
				return false;
			}
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					return false;
				}
			}
			return true;
			 
		}
	
	
		public static void main(String[] args) {

			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.print("배열a의 요솟수:"); 
			  int na = stdIn.nextInt();
			  
			  int[] a=new int[na];
			  
			  for(int i=0;i<na;i++) { 
				  System.out.print("a["+i+"]:");
				  a[i] = stdIn.nextInt();
				  
			  }
			  
			  System.out.print("배열a의 요솟수:"); 
			  int nb = stdIn.nextInt();
			  
			  int[] b=new int[nb];
			  
			  for(int i=0;i<nb;i++) { 
				  System.out.print("b["+i+"]:");
				  b[i] = stdIn.nextInt();
				  
			  }
			 
			  System.out.print("배열a와 배열 b는" + (equals(a,b) ? "같습니다" : "같지않습니다")); 
			
		}

}
