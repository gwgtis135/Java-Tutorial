import java.util.*;		//scannerŬ������ ����ϱ� ���� �߰�
public class scannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	//scansserŬ������ ��ü�� ����
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���.>");
		String input = scanner.nextLine();		//�Է¹��� ������ input�� ����
		int num = Integer.parseInt(input);		//�Է¹��� ������ intŸ���� ������ ����
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n",num);

	}

}
