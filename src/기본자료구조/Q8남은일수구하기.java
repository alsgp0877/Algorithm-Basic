package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q8남은일수구하기 {
		//각 달의 일수 
		static int[][] mdays= {
				 {31,28,31,30,31,30,31,31,30,31,30,31},//평년 0
				 {31,29,31,30,31,30,31,31,30,31,30,31},//윤년 1
		};
		
		//서기 year년은 윤년인가?(윤년 :1/평년:0)
		static int isLeap(int year) {
			return (year%4==0 && year%100 !=0 || year%400==0)?1:0;
		}
		//서기 y년 m월 d일의 그 해 경과 일 수를 구함
		static int dayOfYear(int y, int m, int d) {
			 int month= m-1;//ex) 3월일경우 해당월의 일수는 이미 d로 가져왔으니까 -1해서 2월부터 계산한다.
			 while(month>0) { 
				d+=mdays[isLeap(y)][month-1]; 
				month--;//월을하나씩 빼면서 그월의 일수를 더해준다. 
			 }
			 return d;
			 
		}
		
		//Q9 Y년 M월 D일의 그 해 남은 일수(12월31일이면 0, 12월30일이면 1)를 구하는 메서드를 작성하세요
		static int leftDayOfYear(int y, int m, int d) {
			 int month= m-1;//ex) 3월일경우 해당월의 일수는 이미 d로 가져왔으니까 -1해서 2월부터 계산한다.
			 while(month>0) { 
				d+=mdays[isLeap(y)][month-1]; 
				month--;//월을하나씩 빼면서 그월의 일수를 더해준다. 
			 }

			 int left = isLeap(y)==1? 366-d : 365-d;
			 return left;
			 
		}
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			int retry;
			
			System.out.println("그해 경과 일수를 구합니다");
			
			do {
				System.out.print("년:");
				int year = stdIn.nextInt();
				System.out.print("월:");
				int month = stdIn.nextInt();
				System.out.print("일:");
				int day = stdIn.nextInt();
				
				System.out.printf("그 해 %d일째 입니다.\n",dayOfYear(year,month,day));
				System.out.printf("그 해 %d일 남았습니다.\n",leftDayOfYear(year,month,day));
				
				System.out.print("한번더할까요?(1.예/0.아니오):");
				retry = stdIn.nextInt();
			}while(retry==1);
		}

}
