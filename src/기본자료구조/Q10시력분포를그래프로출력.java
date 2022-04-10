package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class Q10시력분포를그래프로출력 {
	
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
				if(dat[i].vision >=0.0 && dat[i].vision<=VMAX/10.0) {
					dist[(int)(dat[i].vision*10)]++;
					//dist[0]++;->dist[0] 배열 dist의 0번째 값은 0임 --> 0++ -> 0+1-> 1
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
				new PhyscData("이수진",168,1.2),
				new PhyscData("김영준",174,0.6),
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
			
			//Q10 시력분포를 * 그래프로 출력하도록 바꾸어 프로그램을 작성하세요
			System.out.println("\n시력분포");
			for(int i=0;i<VMAX;i++) {
				System.out.printf("%3.1f~:",i/10.0);
				for(int j=1;j<=vdist[i];j++) {
					//vdist배열의 i번째 값이 그기준에 몇명이 있냐를 나타내는 숫자이기도 하기때문에
					//그 숫자만큼 for문을 돌리면 별을 찍을 수있음
					System.out.print("*");
				}
				
				System.out.printf("\n");
			}
			
		}
		//결국 배열은 그 값이 있는 위치를 알려주는 주소같은거이기 때문에 배열이라는 장막에 속아 그안에 있는 값을 놓치면 안됨!!
}
