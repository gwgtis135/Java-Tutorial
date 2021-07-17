package _ch01;

public class Ex5_2_tmp {

	public static void main(String[] args) {
		
		String str = "ABCDE";
		char ch = str.charAt(4);
		System.out.println(ch);

		String str2 = str.substring(1,4);
		String str3 = str.substring(1);		//시작위치는 1~ 끝까지 
		String str4 = str.substring(1,str.length()); //1부터 문자 끝까지
		
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
