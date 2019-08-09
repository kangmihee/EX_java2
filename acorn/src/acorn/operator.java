package acorn;

//10���� => 2���� ����, ����, ����, �̹���, �ؽ�Ʈ ���� ó��
//����������:(1�����ο���) ++, --
//���������:(2�����ο���) *, /, +, -
//����Ʈ������:(3�����ο���) <<, >>
//�񱳿�����: >, >=, ==, <, <=
//��Ʈ������:&, |, ^
//��������: (����)? : ��:����
//���׿�����: =, +=, -=, *=, /=, %=(������������)

public class operator {

	public static void main(String[] args) { //���Ͽ����ڿ� ����������
		int i=5;
		i++; //��������������  i=i+1
		System.out.println(i);  //6
		i=5;
		++i; //��������������
		System.out.println(i); //6
		System.out.println(i++); //6 i���� �Լ�(println)�� 6�� �־��ְ� ���� ������ +1 ó�� => 7  
		System.out.println(++i); //8 �Լ�(println)�� +1�� �־��༭ 7+1 => 8 	
		
		//128, 64, 32, 16, 8, 4, 2, 1
		//  0   1   1   0  0  0  0  1  =97 
		
		char c1= 'a'; //97�� 2������ ����
		char c2 = c1;
		char c3 = ' '; //���鵵 �������̴�.
		
		int j= c1 + 1; //�������� 2������ ����Ǿ� �ִ�. 97+1
		
		c3= (char)(c1+1); //���� ĳ����
		c2++;  //98
		c2++;  //99
		
		//char���� ���� + ���ڷε� ��ް���
		System.out.println("j=" + j); //98
		System.out.println("c2=" + c2);  //c  char���̶� ���ڷ� ��� 
		System.out.println("c3=" + c3);  //b  char���̶� ���ڷ� ���
		
		//�����Լ����� : Math Ŭ����
		float pi = 3.141592f; //���ȭ
		float shortPi = Math.round(pi *1000) / 1000f; //round �ݿø��Լ�...�Ҽ��� 3�ڸ� �÷��� �׸����� �ٽ� ������...
		//3141.592 => 3142 => 3.142...���ϴ� �ڸ����� �ݿø� �� �� ����ϴ� ���
		float shortPi_1 = (float)Math.ceil(pi * 1000) / 1000f; //�ø�
		//ceil �� double�� ������
		float shortPi_2 = (float)Math.floor(pi * 1000) / 1000f; //����
		// floor�� ���� ȿ���� ����
		// 3141 => 3.141
		float shortPi_3 = (int)(pi * 1000) / 1000f;
		
		System.out.println(shortPi); //3.142
		System.out.println(shortPi_1); //3.142
		System.out.println(shortPi_2); //3.141 
		System.out.println(shortPi_3); //3.141
		
		
		System.out.println(-8); //��� : -8, ������ ������ ǥ��		
		System.out.println(Integer.toBinaryString(-8));
		//������ ������ ǥ�� 0->1, 1->0
		//��� : 11111111111111111111111111111000 #���������� 0�� ���ڷ� ����
		System.out.println(); 
		
		
		//Shift ����   -> *2
		//      ������ -> /2
		int temp = -8 << 1; //-16
		System.out.println("-8 << 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		//��� : 11111111111111111111111111110000
		System.out.println();
		
		temp = -8 << 2; //-32
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp)); //�޸��� ������ ���
		System.out.println();
		
		
		//����.�������ڸ� ���̳ʸ��� ����Ͻÿ�.
		//��Ʈ����
		int x = 123; //1111011...�޸𸮿� 2���� ����...���� �ڸ��� 0����
		int y = 205; //11001101
		       //xor : 10110110...���� �ڸ��� 0�ٿ���(01111011)�� xor ����
	       	   //      128  32  16  4  2 => 182
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		
		int z = x^y; //xor����
		System.out.println(z); //10������ ���
		System.out.println(Integer.toBinaryString(z));
		//int x = 123; // 01111011 �Ÿ𸮿� 2���� ����
		//int y = 205; // 11001101
		               // 11111111
		
		System.out.println("x | y = " + (x|y)); //or...���:255 => 256������ 0����  ����
		//int x = 123; // 01111011 �Ÿ𸮿� 2���� ����
		//int y = 205; // 11001101
				       // 01001001
                       //64 8 1 => 73
		
		System.out.println("x & y = " + (x&y)); //and...���:73 
		//true(1) / false(0) �� ���
		
		System.out.println("true | false = " + (true|false));  //true
		System.out.println("true & false = " + (true&false));  //false
		System.out.println("true ^ false = " + (true^false));  //true
		
		
		//���׿����� (if���� �ٿ�����)
		x = 10;
		y = -10;
		int absX = (x >= 0) ? x : -x;  //true�̸� ����, flase�� ������ ���
		int absY = (y >= 0) ? y : -y;
		System.out.println("x= "+absX); //���:10
		System.out.println("y= "+absY); //���:10
		
		
		boolean power = false;
		power = !power; //false�� �����ϸ� true
		System.out.println(power); //���:true
		
		
		

	}

}
