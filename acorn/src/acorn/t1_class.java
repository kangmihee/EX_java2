package acorn;

public class t1_class {

	public static void main(String[] args) {
		byte b = 0;
		int i = 0;
		for(int x = 0 ; x <= 270 ; x++){  //11111111�� �����ϴٰ� ��ȣ��Ʈ�� ���� 127(01111111)���� -128(11111111)�� �Ѿ
			System.out.print(b++); // (byte:-128 ~ 127)�����ε� => -128
			System.out.print('\t'); // escape ���ڿ� => \n : newline, \t : tab
			System.out.println(i++);
			
		}
		
		Car2 c1 = new Car2(); //������ Ÿ�� ��ġ
		c1.color = "white"; //���԰���
		c1.gearType  = "auto";
		c1.door = 4;
		
		Car2 c2 = new Car2("white", "auto", 4);
		System.out.println("���� color= " + c1.color + ", geatType=" + c1.gearType + "" + ", door=" + c1.door );
		System.out.println("���� color= " + c2.color + ", geatType=" + c2.gearType + "" + ", door=" + c2.door );	
		
		add_num num = new add_num(); //��ü�迭�� ���鶧��  ����Ʈ �����ڰ� �ʿ�!
		System.out.println(num.getresult());
	}		
}

class add_num{ //������
	int a = 1000;
	int b = 2000;
	public int getresult() {
		return a+b;		
	}
	// add_num(){} �ڵ����� ����Ʈ ������ ����
}
