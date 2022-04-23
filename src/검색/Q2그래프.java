package �˻�;

import java.util.Scanner;
public class Q2�׷��� {
		
		//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� �����˻��մϴ�.
		static int seqSearchSen(int[] a, int n, int key) {
			int i=0;
			
			a[n]=key;//���ʸ� �߰�
			
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
			int pl = 0; //�˻����� �� ���� �ε���
			int pr = n-1; // �˻� ���� �ǳ��� �ε���
			
			do {
				int pc = (pl + pr) /2;//�߾ӿ���� �ε���
				if(a[pc]==key)
					return pc;//�˻�����
				else if(a[pc]<key)
					pl=pc+1;//�˻����� ���ʹ����� ����
				else 
					pr=pc -1;//�˻������� ���� ������ ����
			}while(pl<=pr);
			
			return -1;//�˻�����
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
				System.out.println("�� �� ��Ұ� �����ϴ�.");
			}else {
				System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�.");
			}
			int resultSen = seqSearchSen(x,num,ky);
			seqSearchScan(x,num,ky,resultSen);
			binSearch(x,num,ky);
			
		}
		
}
