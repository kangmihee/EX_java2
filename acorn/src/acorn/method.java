package acorn;
import java.util.Scanner;

public class method {
	int a = 100; //�Լ��ۿ� ����� ����:�������

	public static void main(String[] args) { //main�� �������Լ�...ó�����ν����
		int a = 10;
		int b = 20;
		int result = add(a,b);
		System.out.println("�����: " + result );	
		
	    int x; int y; int z;	      	
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		System.out.println("���Ǵ�: " + volume(x,y,z));
		
		f('c'); //���:f(char)
		byte i = 2;
		f(i);//���:f(int)
		short j =2;
		f(j);//���:f(int)
		f(2);//���:f(int)
		f(2L);//���:f(long)
		
	}
	
	//overloading
	static void f(char c) {System.out.println("f(char)");}
	static void f(int i) {System.out.println("f(int)");}
	static void f(long c) {System.out.println("f(long)");}
	
	
	//����. �غ�, ����, ���̸� �Է¹޾Ƽ� ������ ����ϴ� �Լ��� �ۼ��ϰ�
	//�غ�:10, ����:20, ����:30 �� ������ ����Ͻÿ�.
	public static int volume(int x, int y, int z){
		int result;		
		result = x * y * z;		
		return result;		
	}
	
	
	//����. �μ��� �Է¹޾Ƽ� �������� ���� ��ȯ�ϴ� �Լ��� �ۼ��Ͻÿ�.
	public static void change(int x, int y){
		//i=i+1 => ����⿡ ���� ����
		int temp; //�ӽú���		
		temp = x;
		x = y;
		y = temp;		
	}
	
	public static int add(int a, int b){ // static : �ν��Ͻ� �����ʰ� ���
		int result;		
		result = a + b;
		f('c'); //static�Լ��� ���� ȣ���� �����ϴ�
		return result;		
	}
		
	
	
	
	
	
	
	
	
	
	


}
