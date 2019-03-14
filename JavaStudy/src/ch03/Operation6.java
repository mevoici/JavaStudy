package ch03;

import java.util.Scanner;

public class Operation6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("영문자를 입력해주세요.");
		String txt = s.next();
		System.out.println(txt);

		char txt2 = txt.charAt(0);
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <='z' || txt2 >= 'A' && txt2 <= 'Z';
		
		System.out.println(isCorrect);
	}
}
