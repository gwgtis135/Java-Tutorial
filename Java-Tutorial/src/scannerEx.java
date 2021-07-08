import java.util.*;		//scanner클래스를 사용하기 위해 추가
public class scannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	//scansser클래스의 객체를 생성
		
		System.out.println("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();		//입력받은 내용을 input에 저장
		int num = Integer.parseInt(input);		//입력받은 내용을 int타입의 값으로 변한
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n",num);

	}

}
