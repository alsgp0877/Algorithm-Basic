package �⺻�˰���;

import java.util.Scanner;

public class Q15�����̵�ﰢ����� {
	static void triangleLB(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		//*****
		//****
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		//n=5
		//*****
		// ****
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		//n�� 4�̸� 
		//*
		for(int i=n-1;i>=0;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print('-');
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	//Q15 �����̵ �ﰢ���� ����ϴ� �κ��� �޼��� �������� �ۼ��ϼ���
	//���� ��, ������ ��, ������ �Ʒ��� ������ �̵ �ﰢ���� ����ϴ� �޼��� �ۼ�
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int n= 0;
		
		do {
			System.out.print("��ܻﰢ���Դϱ�?:");
			n= stdIn.nextInt();
		}while(n<=0);
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�");
		triangleLB(n);
		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�");
		triangleLU(n);
		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�");
		triangleRU(n);
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�");
		triangleRB(n);

	}

}


