package _ch01;

import java.util.Arrays;

public class Ex5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,2,3,4};
		int[] arr2 =Arrays.copyOf(arr,arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);		//2,3       4�� ����
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
	}

}
