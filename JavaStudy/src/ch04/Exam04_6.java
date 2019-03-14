package ch04;

public class Exam04_6 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			int space = 5 - i;
			for (int j = 1; j <= 5; j++) {
				if(space < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}