import java.util.Scanner;


public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int i;
		
		int[] IntArray = new int[num];
		
		for(i=0;i<num;i++) {
			IntArray[i]  = sc.nextInt();	
		}
		
		for(i=0;i<num;i++) {
			if (num2>IntArray[i]) {
				System.out.print(IntArray[i]+" ");
			}
		}
	}
}
		
		


