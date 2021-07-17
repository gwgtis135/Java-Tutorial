import java.util.Scanner;


public class main6 {
public static void main(String[] args) {
	

	
	Scanner sc = new Scanner(System.in);
	
	int N,i,j;
	
	
	N = sc.nextInt();
	
	for(i=0;i<N;i++) {
		for(j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	}
}

