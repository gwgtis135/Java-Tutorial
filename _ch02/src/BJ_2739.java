import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2739 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bReader.readLine());
		bReader.close();
		
		for(int i =1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}

}
