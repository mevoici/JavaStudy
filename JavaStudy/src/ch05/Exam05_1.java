package ch05;

public class Exam05_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String sep ="";
		
		for (int a = 0; a < arr.length; a++) {
			if (a % 2 == 0) {
				System.out.print(sep + arr[a]);
				sep = ", ";

			}
		}
//		for(int a = 0; a < arr.length; a += 2) {
//			System.out.println(arr[a]);
//		}      //사용 가능한 다른 코드
	}
}
