package �˻�;

import java.util.Scanner;
public class �ǽ�2 {
	
		static int seqSearch(int[] a, int n, int key) {
			int i=0;
			
			/*
			 * while(true) { 
			 * 	if(i==n) { 
			 * 		return -1;//�˻�����(-1�� ��ȯ) 
			 * 	} 
			 * 	if(a[i]==key) { 
			 * 		return i;//�˻�����(�ε�������ȯ)
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
		
		//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� �����˻��մϴ�.
		static int seqSearchSen(int[] a, int n, int key) {
			int i=0;
			
			a[n]=key;//���ʸ� �߰�
			
			while(true) {
				if(a[i]==key) {
					break;
				}
				i++;
			}
			return i == n ? -1 : i;//������ ������Ƚ������ ���� ��쿡�� �׷����� ������..�ϰ� �ν��ϴ°��� �Ȱ��� 
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
