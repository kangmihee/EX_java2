package acorn;

public class Volume { //�Ϲ�Ŭ������ �ν��Ͻ� �ʿ�
	
	//add �Լ�
	public void add(int a, int b){
		int sum;
		sum = a+b;
		System.out.println(sum);		
	}
	
	//volume �Լ�
	public void volume(int x, int y, int z){
		int result;
		result = x*y*z;
		System.out.println(result);		
	}
	
	//factorial �Լ�
	public long factorial(int n) { //����Լ��� �̿��� ���丮�� �Լ�
		long result = 0;
		if( n == 1 ){ //���������� �������� ������ ���ѷ����� ������ �����߻� 
			result = 1;
		}else {
			result = n*factorial(n-1);
		}
		return result;
	}
			
}
