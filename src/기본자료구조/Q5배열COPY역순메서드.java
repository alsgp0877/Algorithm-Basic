package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q5�迭COPY�����޼��� {
	
		static void swap(int[] b, int idx1, int idx2) {
			int t = b[idx1];
			b[idx1] = b[idx2];
			b[idx2] = t;
			 
		}
	
		//�迭b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� rcopy�� �ۼ��ϼ���
		static void rcopy(int[] a, int[] b) {
			if(a.length == b.length) {
				for(int i=0;i<b.length/2;i++) {
					swap(b,i,b.length-i-1);
				}
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
			 
			  rcopy(a,b);
			
		}

}
