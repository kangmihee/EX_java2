package javaclass;

public class ex_throw {
	static void validate(int age){
		if(age<18)
			throw new ArithmeticException("�������� �ʽ��ϴ�.");
		else
			System.out.println("��ǥ��������");
	}
	public static void main(String[] args) {
		try {
			validate(13); //18���� ū�� �Է��ϸ� ����ó��x
		}
		catch(Exception m) {System.out.println("Exception �߻�");}
	}

}
