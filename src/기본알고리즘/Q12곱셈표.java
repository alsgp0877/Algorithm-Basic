package �⺻�˰���;

public class Q12����ǥ {
	
	//Q12 ���ʰ� ���ʿ� ���ϴ� ���� �ִ� ����ǥ�� ����ϴ� ���α׷��� �ۼ��ϼ���
	//���м��� | - + ��ȣ�� ����ϼ���
	public static void main(String[] args) {
		
		for(int i=1;i<=1;i++) {
			for(int j=0;j<=9;j++) {
				if(i*j==0) {
					System.out.print("    |");
				}else {
					//https://keep-cool.tistory.com/15
					//%3d
					//��¼��� : %[-][0][n][.m]������
					//������ : %d ������������ ��� 
					//n : ����� ��ü �ڸ��� ���� %3d ��ü�ڸ����� 3������
					//0 : n�� ������ ��� ������ ���� �ڸ��� 0�� ���
					//- : n�� ������ ��� ���� �����ϰ� ��ĭ�� �������
					//.m : �Ҽ��� �Ʒ� �ڸ��� ����,
					System.out.printf("%3d",i*j);
				}
			}
			System.out.println();
		}
		
		System.out.print("----+-------------------------------");
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%3d",i);
			System.out.print(" |");
			
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}

	}

}


