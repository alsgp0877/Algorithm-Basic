package �⺻�˰���;

import java.util.Scanner;


public class Q11�ڸ������ϱ� {
	
	
	public static void main(String[] args) {
		
		//Q11 ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���
		//135�� �Է��� ��� '�� ���� 3�ڸ��Դϴ�' ��� ����մϴ�.
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int count=0;
		System.out.print("������ �Է��ϼ���:"); 
		a = stdIn.nextInt();
		
		  do {
			  //100/10 - 10
			  //10/10 - 1
			  //1/10 - 0(�������̿��� �Ҽ������� 0�� ���´�.)
			  a = a/10;
		      ++count;
		  }while(a!=0);
		
		System.out.print(count+"�ڸ��Դϴ�.");

	}
	


}


