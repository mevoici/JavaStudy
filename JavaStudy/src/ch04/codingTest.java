package ch04;

import java.util.Scanner;

public class codingTest {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��Ͻÿ�. = > ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int num = i;
			while (num > 0) {
				int num1 = num % 10;
				if (num1 == 8) {
					count++;
				}
				num = num / 10;
			}
		}
		System.out.println("8�� ���� : " + count);
	}
}
