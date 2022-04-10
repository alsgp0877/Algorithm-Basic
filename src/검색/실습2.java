package 검색;

import java.util.Scanner;
public class 실습2 {
	
		static int seqSearch(int[] a, int n, int key) {
			int i=0;
			
			/*
			 * while(true) { 
			 * 	if(i==n) { 
			 * 		return -1;//검색실패(-1을 반환) 
			 * 	} 
			 * 	if(a[i]==key) { 
			 * 		return i;//검색성공(인덱스를반환)
			 *  } 
			 *  	i++; 
			 *  }
			 */
			
			for(i=0;i<n;i++) {
				if(a[i]==key) {
					return i;
				}
			}
			return -1;
		}
		
		//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형검색합니다.
		static int seqSearchSen(int[] a, int n, int key) {
			int i=0;
			
			a[n]=key;//보초를 추가
			
			while(true) {
				if(a[i]==key) {
					break;
				}
				i++;
			}
			return i == n ? -1 : i;//어차피 마지막횟수까지 도는 경우에는 그런값이 없구나..하고 인식하는것은 똑같다 
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
