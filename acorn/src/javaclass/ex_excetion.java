package javaclass;

public class ex_excetion {

	public static void main(String[] args) {
		//������ try���� ����ϴ� �͵� ����
		try { //crawling : naver
			//int data = 100 / 0;
			int a[] = new int[5];
			//a[5] = 30/0; //�۵�x
			  a[4] = 30/0; //�۵�o
		}
		
		// ��ӱ����� �̷���� ����
		// throwable �ֻ��� ������Ʈ
		// Exception / Error
		// RuntimeException
		
		catch(ArithmeticException e) { System.out.println(e); }
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}			
		catch(Exception e) { System.out.println(e); }
		
		// �ý��� �ڿ��� �䱸�ϴ� ����� �����ϱ� ���� ���
		// ���Ͽ����� �ݵ�� colse����� �� == os�� �δ��ְ�
		// �ڹٿ��� �����ͺ��̽��� ����(20�� ����)
		finally {System.out.println("finally block os always executed");}
		
		
		
		// ����ó����
		// 1)��ӵǾ�� �Ѵ�
		// 2)������ ��ü���� �ͺ��� �����ؾ��Ѵ�.
		// 3)Exception�� ArithmeticException ���� �ڿ� �;��Ѵ�
		// 4)ArithmeticException �� ����ڰ� ������ ���ܸ� �߻���Ų��.
	}
	

}
