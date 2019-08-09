package acorn;
//class : �����Լ�, �Ϲ�Ŭ����, static�Լ��� �ִ� Ŭ����
// �ϳ��� ȭ�Ͽ� �������� class�� �������
class Data {int x;} //Ŭ������ �ϳ��� ȭ��...private class�� �ٸ� class���� ���� �Ұ���
//�ڹٿ��� ���� �����ڸ� �������� ������ private - class
//private ������ �ܺ����� ������ �Ұ��� - �Լ��� ���ؼ� ���ٰ���
//������ ��� ���� �����ڸ� ������ ������ public

public class Onefileclass {
	
	//overloading
	static void change(int x){ //�Լ��� �̸��� ����, �Ű������� ������ Ÿ�԰� ����
		x = 100;
		System.out.println("change() : x = " + x ); //���:10
	}
	static void change(Data d){
		d.x = 100;
		System.out.println("change() : x = " + d.x ); //���:100
	}
	
	//�迭������ stack�� ����-�ּҰ�����, ����Ǵ� �����ʹ� heap
	static void change(int[] x){ //�Ű��������޹�� callby_reference, callby_value
		x[0] = 1000;
		System.out.println("change() : x = " + x[0] ); //���:1000
	}

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x );
		int[] x = {10};
		change(d);
		change(x);
		System.out.println("After change(d.x)" );
		System.out.println("main() : x = " + d.x ); //���:100
				
	}
	
	
	

}
