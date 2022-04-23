package 검색;

import java.util.Scanner;
public class Q1for문 {
		
		//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형검색합니다.
		static int seqSearchSen(int[] a, int n, int key) {
			int i=0;
			
			a[n]=key;//보초를 추가
			
			for(i=0;i<n;i++) {
				if(a[i]==key) {
					break;
				}
			}
			
			return i == n ? -1 : i;
		}
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			System.out.print("요솟수:");
			int num = stdIn.nextInt();
			int[] x = new int[num+1];
			
			for(int i=0;i<num;i++) {
				System.out.print("x["+i+"]:");
				x[i]=stdIn.nextInt();
			}
			
			System.out.print("검색할값:");//키값을 입력
			int ky = stdIn.nextInt();
			
			int idx = seqSearchSen(x,num,ky);
			
			if(idx==-1) {
				System.out.print("그 값 요소가 없습니다.");
			}else {
				System.out.print(ky+"은 x["+idx+"]에 있습니다.");
			}
			
		}
		
}
