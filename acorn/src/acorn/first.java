package acorn;

//�����
//��� ���α׷��� �Լ��� �ۼ�
//���������� ����
//������ ���� : ���ǹ�, �ݺ���, �Լ�
//�Լ��� ���ϰ��� �Ű������ ����
// void : ���ϰ��� ����
// static : �����Լ� , static ���� instance �����ʰ� ��밡��
// instance : Ŭ������ �����Ű�� ���� �޸𸮸� ����� ��

public class first {

	public static void main(String[] args) { //���α׷� ������ //�Լ����� 
		
		System.out.println("���ѹα�"); //����������
		System.out.println("�����");
		
		//��������
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10;
		long iLong = 10;
		int tmp = iByte;
		
		//����ȯ : casting...������������ ������Ÿ�� ��ȯ
		byte tmp2 = (byte)iInt;
		
		//�ε��Ҽ��� ǥ��
		float  num1 = 10.1f;
		double num2 = 10.1d;
		double num3 = 10.1;
		
		//���� ���� ������ 90�� 100������ �Է��ϴ� ������ �����ϰ� �μ��� ���ؼ� result ������ �Է�
		//����� average�� �Է�
		//����� ����Ͻÿ�
		
		int kor = 90;
		int eng = 100;		
		int result = kor + eng;
		float average = result/2.0f;		
		System.out.println("��� :"+average);
				
		char ch1 ='a';
		char ch2 ='1'; //���ڿ� ���ڸ� ���� mapping ����1�� 49 ����0�� 48
		System.out.println(ch1);
		System.out.println(ch2);
		
		int code1 =ch1;
		int code2 =ch2;
		System.out.println(code1); // 97:a, 98:b ... ������������ ����
		System.out.println(code2); // 49:1 ... ����1�� 49�ڵ尪����
		
		String name = "�����ܾ�ī����"; //���ڿ�
		System.out.println(name);
		
	
	}

}
