package acorn;

class A { //public
	int f;
	A(){
		f = 10;
	}
	void m(){
		System.out.println("f = " + f);
	}
}

public class u2_inheritence extends A{
	int f;
	int f2;
	
	u2_inheritence(){
		f = 100;
		f2 = 200;
	}
	void m2() {
		System.out.println("f2 = " + f);
	}

	public static void main(String[] args) {
		A a = new A();
		a.f++;
		a.m();
//		a.f2++; //���(�ڽ�ȣ��)�Ұ���
//		a.m2(); //���(�ڽ�ȣ��)�Ұ���
		u2_inheritence b = new u2_inheritence();
		b.f++; //���� ������ - ���ǻ������ ����
		b.m();
		b.f2++; //�ڽ��߰�
		b.m2();
	}
}
