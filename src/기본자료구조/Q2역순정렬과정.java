package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q2�������İ��� {
	
		//�迭��� a[idx1]�� a[idx2]�� ���� �ٲ�
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
			 
		}
		//�迭a�� ��Ҹ�  �������� ����
		static void reverse(int[] a) {
			for(int i=0;i<a.length/2;i++) {
				swap(a,i,a.length-i-1);
				System.out.println("a["+i+"]�� a["+((a.length-i)-1)+"]�� ��ȯ�մϴ�.");
				for(int j=0;j<a.length;j++) {
					  System.out.print(a[j]);
				}
				System.out.println();
			}
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
			  
			  for(int i=0;i<num;i++) {
				  System.out.print(x[i]);
			  }
			  System.out.println(); 
			  
			  reverse(x);//�迭 a�� ��Ҹ� �������� ����
			  System.out.println("���������� ���ƽ��ϴ�."); 
			
		}

}
