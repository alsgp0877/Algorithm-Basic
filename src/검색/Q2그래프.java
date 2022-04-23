package 검색;

import java.util.Scanner;
public class Q2그래프 {
		
		//요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형검색합니다.
		static int seqSearchSen(int[] a, int n, int key) {
			int i=0;
			
			a[n]=key;//보초를 추가
			
			for(i=0;i<n;i++) {
				if(a[i]==key) {//a[0](==1) == 3
					break;
				}
			}
			
			return i == n ? -1 : i;
		}
		
		static void seqSearchScan(int[] a, int n, int key, int resultSen) {
			System.out.print("  ");
			for(int j=0;j<n;j++) {
				System.out.printf("%2d",j);
			}
			System.out.println();
			System.out.println("-+------------");
			for(int i=0;i<=resultSen;i++) {
				System.out.print(i+"|");
				for(int j=0;j<n;j++) {
					if(a[i] == a[j]) {
						System.out.printf("("+a[j]+")");
					}else {
						System.out.printf("%2d",a[j]);
					}
					
				}
				System.out.println();
			}
		}
		
		static int binSearch(int[] a, int n, int key) {
			int pl = 0; //검색범위 맨 앞의 인덱스
			int pr = n-1; // 검색 범위 맨끝의 인덱스
			
			do {
				int pc = (pl + pr) /2;//중앙요소의 인덱스
				if(a[pc]==key)
					return pc;//검색성공
				else if(a[pc]<key)
					pl=pc+1;//검색범위 뒷쪽반으로 좁힘
				else 
					pr=pc -1;//검색범위를 앞쪽 반으로 좁힘
			}while(pl<=pr);
			
			return -1;//검색실패
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
				System.out.println("그 값 요소가 없습니다.");
			}else {
				System.out.println(ky+"은 x["+idx+"]에 있습니다.");
			}
			int resultSen = seqSearchSen(x,num,ky);
			seqSearchScan(x,num,ky,resultSen);
			binSearch(x,num,ky);
			
		}
		
}
