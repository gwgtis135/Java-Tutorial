class TestClass{
	void instanceMethod() {}		//�ν��Ͻ� �޼���
	static void staticMethod() {}	//static �޼���
	
	void instanceMethod2() {		//�ν��Ͻ��޼���
		 instanceMethod(); 			//�ٸ� �ν��Ͻ��޼��带 ȣ���Ѵ�.
		 staticMethod(); 			//static�޼��带 ȣ���Ѵ�.
	}
	static void staticMethod2() {	//static �޼���
		instanceMethod();			//����!!!!!!!!!!! �ν��Ͻ��޼��带 ȣ���� �� ����.
		staticMethod(); 			//static�޼���� ȣ�� �� �� �ִ�.
	}
}