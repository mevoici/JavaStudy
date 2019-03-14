package ch04;

public class Exam04_02_ {
	public static void main(String[] args) {
		int year = 2019; // 연도
		 /* 코드 작성 */
		if (year % 400 == 0) {
			System.out.println("윤년입니다");
		
		} else if (year % 100 == 0) {
			System.out.println("평입니다");
			
		} else if (year % 4 == 0) {
			System.out.println("윤년입니다");
				
		} else {
			System.out.println("평년입니다");
		}
	}
}
