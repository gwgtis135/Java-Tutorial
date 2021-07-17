package _ch01;

import java.util.Arrays;
import java.util.Iterator;

public class Ex5_1_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		
		for(int i=0;i<strArr.length;i++) {
			int n= (int)(Math.random()*3);
			System.out.println(strArr[n]);
		}

	}

}
