package �⺻�˰���;

public class Q13����ǥ {
	
	//Q13 ������ �ƴ϶� ������ ����ϴ� ���α׷� �ۼ�
	public static void main(String[] args) {
		
		for(int i=1;i<=1;i++) {
			for(int j=0;j<=9;j++) {
				if(i*j==0) {
					System.out.print("    |");
				}else {
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
				System.out.printf("%3d",i+j);
			}
			System.out.println();
		}

	}

}


