import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char star = '*';
		
		//Scanner sc = new Scanner(System.in);
		int num = 5;
		int i,j;
		
		for(i=0;i<num;i++) {
			for(j=num;j>i;j--) {
			System.out.print(star);

			}
			System.out.println();
		}
	}

}
