package acorn;

//�ϳ��� ȭ�Ͽ� ��Ģ������ �ϴ� �ϴ� Ŭ������ �����ϰ� �� Ŭ������ �̿��ؼ� 5L, 3L�� ���� +,-,*,/�� ������ �� �� ���� ����Ͻÿ�
public class oper {
	long add(long x, long y){
		long addresult=0;
		addresult = x+y;
		return addresult;
	}
	long subtrat(long x, long y){
		return x-y;
	}
	long multiply(long x, long y){
		return x*y;
	}
	long divide(long x, long y){
		return x/y;
	}

	public static void main(String[] args) {
		oper op = new oper();
		long result1 = op.add(5L, 3L);
		long result2 = op.subtrat(5L, 3L);
		long result3 = op.multiply(5L, 3L);
		double result4 = op.divide(5L, 3L);
		
		//�ٸ����꿡 Ȱ���ϰ��� �� ��� ����� ������ �޾Ƽ� ���
		System.out.println("add(5L, 3L): " + result1); //���:
		System.out.println("subtrat(5L, 3L): " + result2); //���:2
		System.out.println("multiply(5L, 3L): " + result3); //���:15
		System.out.println("divide(5L, 3L): " + result4); //���:1.0
		
		//���� ��¸� �ʿ��� ���
		System.out.println("add(5L, 3L): " + op.add(5L, 3L)); //���:8
		System.out.println("subtrat(5L, 3L): " + op.subtrat(5L, 3L)); //���:2
		System.out.println("multiply(5L, 3L): " + op.multiply(5L, 3L)); //���:15
		System.out.println("divide(5L, 3L): " + op.divide(5L, 3L)); //���:1

	
	}

}
