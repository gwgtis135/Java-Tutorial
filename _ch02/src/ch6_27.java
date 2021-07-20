
class MyMath2 {
	long a, b; 		// iv(인스턴스 변수)

	long add() {	//인스턴스 메서드
		return a+b;
	}

	static long add(long a, long b) {		// 클래스메서드(static메서드) -> iv를 사용x
		return a+b;
	}
}

public class ch6_27 {

	public static void main(String[] args) {

		System.out.println(MyMath2.add(200L, 100l));	//클래스메서드 호출
		MyMath2 mm = new MyMath2();

		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());	//인스턴스메서드 호출, 참조변수 사용 호출 
	}

}
