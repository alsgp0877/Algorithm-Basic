package �˻�;

import java.util.Scanner;
public class Q1for�� {
		
		//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� �����˻��մϴ�.
		static int seqSearchSen(int[] a, int n, int key) {
			int i=0;
			
			a[n]=key;//���ʸ� �߰�
			
			for(i=0;i<n;i++) {
				if(a[i]==key) {
					break;
				}
			}
			
			return i == n ? -1 : i;
		}
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			System.out.print("��ڼ�:");
			int num = stdIn.nextInt();
			int[] x = new int[num+1];
			
			for(int i=0;i<num;i++) {
				System.out.print("x["+i+"]:");
				x[i]=stdIn.nextInt();
			}
			
			System.out.print("�˻��Ұ�:");//Ű���� �Է�
			int ky = stdIn.nextInt();
			
			int idx = seqSearchSen(x,num,ky);
			
			if(idx==-1) {
				System.out.print("�� �� ��Ұ� �����ϴ�.");
			}else {
				System.out.print(ky+"�� x["+idx+"]�� �ֽ��ϴ�.");
			}
			
		}
		
}
