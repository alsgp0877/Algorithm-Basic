package �⺻�˰���;

import java.util.Scanner;

public class Q14���簢�� {
	
	//Q14 �Է��� ���� �Ѻ����� �ϴ� ���簢���� * ��ȣ�� ����ϴ� ���α׷��� �ۼ��ϼ���
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int n= stdIn.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}


