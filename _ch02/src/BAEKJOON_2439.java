import java.util.Scanner;

public class BAEKJOON_2439 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char star = '*';
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,j,k;
		
		for(i=0;i<num;i++) {
			for(j=num;j>i+1;j--) {
			System.out.print(" ");
			}
			for(k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
