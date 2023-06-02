package day2.review.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*1.콘솔에서 정수 2개와 문자(산술연산자)를 입력받아 출력하는 코드를 작성하세요*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력해주세요.");
		int num2 = sc.nextInt();
		
		System.out.println("산술연산자를 입력해주세요.");
		char op = sc.next().charAt(0);
		
		System.out.println("첫 번째 정수." + num1);
		System.out.println("두 번째 정수." + num2);
		System.out.println("산술연산자" + op);
		
		



	}

}
