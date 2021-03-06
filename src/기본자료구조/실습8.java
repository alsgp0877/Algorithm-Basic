package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class 실습8 {
	
		static final int VMAX = 21; //시력분포단위
		
		static class PhyscData{
			String name;//이름
			int height;//키
			double vision;//시력
			//생성자
			PhyscData(String name, int height, double vision){
				this.name= name;
				this.height=height;
				this.vision=vision;
			}
		}
		
		//키의 평균값을 구함
		static double aveHeight(PhyscData[] dat) {
			double sum=0;
			
			for(int i=0;i<dat.length;i++) {
				sum+=dat[i].height;			
			}
			
			return sum/dat.length;
		}
		
		//시력분포를 구함
		static void distVision(PhyscData[] dat, int[] dist) {
			int i=0;
			dist[i]=0;
			for(i=0;i<dat.length;i++) {
				if(dat[i].vision >=0.0 && dat[i].vision<=VMAX/10.0) {//학생시력이 0.0보다 크고 21/10.0(2.1)보다 작다면
					dist[(int)(dat[i].vision*10)]++;//ex)dat[0].vision==0.1->*10->1->dist[1]++;
				}
			}
		}
		
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			PhyscData[] x = {
				new PhyscData("박현규",162,0.3),
				new PhyscData("함진아",173,0.3),
				new PhyscData("최윤미",175,2.0),
				new PhyscData("홍연의",171,1.5),
				new PhyscData("이수진",168,0.4),
				new PhyscData("김영준",174,1.2),
				new PhyscData("박용규",169,0.8),
			};
			
			int[] vdist = new int [VMAX]; //시력분포 0.1~2.0까지 21개의 int형 배열을 만듬
			
			System.out.println("신체검사리스트");
			System.out.println("이름   키  시력");
			System.out.println("----------");
			for(int i=0;i<x.length;i++) {
				System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
			}
			
			System.out.printf("\n평균키:%5.1fcm\n",aveHeight(x));
			
			distVision(x,vdist);//학생배열과 분포배열을 보냄
			
			System.out.println("\n시력분포");
			for(int i=0;i<VMAX;i++) {
				System.out.printf("%3.1f~:%2d명\n",i/10.0,vdist[i]);
			}
			
		}

}
