class StaticBlockTest{
	static int[] arr = new int[10];    //����� �ʱ�ȭ

	static {                           // Ŭ���� �ʱ�ȭ �� = �迭 arr�� ������ ä��
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
}