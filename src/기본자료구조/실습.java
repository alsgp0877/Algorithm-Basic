package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class �ǽ� {
	
		static int maxOf(int[] a) {
			int max=a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]>max)
					max=a[i];
			}
			return max;
		}
	
	
		public static void main(String[] args) {
			/*
			 * //�ǽ�2-1 //�迭�� Ư��Ȯ�� int[] a = new int[5]; int[] b = {0,37,51,0,a[1]*2};
			 * a[1]=37; a[2]=51; a[4]=a[1]*2;
			 * 
			 * for(int i=0;i<a.length;i++) { System.out.println("a["+i+"]=" +a[i]); }
			 * for(int i=0;i<b.length;i++) { System.out.println("b["+i+"]=" +b[i]); }
			 */
			  Random rand = new Random();
			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.println("Ű���ִ밪�� ���մϴ�"); 
			  System.out.print("��� �� :");
			  int num = stdIn.nextInt();
			  
			  int[] height=new int[num];
			  
			  System.out.println("Ű�� �Ʒ��� �����ϴ�.");
			  for(int i=1;i<=num;i++) { 
				  //height[i] = stdIn.nextInt();//����� ���� �����Է��Ͽ� ���� 
				  height[i] = 100 + rand.nextInt(90);//����� ���� ������ ����, 0���� 89(n-1)������ ������ �����ȴ�. 
				  System.out.print("height["+i+"]:"+height[i]);
			  }
			 
			  System.out.println("�ִ���"+maxOf(height)+"�Դϴ�"); 
		}

}
