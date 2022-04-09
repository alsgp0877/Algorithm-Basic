package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q3배열a의모든요소합계 {
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
			 
			  System.out.println();
			  System.out.println("모든요소의합");
			  System.out.print(sumOf(x));
			  
			
		}

}
