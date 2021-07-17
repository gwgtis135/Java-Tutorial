import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int T = sc.nextInt();
		int A = 0, B=0;
		//int[] intarray = new int[T];
		List<Integer>list = new ArrayList<>();
		for(i=0;i<5;i++) {
			 A = sc.nextInt();
			 B = sc.nextInt();
			 //intarray[i]=A+B;
			 list.add(A+B);
		}
		
		for(int j : list) {
			System.out.println(j);
		}
		
	}

}
