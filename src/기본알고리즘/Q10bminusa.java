package �⺻�˰���;

import java.util.Scanner;


public class Q10bminusa {
	
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n = 0;
		int sum =0;
		
		//�ǽ�1-6
		//do while
		//����� �Է��ؾ��ϴµ� ����� �ƴ� ���ڸ� �Է��� ��쿡 ���� ��ó
		
		/*
		 * do { System.out.print("������ �Է��ϼ���:"); n= stdIn.nextInt(); }while(n<=0);
		 * 
		 * for(int j=1; j<=n; j++) { sum+=j;
		 * 
		 * }
		 */
		
		//Q10 �κ��� a,b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//�� b<=a�� ��� ���� b�� ���� �ٽ� �Է��ϼ��� 
		
		int a;
		int b;
		
		  do { 
			  System.out.print("������ a�� �Է��ϼ���:"); 
			  a = stdIn.nextInt(); 
			  System.out.print("������ b�� �Է��ϼ���:"); 
			  b = stdIn.nextInt(); 
		  }while(b<=a);
		  
		 
		System.out.print(b-a);

	}
	


}


