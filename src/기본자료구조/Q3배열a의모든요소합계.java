package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q3배열a의모든요소합계 {
	
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
			}
		}
		
		static int sumOf(int[] a) {
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum = sum+a[i];
			}
			
			return sum;
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
			  
			  reverse(x);//배열 a의 요소를 역순으로 정렬
			  
			  System.out.println("역순정렬완료");
			  for(int i=0;i<num;i++) {
				  System.out.print(x[i]);
			  }
			  System.out.println();
			  System.out.println("모든요소의합");
			  System.out.print(sumOf(x));
			  
			
		}

}
