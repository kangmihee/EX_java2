package acorn;

public class static_nonstatic { //����� ���� ������Ÿ��
	int a; //�޸� ������ Ȯ�� : ��������뷮, �Լ��� �ѹ��� Ȯ��
	int b;
	String name;

	public static void main(String[] args) { // ������ �Լ�
		static_nonstatic fun = new static_nonstatic();  // �Լ�1���� �޸� Ȯ��(���� a,b,name) �Լ����������� ���� �ٸ�(�ߺ�x)
		static_nonstatic fun2 = new static_nonstatic(); // �޸�Ȯ��
		static_nonstatic fun3 = new static_nonstatic(); // �޸�Ȯ��
		System.out.println("���α׷� ���� �� �Լ� ȣ��");
		fun.staticMethod1(); //����� �����ʹ� �ٸ��� ȣ��Ǵ� �Լ��� ����.
		fun2.staticMethod1();
		System.out.println("�������� ����");
		System.out.println("10���丮���� ��� =" + fact(10));
		System.out.println("10���丮���� ��� =" + fun.fact(10));
	}
	
	void staticMethod1() { //�Ϲ��Լ� : �ν��Ͻ�
		System.out.println("ù �Լ� ���� ");
		staticMethod2(); //�ι�° �Ϲ��Լ� ȣ��
		System.out.println("�ι�° �Լ� ȣ�� ����");
	}
	
	void staticMethod2() {
		System.out.println("�ι�° �Լ� ���� ");
		System.out.println("�ι�° �Լ� ȣ��");
		System.out.println("�ι�° �Լ� ���� ");
	}
	
	public static int fact(int number){ //�����Լ�
		if(number == 0)
			return (1);
		return (number * fact(number-1) );
	}
}
