package 기본알고리즘;

public class 다중루프 {
	
	//Q12 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요
	//구분석은 | - + 기호를 사용하세요
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}

	}

}


