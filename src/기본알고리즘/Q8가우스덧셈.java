package �⺻�˰���;

import java.util.Scanner;


public class Q8���콺���� {
	
	//Q8 1����10������ ���� (1+10)*5�� ���� ������� ���� �� �ִ�.
	//���콺�� �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int n= stdIn.nextInt()+1;//4�ϰ�� 
		//{1,2,3,4}
		int sum =0;
		for(int j=1; j<=n; j++) { 
			
			//2+3
			if(j<--n) {
				sum=sum+j+n;
			}
			//3+3
			if(j==n) {
				sum=sum+j;
				break;
			}
			//3+2
			if(j>n) {
				break;
			}
		}

		System.out.print("=" + sum);
	}
	
}


