import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BJ_10871 {

	public static void main(String[] args)  throws IOException	{
		
	
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N,X;
		N = Integer.parseInt(br.readLine());
		X = Integer.parseInt(br.readLine());
		
		System.out.println(N);
		System.out.println(X);
		
		
		int[] IntArray = new int[N];
		
		for(int i=0;i<N;i++) {
			IntArray[i] = Integer.parseInt(br.readLine());
		}
		for(int j=0;j<N;j++) {
			
			if(IntArray[j]<X) {
				
		
				System.out.print(IntArray[j]+" ");
				  }
		}
		
		
	}

}
