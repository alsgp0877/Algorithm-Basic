package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class 실습7 {
		public static void main(String[] args) {
			double[] a = {1.0,2.0,3.0,4.0,5.0};
			
			for(int i=0;i<a.length;i++) {
				System.out.println("a["+i+"]="+a[i]);
			}
			double sum =0;
			for(double i : a) {
				sum+=i;
			}
			
			System.out.println("모든요소의 합은"+sum+"입니다.");
		
		}

}
