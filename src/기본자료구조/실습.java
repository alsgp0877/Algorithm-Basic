package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class 실습 {
	
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
			 * //실습2-1 //배열의 특성확인 int[] a = new int[5]; int[] b = {0,37,51,0,a[1]*2};
			 * a[1]=37; a[2]=51; a[4]=a[1]*2;
			 * 
			 * for(int i=0;i<a.length;i++) { System.out.println("a["+i+"]=" +a[i]); }
			 * for(int i=0;i<b.length;i++) { System.out.println("b["+i+"]=" +b[i]); }
			 */
			  Random rand = new Random();
			  Scanner stdIn = new Scanner(System.in);
			  
			  System.out.println("키의최대값을 구합니다"); 
			  System.out.print("사람 수 :");
			  int num = stdIn.nextInt();
			  
			  int[] height=new int[num];
			  
			  System.out.println("키값 아래와 같습니다.");
			  for(int i=1;i<=num;i++) { 
				  //height[i] = stdIn.nextInt();//요소의 값을 직접입력하여 결정 
				  height[i] = 100 + rand.nextInt(90);//요소의 값을 난수로 결정, 0부터 89(n-1)까지의 난수가 생성된다. 
				  System.out.print("height["+i+"]:"+height[i]);
			  }
			 
			  System.out.println("최댓값은"+maxOf(height)+"입니다"); 
		}

}
