package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q4�迭COPY�޼��� {
	
		//�迭b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼���copy�� �ۼ�
		static void copy(int[] a, int[] b) {
			if(a.length == b.length) {
				for(int i=0;i<a.length;i++) {
					a[i]=b[i];
				}
				System.out.println("copy��ü �迭b");
				for(int i=0;i<b.length;i++) {
					System.out.print(+b[i]); 
				}
				System.out.println();
				
				System.out.println("copy�� �迭a");
				for(int i=0;i<a.length;i++) {
					System.out.print(+a[i]); 
				}
			}else {
				System.out.println("�迭��ڼ��� ���� �ʾ� �����Ҽ������ϴ�.");
			}
			
		}
	
	
		public static void main(String[] args) {

			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.print("�迭b�� ��ڼ�:"); 
			  int nb = stdIn.nextInt();
			  
			  int[] b=new int[nb];
			  
			  for(int i=0;i<nb;i++) { 
				  System.out.print("b["+i+"]:");
				  b[i] = stdIn.nextInt();
				  
			  }
			  
			  System.out.print("�迭a�� ��ڼ�:"); 
			  int na = stdIn.nextInt();
			  
			  int[] a=new int[na];
			 
			  copy(a,b);
			
		}

}
