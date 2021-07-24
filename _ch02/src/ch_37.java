class StaticBlockTest{
	static int[] arr = new int[10];    //명시적 초기화

	static {                           // 클래스 초기화 블럭 = 배열 arr을 난수로 채운
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
}