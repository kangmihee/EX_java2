package acorn;

class Card{
	String kind;
	int number;
	
	//��ӿ��� �߿����� : �ڽ��� �θ��� �����ڸ� ȣ���ؾ� �� ��찡 �ְ�
	//������ �����ε�
	Card() { //������ : �����ڰ� �����ڸ� ȣ���ϴ� ���� ����...Card cd = new Card()�� ȣ��������� ����Ʈ ���� ���Ѵ�.
		this("SPADE", 1); //����Ʈ��
	}
	Card(String kind, int number) { //������: ����ȣ�� �Ұ���
		this.kind = kind;
		this.number = number;
	}
	void display(){
		System.out.println(kind + "   " + number);
	}
}

public class String_test {
	public static void main(String[] args) {
		String one = "Foo"; //���ڿ� Ŭ����
		char [] c = {'F', 'o', 'o'}; //���� �迭
		String two = new String( c );
		
		System.out.println(one.equals(two)); //���:true ...equals�� ��ҹ��� �����ؾ��Ѵ�...
		System.out.println(one.equals(c)); //���:false
		System.out.println(one.equalsIgnoreCase(two)); //���:true
		
		
		//���ڿ� �迭 ����
		String[] words = {new String("aaa"), new String("bbb"), new String("ccc")};
		
		//�ڹٿ��� ���ڿ��� ���� �� equals�� ����ؾ��Ѵ�...==�� ���Ұ�!
		for(int i=0; i<words.length;i++){
			if(words[i].equals("ccc")){ //������ ���Ѵ�
				System.out.println("words���� equals �޼���� ã�ҽ��ϴ�.");
			}
			if(words[i]=="ccc"){ //�񱳿�����...==�� �ּҰ����� ���Ѵ�
				System.out.println("words���� ==�����ڷ� ã�ҽ��ϴ�.");
			}
		}
		
		Card c1 = new Card();
		Card c2 = new Card();
		c1.display();
		c2.display(); //���� ���� ���
		System.out.println(c1); // Ŭ�������. ��ü�� ������ �ִ� �� ���
		System.out.println(c2.toString());
		
		
		
	}

}
