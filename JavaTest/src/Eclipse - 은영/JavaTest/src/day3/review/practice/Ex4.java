package day3.review.practice;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//정수 num를 입력받아서 num가 홀수인지 짝수인지 판별하는 코드를 작성하세요.
		//num를 2로 나누었을 때 나머지가 0이 아니면 odd number(홀수) 라고 출력하고
		//num를 2로 나누었을 때 나머지가 0이면 even number(짝수)라고 출력
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		//나머지를 구하는 거니까 '%(mod)' 사용
		if(num % 2 != 0) {
			System.out.println(num + " is an odd number. ");
		}
		if(num % 2 == 0) {
			System.out.println(num + " is an even number. ");
		}
		
		sc.close();
		
	}

}
