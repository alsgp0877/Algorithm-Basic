package �⺻�˰���;

import java.util.Scanner;

public class Q16�Ƕ�̵� {
	//Q16 n�� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���
	static void spira(int n) {
		//---*---
		//--***--
		//-*****-
		//*******
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {//�׸��� �̰� �տ��� �Ű澲��ȴ� �ڿ��� �Ű�Ἥ..�Ф�
				
				System.out.print('-');
			}
			
			for(int k=0;k<i*2+1;k++) {//���������� �����߾��µ�.. ���ϱ⸦ �������ߴ�..�Ф�
				//1,1+2,1+2+2,...
				//1+(0*2), 1+(1*2), 1+(2*2)
				System.out.print('*');
			}
			
			System.out.println();
		}
	}
	
	//Q16 n�� �����Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���
	static void npira(int n) {
		//---*---
		//--***--
		//-*****-
		//*******
		
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {
				
				System.out.print('-');
			}
			
			for(int k=0;k<i*2+1;k++) {
				
				System.out.print(i+1);
			}
			
			System.out.println();
		}
	}


	

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int n= 0;
		
		do {
			System.out.print("����Դϱ�?:");
			n= stdIn.nextInt();
		}while(n<=0);
		
		spira(n);
		npira(n);

	}

}


