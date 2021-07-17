import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;



public class star {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			int b=0;
			int i,j,k;
			int a = Integer.parseInt(br.readLine());
			br.close();
			
			b = a/2;

			
		for( i=0;i<a;i++) {
			for( j=1;j<a-i;j++) {
				
					System.out.print(" ");
			}
			for (k=0;k<i*2+1;k++) {
					System.out.print("*");

			}
							
			
			System.out.println();
		}

	}
}
