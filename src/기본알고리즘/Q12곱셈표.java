package 기본알고리즘;

public class Q12곱셈표 {
	
	//Q12 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요
	//구분석은 | - + 기호를 사용하세요
	public static void main(String[] args) {
		
		for(int i=1;i<=1;i++) {
			for(int j=0;j<=9;j++) {
				if(i*j==0) {
					System.out.print("    |");
				}else {
					//https://keep-cool.tistory.com/15
					//%3d
					//출력서식 : %[-][0][n][.m]지시자
					//지시자 : %d 정수형식으로 출력 
					//n : 출력할 전체 자리수 지정 %3d 전체자리수가 3인정수
					//0 : n이 지정된 경우 왼쪽의 남는 자리에 0을 출력
					//- : n이 지정된 경우 왼쪽 정렬하고 빈칸에 공백출력
					//.m : 소수점 아래 자리수 지정,
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


