package ch05;

public class Exam05_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		int count = 0;
		
		//�ε����� 2�� ����� ��쿡�� �� �Է�
		for(int i = 0; i <arr.length; i++) {
			if(i % 2==0) {
				arr[i] = i + 10; // 10 12 14 16 18
				sum += arr[i];
				count++;
			}
		}
		
		float avg = 0f;
		
		
		avg = sum / count;
		
		System.out.println("�� : " + sum);
		System.out.println("��� : " + avg);
	}
}
