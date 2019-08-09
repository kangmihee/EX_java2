package acorn;

// �ڹٿ����� Ŭ������
//1. �������Լ��� ���� Ŭ���� : ������ ����
//2. static�� ���� Ŭ���� : �ν��Ͻ� ���� ȣ���� ����
//3. �Ϲ�Ŭ���� : �ν��Ͻ� �� ȣ�Ⱑ��

public class callby_reference {
	
	public static void m() { }
	public static void m(int i) { i = 99; }
	public static void m(int []arr) { arr[0] = 99; }
	//�迭�� �⺻������ ������ : �������� �����͸� ���� => heap�� ������ �ǰ� �ּҰ�����
	
	public static void main(String[] args) {
		m();
		int i =10; //callby_value
		m(i);
		System.out.println(i); //���:10
		// val�̶�� �������� �ּҰ��� ������ �ְ� �� �ּҸ� ã�� ���� 10
		
		Integer val = new Integer(10); //heap�� ����(heap����������� �ּҰ�����)
		m(val);
		System.out.println(val); //���:10...�ּҰ� �ƴ϶� ������ �޾Ƽ� 10���� ��µ�
		
		int[]arr = {10, 20, 30}; //�迭���� heap�� ������
		m(arr); //arr���� heap�� �ּҰ�����
		System.out.println(arr[0]); //���:99...�ּҰ����� �޾� 99�� ��µ�(�Լ������� ���̺����:callby_reference)
		System.out.println(arr.length); //���:3
		
		SecondUtil.MakeMessage(); //�ٸ�class�� �Լ� ȣ��...Ŭ����ȣ���� �ν��Ͻ� �ʿ���� but static ������� �ʿ������
		ThirUtil th = new ThirUtil(); // ThirUtil Ŭ�������� static ���⶧����...instance => heap �޸𸮸� Ȯ���ϰ� ���డ��
		th.MakeMessage();
		
		
		//����. ������ Ŭ������ ������ �� : �Ϲ� Ŭ������ ������ ��
		//����. add�Լ��� volume�Լ��� ���� Ŭ������ ������ ���� �̸� ȣ���Ͽ�
		//10�� 20�� ���� ����ϰ� ����: 10, ����: 20, ����: 100�� ���Ǹ� ����ϴ� Ŭ������ �ۼ��Ͻÿ�.		
		Volume re = new Volume();
		re.add(10,20);
		re.volume(10,20,100);
		re.factorial(10);
		
	}

}







