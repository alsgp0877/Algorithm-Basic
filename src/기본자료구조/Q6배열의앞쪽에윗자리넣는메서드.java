package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q6�迭�Ǿ��ʿ����ڸ��ִ¸޼��� {
	
		
	
		//�Է¹��� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ��
		//������ x�� r������ ��ȯ�Ͽ� 
		//�迭d�� �Ʒ��ڸ����� �־��ְ� �ڸ����� ��ȯ�Ѵ�. 
		//Q6�迭�� ���ʿ� �Ʒ��ڸ��� �ƴ϶� ���ڸ��� �־�δ� �޼��带 �ۼ��ϼ��� 
		static int cardConvR(int x, int r, char[] d) {
			int digits = 0; //��ȯ���� �ڸ���
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			//String dchar = "ZYXWVUTSRQPONMLKJIHGFEDCBA9876543210";
			do {
				d[digits++]=dchar.charAt(x%r);
				x/=r;//x�� 0�� �ɶ����� �ݺ�
			}while(x!=0);
			
			return digits;
		}
		
		public static void main(String[] args) {

			 Scanner stdIn = new Scanner(System.in);
			 int no;//��ȯ�ϴ�����
			 int cd;//���
			 
			 int dno;//��ȯ�����ڸ���
			 int retry;//�ٽ��ѹ�?
			 char[] cno = new char[32];//��ȯ�İ��ڸ��� ���ڸ� �־�δ� ������ �迭
			  
			 System.out.println("10������ ��� ��ȯ�մϴ�."); 
			 do {
				 do {
					 System.out.print("��ȯ�ϴ� ���� �ƴ� ����:"); 
					 no= stdIn.nextInt();
				 }while(no<0);
				 
				 do {
					 System.out.print("������� ��ȯ�ұ��?(2~36):"); 
					 cd = stdIn.nextInt();
				 }while(cd<2 || cd>36);
					
				 dno = cardConvR(no,cd,cno);//no�� cd������ ��ȯ;
				 
				 System.out.print(cd+"�����δ�");
				 for(int i=0;i<=dno-1;i++) {//���ڸ��������ʷ� ��Ÿ��
					 System.out.print(cno[i]); 
				 }
				 System.out.println("�Դϴ�"); 
				 
				 System.out.print("�ѹ����ұ��?(1.��/0.�ƴϿ�)"); 
				 retry=stdIn.nextInt();
					 
			 }while(retry==1);
			 
		}

}
