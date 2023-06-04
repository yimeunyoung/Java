package day4.review.ifex;

public class NumberEx {

	public static void main(String[] args) {
		/* 정수 num가 양수이면 positive number라고 출력하고
		 * num가 음수이면 nagative umber로 출력하고
		 * num가 0이면 0으로 출력하는 코드를 작성하세요.
		 * day3.practice EX3와 비슷한 문제이지만 해당 풀이는 if -else if -else로 풀이
		 */
		
		int num = -1;
		if(num > 0) {
			System.out.println(num + " is a positive number. ");
		}
		else if(num < 0) {
			System.out.println(num + " is a nagative number. ");
		}
		else {
			System.out.println(0);
		}

	}

}
