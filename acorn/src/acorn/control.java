package acorn;

import java.util.Scanner; //�Է��� ���� ��Ű��

public class control {

	public static void main(String[] args) {
		// ���ǹ�
		int visitCount = 0;
		if (visitCount < 1) {
			System.out.println("������ġ");
		}
		System.out.println("���� ������ ���� ");
		
		//������ ������� ��Ÿ����
		int grade;
		Scanner input = new Scanner(System.in);	//Ŭ������ ��������ؼ� import �����ش�	
		System.out.println("������ �Է��Ͻÿ�.");
		grade = input.nextInt();
		if(grade>=90)
			System.out.println("A");
		else if(grade>=80)
			System.out.println("B");
		else if(grade>=70)
			System.out.println("C");
		else if(grade>=60)
			System.out.println("D");
		else 
			System.out.println("F");
						
		//����. 2���� �Է¹ް� ū ���� ����Ͻÿ�.	
		int num1;
		int num2;		
		System.out.print("ù��° ��:");
		num1 = input.nextInt();
		System.out.print("�ι�° ��:");
		num2 = input.nextInt();
			if(num1>num2)
				System.out.println("ū ��:"+num1);
			else 
				System.out.println("ū ��:"+num2);
			
		//����. ���� ���� ������ �Է¹ް� �� ���� ���� ���� ����� ����Ͻÿ�.		
		int kor;
		int eng;
		float result;
		System.out.print("���� ����:");
		kor = input.nextInt();
		System.out.print("���� ����:");
		eng = input.nextInt();
		result = kor+eng;
		System.out.println("��� ��:" + result/2.0f);
		
		//���� ������
		int num =10;
		num +=2; // num = num + 2 // ���������� => ������ ������� �����
		num -=2; // num = num - 2
		num *=4; // num = num * 4
		num /=2; //������
		num %=6; //������ ������ , ����� ���� ����� ���ؼ� ���
		// � ���� �������� 3���� ���� ���� ���
		
		//����. ������ �Է¹ް� Ȧ�� ���� ¦�������� ����Ͻÿ�.
		//for(�ʱⰪ; �Ѱ谪; ������)
		for(int i=0; i<10; i++){ //Ƚ���� ī��Ʈ�ϰų� ���ڸ� �̿��ϰų�			
			num = input.nextInt(); // i = i+1
			if(num % 2 == 0)
				System.out.println("¦�� �Դϴ�.");
			else 
				System.out.println("Ȧ�� �Դϴ�.");
			}
		
		//����.
		//Ȧ¦���� 
		//turn around ����
		//��븦 ����, ���: �Է�, ��ǻ�� : random
		
		
	}
		
}	

