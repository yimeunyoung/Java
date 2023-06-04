package day4.review.homework;

import java.util.Scanner;

public class TriangleEx {

	public static void main(String[] args) {
		/* 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 작성하세요.
		* 세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		* input 3 integer num : 
		* 1 2 3 
		* Unable to create triangle.
		* input 3 integer num : 
		* 2 2 3 
		* Able to create triangle.
		* */
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 integer num : ");
		num1 = sc.nextInt(); 
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if((num1 + num2) > num3) {
			System.out.println("Able to create triangle. ");	
		}
		else if((num1 + num2) < num3) {
			System.out.println("Unable to create triangle. ");	
		}
			
		sc.close();
	}

}
