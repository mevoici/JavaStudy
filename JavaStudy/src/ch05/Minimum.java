package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = {10, 44, 3, 1, 99 };
		
		int temp = Integer.MAX_VALUE; //�ڹٿ��� �����ϴ� �ִ밪 ���̺귯��?
		
		for(int i =0; i < nums.length; i++) {
			if (temp > nums[i]) {
			temp = nums[i];
			}
		}
		System.out.println(temp);
	}
}
