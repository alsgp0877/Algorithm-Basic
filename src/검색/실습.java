package 검색;

import java.util.Scanner;
public class 실습 {
	
		//요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다. 
		static int binSearch(int[] a, int n, int key) {
			int pl = 0;//검색범위의 첫 인덱스
			int pr = n-1;//검색범위이 끝 인덱스
			
			do {
				int pc = (pl+pr)/2; // 중앙요소의 인덱스
				if(a[pc] == key) {//검색 성공!
					return pc;
				}else if(a[pc]<key) {//중앙요소가 검색하고자 하는 값보다 작다면 
					pl=pc+1;//검색범위를 좁히기 위해 작은수는 제거, 뒤쪽 절반으로 범위를 좁힌다. 
					//pl의 범위의 시작을 중앙요소+1부터 시작 ~ pr
				}else {//a[pc]>key
					pr=pc-1;//검색범위를 좁히기 위해 큰수제거, 앞쪽 절번의 범위로 좁힌다. 
					//pl ~ pr의 범위의 시작을 중앙요소-1
				}
			}while(pl<=pr);
			
			return -1;
		}
		

		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			System.out.print("요솟수:");
			int num = stdIn.nextInt();
			int[] x = new int[num];
			
			System.out.print("오름차순으로 입력하세요");
			System.out.print("x[0]:");//첫요소입력
			x[0]=stdIn.nextInt();
			
			for(int i=1;i<num;i++) {
				do {
				System.out.print("x["+i+"]:");
				x[i]=stdIn.nextInt();
				}while(x[i]<x[i-1]);//바로 앞 요소보다 작으면 다시 입력 
			}
			
			System.out.print("검색할값:");//키값을 입력
			int ky = stdIn.nextInt();
			
			int idx = binSearch(x,num,ky);
			
			if(idx==-1) {
				System.out.print("그 값 요소가 없습니다.");
			}else {
				System.out.print(ky+"은 x["+idx+"]에 있습니다.");
			}
			
		}
		
}
