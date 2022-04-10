package �⺻�ڷᱸ��;

import java.util.Scanner;
import java.util.Random;

public class Q10�÷º������׷�������� {
	
		static final int VMAX = 21; //�÷º�������
		
		static class PhyscData{
			String name;//�̸�
			int height;//Ű
			double vision;//�÷�
			//������
			PhyscData(String name, int height, double vision){
				this.name= name;
				this.height=height;
				this.vision=vision;
			}
		}
		
		//Ű�� ��հ��� ����
		static double aveHeight(PhyscData[] dat) {
			double sum=0;
			
			for(int i=0;i<dat.length;i++) {
				sum+=dat[i].height;			
			}
			
			return sum/dat.length;
		}
		
		//�÷º����� ����
		static void distVision(PhyscData[] dat, int[] dist) {
			int i=0;
			dist[i]=0;
			for(i=0;i<dat.length;i++) {
				if(dat[i].vision >=0.0 && dat[i].vision<=VMAX/10.0) {
					dist[(int)(dat[i].vision*10)]++;
					//dist[0]++;->dist[0] �迭 dist�� 0��° ���� 0�� --> 0++ -> 0+1-> 1
				}
			}
		}
		
		public static void main(String[] args) {
			
			Scanner stdIn = new Scanner(System.in);
			
			PhyscData[] x = {
				new PhyscData("������",162,0.3),
				new PhyscData("������",173,0.3),
				new PhyscData("������",175,2.0),
				new PhyscData("ȫ����",171,1.5),
				new PhyscData("�̼���",168,1.2),
				new PhyscData("�迵��",174,0.6),
				new PhyscData("�ڿ��",169,0.8),
			};
			
			int[] vdist = new int [VMAX]; //�÷º��� 0.1~2.0���� 21���� int�� �迭�� ����
			
			System.out.println("��ü�˻縮��Ʈ");
			System.out.println("�̸�   Ű  �÷�");
			System.out.println("----------");
			for(int i=0;i<x.length;i++) {
				System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
			}
			
			System.out.printf("\n���Ű:%5.1fcm\n",aveHeight(x));
			
			distVision(x,vdist);//�л��迭�� �����迭�� ����
			
			//Q10 �÷º����� * �׷����� ����ϵ��� �ٲپ� ���α׷��� �ۼ��ϼ���
			System.out.println("\n�÷º���");
			for(int i=0;i<VMAX;i++) {
				System.out.printf("%3.1f~:",i/10.0);
				for(int j=1;j<=vdist[i];j++) {
					//vdist�迭�� i��° ���� �ױ��ؿ� ����� �ֳĸ� ��Ÿ���� �����̱⵵ �ϱ⶧����
					//�� ���ڸ�ŭ for���� ������ ���� ���� ������
					System.out.print("*");
				}
				
				System.out.printf("\n");
			}
			
		}
		//�ᱹ �迭�� �� ���� �ִ� ��ġ�� �˷��ִ� �ּҰ������̱� ������ �迭�̶�� �帷�� �Ӿ� �׾ȿ� �ִ� ���� ��ġ�� �ȵ�!!
}
