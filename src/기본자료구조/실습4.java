package 기본자료구조;

import java.util.Scanner;
import java.util.Random;

public class 실습4 {
		//소수찾기
		//1) for문으로 숫자 하나에 1~1000를 다 비교해서 소수를 찾았다. 나눈셈 횟수 78022
		//2) 소수를 구하는 과정에서 구한소수를 배열에 넣어저장하고 쌓아뒀던 소수에서 나눗셈을 진행한다. 나눗셈 횟수 14622
		//알고리즘을 수정할 경우 -> 1.같은답을 얻는 알고리즘은 하나가 아니다. 2.빠른 알고리즘은 메모리를 많이 요구한다. 
		public static void main(String[] args) {

			 int counter=0;//나눗셈횟수
			 
			 int ptr=0;//찾은 소수의 개수
			 int[] prime = new int[500]; //소수를 저장하는 배열
			 
			 prime[ptr++] = 2; //소수 넣음
			 
			 for(int n=3;n<=1000;n+=2) { //대상은 홀수만
				 int i;
				 for(i=1;i<ptr;i++) {
					 counter++;
					 if(n%prime[i]==0)//나누어떨어지면 소수가아님
						 break;//더이상 반복은 불필요
				 }
				 if(ptr==i) {//마지막까지 나누어떨어지지않음
					 prime[ptr++]=n;//소수라고 배열에 저장
				 }
			 }
			 
			 for(int i=0;i<ptr;i++) {
				 System.out.println(prime[i]);
			 }
			 System.out.println("나눈셈을 수행한 횟수:"+counter);
		}

}
