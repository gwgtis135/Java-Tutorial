
public class Ex6__1 {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel =5;
		t.channelDown();
		t.channelDown();
		
		System.out.println("���� ä����" + t.channel + "�Դϴ�.");

	}

}
class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {	++channel;}
	void channelDown() {--channel;}
	
}
