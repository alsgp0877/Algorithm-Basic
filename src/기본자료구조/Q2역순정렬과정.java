package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q2역순정렬과정 {
	
		//배열요소 a[idx1]가 a[idx2]의 값을 바꿈
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
			 
		}
		//배열a의 요소를  역순으로 정렬
		static void reverse(int[] a) {
			for(int i=0;i<a.length/2;i++) {
				swap(a,i,a.length-i-1);
				System.out.println("a["+i+"]과 a["+((a.length-i)-1)+"]를 교환합니다.");
				for(int j=0;j<a.length;j++) {
					  System.out.print(a[j]);
				}
				System.out.println();
			}
		}
	
	
		public static void main(String[] args) {

			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.print("요솟수:"); 
			  int num = stdIn.nextInt();
			  
			  int[] x=new int[num];
			  
			  for(int i=0;i<num;i++) { 
				  System.out.print("x["+i+"]:");
				  x[i] = stdIn.nextInt();
				  
			  }
			  
			  for(int i=0;i<num;i++) {
				  System.out.print(x[i]);
			  }
			  System.out.println(); 
			  
			  reverse(x);//배열 a의 요소를 역순으로 정렬
			  System.out.println("역순정렬을 맞쳤습니다."); 
			
		}

}
