package �˻�;

import java.util.Scanner;
public class �ǽ� {
	
		//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�. 
		static int binSearch(int[] a, int n, int key) {
			int pl = 0;//�˻������� ù �ε���
			int pr = n-1;//�˻������� �� �ε���
			
			do {
				int pc = (pl+pr)/2; // �߾ӿ���� �ε���
				if(a[pc] == key) {//�˻� ����!
					return pc;
				}else if(a[pc]<key) {//�߾ӿ�Ұ� �˻��ϰ��� �ϴ� ������ �۴ٸ� 
					pl=pc+1;//�˻������� ������ ���� �������� ����, ���� �������� ������ ������. 
					//pl�� ������ ������ �߾ӿ��+1���� ���� ~ pr
				}else {//a[pc]>key
					pr=pc-1;//�˻������� ������ ���� ū������, ���� ������ ������ ������. 
					//pl ~ pr�� ������ ������ �߾ӿ��-1
				}
			}while(pl<=pr);
			
			return -1;
		}
		

		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			System.out.print("��ڼ�:");
			int num = stdIn.nextInt();
			int[] x = new int[num];
			
			System.out.print("������������ �Է��ϼ���");
			System.out.print("x[0]:");//ù����Է�
			x[0]=stdIn.nextInt();
			
			for(int i=1;i<num;i++) {
				do {
				System.out.print("x["+i+"]:");
				x[i]=stdIn.nextInt();
				}while(x[i]<x[i-1]);//�ٷ� �� ��Һ��� ������ �ٽ� �Է� 
			}
			
			System.out.print("�˻��Ұ�:");//Ű���� �Է�
			int ky = stdIn.nextInt();
			
			int idx = binSearch(x,num,ky);
			
			if(idx==-1) {
				System.out.print("�� �� ��Ұ� �����ϴ�.");
			}else {
				System.out.print(ky+"�� x["+idx+"]�� �ֽ��ϴ�.");
			}
			
		}
		
}
