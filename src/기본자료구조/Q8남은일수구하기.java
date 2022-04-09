package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q8�����ϼ����ϱ� {
		//�� ���� �ϼ� 
		static int[][] mdays= {
				 {31,28,31,30,31,30,31,31,30,31,30,31},//��� 0
				 {31,29,31,30,31,30,31,31,30,31,30,31},//���� 1
		};
		
		//���� year���� �����ΰ�?(���� :1/���:0)
		static int isLeap(int year) {
			return (year%4==0 && year%100 !=0 || year%400==0)?1:0;
		}
		//���� y�� m�� d���� �� �� ��� �� ���� ����
		static int dayOfYear(int y, int m, int d) {
			 int month= m-1;//ex) 3���ϰ�� �ش���� �ϼ��� �̹� d�� ���������ϱ� -1�ؼ� 2������ ����Ѵ�.
			 while(month>0) { 
				d+=mdays[isLeap(y)][month-1]; 
				month--;//�����ϳ��� ���鼭 �׿��� �ϼ��� �����ش�. 
			 }
			 return d;
			 
		}
		
		//Q9 Y�� M�� D���� �� �� ���� �ϼ�(12��31���̸� 0, 12��30���̸� 1)�� ���ϴ� �޼��带 �ۼ��ϼ���
		static int leftDayOfYear(int y, int m, int d) {
			 int month= m-1;//ex) 3���ϰ�� �ش���� �ϼ��� �̹� d�� ���������ϱ� -1�ؼ� 2������ ����Ѵ�.
			 while(month>0) { 
				d+=mdays[isLeap(y)][month-1]; 
				month--;//�����ϳ��� ���鼭 �׿��� �ϼ��� �����ش�. 
			 }

			 int left = isLeap(y)==1? 366-d : 365-d;
			 return left;
			 
		}
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			int retry;
			
			System.out.println("���� ��� �ϼ��� ���մϴ�");
			
			do {
				System.out.print("��:");
				int year = stdIn.nextInt();
				System.out.print("��:");
				int month = stdIn.nextInt();
				System.out.print("��:");
				int day = stdIn.nextInt();
				
				System.out.printf("�� �� %d��° �Դϴ�.\n",dayOfYear(year,month,day));
				System.out.printf("�� �� %d�� ���ҽ��ϴ�.\n",leftDayOfYear(year,month,day));
				
				System.out.print("�ѹ����ұ��?(1.��/0.�ƴϿ�):");
				retry = stdIn.nextInt();
			}while(retry==1);
		}

}
