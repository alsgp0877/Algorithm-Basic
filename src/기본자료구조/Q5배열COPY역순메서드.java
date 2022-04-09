package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q5배열COPY역순메서드 {
	
		static void swap(int[] b, int idx1, int idx2) {
			int t = b[idx1];
			b[idx1] = b[idx2];
			b[idx2] = t;
			 
		}
	
		//배열b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요
		static void rcopy(int[] a, int[] b) {
			if(a.length == b.length) {
				for(int i=0;i<b.length/2;i++) {
					swap(b,i,b.length-i-1);
				}
				for(int i=0;i<a.length;i++) {
					a[i]=b[i];
				}
				System.out.println("copy본체 배열b");
				for(int i=0;i<b.length;i++) {
					System.out.print(+b[i]); 
				}
				System.out.println();
				
				System.out.println("copy된 배열a");
				for(int i=0;i<a.length;i++) {
					System.out.print(+a[i]); 
				}
			}else {
				System.out.println("배열요솟수가 맞지 않아 복사할수없습니다.");
			}
			
		}
	
	
		public static void main(String[] args) {

			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.print("배열b의 요솟수:"); 
			  int nb = stdIn.nextInt();
			  
			  int[] b=new int[nb];
			  
			  for(int i=0;i<nb;i++) { 
				  System.out.print("b["+i+"]:");
				  b[i] = stdIn.nextInt();
				  
			  }
			  
			  System.out.print("배열a의 요솟수:"); 
			  int na = stdIn.nextInt();
			  
			  int[] a=new int[na];
			 
			  rcopy(a,b);
			
		}

}
