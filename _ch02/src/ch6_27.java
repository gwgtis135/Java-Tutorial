
class MyMath2 {
	long a, b; 		// iv(�ν��Ͻ� ����)

	long add() {	//�ν��Ͻ� �޼���
		return a+b;
	}

	static long add(long a, long b) {		// Ŭ�����޼���(static�޼���) -> iv�� ���x
		return a+b;
	}
}

public class ch6_27 {

	public static void main(String[] args) {

		System.out.println(MyMath2.add(200L, 100l));	//Ŭ�����޼��� ȣ��
		MyMath2 mm = new MyMath2();

		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());	//�ν��Ͻ��޼��� ȣ��, �������� ��� ȣ�� 
	}

}
