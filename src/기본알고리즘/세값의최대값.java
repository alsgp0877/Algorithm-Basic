package �⺻�˰���;

import java.util.Scanner;


public class �������ִ밪 {
	
	//1-2
	//a,b,c�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�.
	static int max3(int a, int b, int c) {
		
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max;
	}
	
	//Q1 �� ���� �ִ밪�� ���ϴ� max4 �޼��带 �ۼ��ϼ���
	//a,b,c�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�.
	static int max4(int a, int b, int c, int d) {
		
		
	}
	
	//Q2 �� ���� �ּҰ��� ���ϴ� min3 �޼��带 �ۼ��ϼ���
	//a,b,c�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�.
	static int min3(int a, int b, int c) {
		
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max;
	}
	
	public static void main(String[] args) {
		//�ǽ�1-1
		Scanner stdIn = new Scanner(System.in);
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		int d= stdIn.nextInt();
		
		System.out.println("�ִ���"+max3(a,b,c)+"�Դϴ�.");
		System.out.println("�ִ���"+max4(a,b,c,d)+"�Դϴ�.");
	}
	


}


