package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q3�迭a�Ǹ�����հ� {
		static int sumOf(int[] a) {
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum = sum+a[i];
			}
			
			return sum;
		}
	
		public static void main(String[] args) {

			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.print("��ڼ�:"); 
			  int num = stdIn.nextInt();
			  
			  int[] x=new int[num];
			  
			  for(int i=0;i<num;i++) { 
				  System.out.print("x["+i+"]:");
				  x[i] = stdIn.nextInt();
				  
			  } 
			 
			  System.out.println();
			  System.out.println("���������");
			  System.out.print(sumOf(x));
			  
			
		}

}
