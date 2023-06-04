package day4.review.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		//국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		//성적은 정수.

		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("input scores of Korean, English, Math : ");
		num1 = sc.nextInt(); 
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		System.out.println("The average is " + (num1 + num2 + num3) / 3);
		
		sc.close();
	}

}
