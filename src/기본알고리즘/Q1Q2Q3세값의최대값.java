package �⺻�˰���;

import java.util.Scanner;


public class Q1Q2Q3�������ִ밪 {
	
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
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		
		return max;
		
	}
	
	//Q2 �� ���� �ּҰ��� ���ϴ� min3 �޼��带 �ۼ��ϼ���
	//a,b,c�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�.
	static int min3(int a, int b, int c) {
		
		int min = a;
		if(b<min) min=b;
		if(c<min) min=c;
		
		return min;
	}
	
	//Q3 �� ���� �ּҰ��� ���ϴ� min3 �޼��带 �ۼ��ϼ���
	//a,b,c�� �ִ밪�� ���Ͽ� ��ȯ�մϴ�.
	static int min4(int a, int b, int c,int d) {
			
			int min = a;
			if(b<min) min=b;
			if(c<min) min=c;
			if(d<min) min=d;
			
			return min;
	}
	
	//������ �߾Ӱ� ���ϱ� �ǽ� 1c-1
	static int med3(int a, int b, int c) {
		
		if(a>=b)//a��b���� ũ�ٴ� ������ 
			if(b>=c)//b�� c���� ũ�ٴ� ������
				return b; // a>b>c
			else if(a<=c)//b��c���� �۴ٴ� ������ b<c => a ? c > b 
				return a;// c >= a > b
			else //b��c���� �۰�  a�� c���� ũ�� b<c a>c 
				return c; //a>c>b
		else if(a>c)//a��b���� �۴ٴ� ������  a��c���� ũ�ٴ� ������ a<b a>c
			return a; //b>a>c
		else if(b>c)//a��b���� �۴ٴ� ������  a��c���� �۴� ������ b�� c���� ũ�ٴ� ���� a<b a<c b>c
			return c;//b>c>a
		else
			return b;//a��b���� �۴ٴ� ������  a��c���� �۴� ������ b�� c���� �۴ٴ� ���� a<b a<c b<c
			//c>b>a
	}
	
	
	public static void main(String[] args) {
		//�ǽ�1-1
		Scanner stdIn = new Scanner(System.in);
		int a= stdIn.nextInt();
		int b= stdIn.nextInt();
		int c= stdIn.nextInt();
		
		System.out.println("�ִ���"+max3(a,b,c)+"�Դϴ�.");
		System.out.println("�ּҰ���"+min3(a,b,c)+"�Դϴ�.");
		System.out.println("�ּҰ���"+med3(a,b,c)+"�Դϴ�.");
		
		/*
		 * int d= stdIn.nextInt(); System.out.println("�ִ���"+max4(a,b,c,d)+"�Դϴ�.");
		 * System.out.println("�ִ���"+min4(a,b,c,d)+"�Դϴ�.");
		 */

	}
	


}


