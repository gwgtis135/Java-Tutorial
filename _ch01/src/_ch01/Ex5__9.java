package _ch01;

import java.util.Arrays;

public class Ex5__9 {

	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int korsum=0, engsum=0, mathsum=0;
		int sum =0;
		float average = 0.0f;
		
		
		System.out.println("¹øÈ£  ±¹¾î   ¿µ¾î  ¼öÇÐ  ÃÑÁ¡  Æò±Õ");
		System.out.println("==============================");

		for (int i = 0; i < score.length; i++) {
			sum =0;
			System.out.printf("%3d", i + 1);
			
			korsum += score[i][0];
			engsum += score[i][1];
			mathsum += score[i][2];
			
			for (int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
							 
				System.out.printf("%5d", score[i][j]);
				}
			average = sum/(float)score.length;
			System.out.printf("%5d %6.1f",sum,average);
			System.out.println();
			}
		
		System.out.println("==============================");
		System.out.printf("ÃÑÁ¡: %5d %5d %5d",korsum,engsum,mathsum);
	}
}
