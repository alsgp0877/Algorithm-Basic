package �⺻�˰���;

import java.util.Scanner;


public class Q9�����Ǹ�������ձ��ϱ� {
	static int sumof(int a, int b) {
		int sum =0;
		
		if(a<b) {
			for(int j=a; j<=b; j++) { 
				sum+=j; 
			}
		}
		
		if(a>b) {
			for(int j=a; j>=b; j--) { 
				sum+=j; 
			}
		}
		
		return sum;

	}
	
	//Q9 ���� a,b �� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���
	//��� ���迡 ������� ���� ���ϼ���(3,5,12 5,3,12)
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���̰�  a�� �Է��ϼ���:");
		int a= stdIn.nextInt();
		System.out.print("���̰�  b�� �Է��ϼ���:");
		int b= stdIn.nextInt();
	

		System.out.print("=" + sumof(a,b));
	}
	
}


