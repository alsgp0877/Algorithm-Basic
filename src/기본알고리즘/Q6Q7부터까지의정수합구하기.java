package �⺻�˰���;

import java.util.Scanner;


public class Q6Q7���ͱ����������ձ��ϱ� {
	
	
	public static void main(String[] args) {
		//�ǽ�1-3
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int n= stdIn.nextInt();
		
		int sum =0;
		int i=1;
		
		//�ǽ�1-4
		/*
		 * while(i<=n) { sum+=i; i++; //Q6 ���� i�� ���� n+1�� ���� Ȯ���ϼ��� System.out.println(i);
		 * }
		 */
		
		//�ǽ�1-5
		//Q7 n�� 7�̸� 1+2+3+4+5+6+7=28�� ����ϴ� ���α׷��� �ۼ��ϼ���
		for(int j=1; j<=n; j++) { 
			sum+=j; 
			if(j<n){
				System.out.print(j+ "+");
			}
			if(j==n) {
				System.out.print(j+"=");
			}
		}

		System.out.print(sum);

	}
	


}


