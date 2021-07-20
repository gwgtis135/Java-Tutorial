package _ch01;

import java.util.Arrays;

public class Ex5_26 {

	public static void main(String[] args) {
			
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"ccc","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arrr = {0,4,1,5,2};
		System.out.println(Arrays.toString(arrr));

		Arrays.sort(arrr);
		System.out.println(Arrays.toString(arrr));
		
		
		
	}

}
