package �⺻�˰���;

import java.util.Scanner;


public class �����Ǵܰ��б� {
	
	
	public static void main(String[] args) {
		//�ǽ�1-3
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int n= stdIn.nextInt();
		
		if(n>0)
			System.out.print("�̼��� ����Դϴ�.");
		else if(n<0)
			System.out.print("�̼��� �����Դϴ�.");
		else
			System.out.print("�̼��� 0�Դϴ�.");

	}
	


}


