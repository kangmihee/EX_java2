package javaclass;
//play (�� ȸ���� ���ڿ� ���) ��� �����������̽��� �ְ�
//lg, samsung, sonyȸ�翡�� �� ����� �����ϵ��� �ϰ�
//���� ��ǰ�� play �Լ��� ȣ���� �� �ִ� Ŭ������ �ۼ��Ͻÿ�

interface PLAY{
	int a = 100; //public static final, ����� �ڵ� ����
	public abstract void play(); 
}

class LG implements PLAY{ //���  class�� �⺻���� object ���
	public void play() {
		System.out.println("play in B class");
	}
	public String toString() { //�������̵� : ���ڿ��� �䱸�ϴ� �Լ��� ���� �ڵ�
		return "LG";
	}
}
class SAMSUNG implements PLAY{ 
	public void play() {
		System.out.println("play in C class");
	}
	public String toString() { 
		return "SAMSUNG";
	}
}
class SONY implements PLAY{ 
	public void play() {
		System.out.println("play in D class");
	}
	public String toString() { 
		return "SONY";
	}
}

class playauto {
	void autoplay(PLAY p) { //p�� ���ڿ�
		System.out.println("Connecting with " + p );
		p.play(); //(LG, SAMSUNG, SONY)Ŭ������ play �Լ� ȣ��
		//p.a = 100;
		System.out.println("p.a");
		System.out.println();
	}
}

public class in_play { //�ϳ��� �޼ҵ带 �̿��ؼ� �پ��ϰ� ����ϴ� ��ü�� �۵���Ų��.
	public static void main(String[] args) {

		playauto pa = new playauto();
		LG lg = new LG();
		SAMSUNG samsung = new SAMSUNG();
		SONY sony = new SONY();
		//������ ���� : �پ��� ����� �����ϴ� ���� ����
		//�ѹ��� ȣ���� �� �ִ� ���� ��Ӱ� interface��
		//interface�� �ϴ� ������ ���������� �������̵��ؾ� �ϱ� ����
			
		pa.autoplay(new LG());  //����� �Ʒ��� ����
		pa.autoplay(lg);
		
		pa.autoplay(new SAMSUNG());
		pa.autoplay(samsung);
		
		pa.autoplay(new SONY());
		pa.autoplay(sony);
	}
}



//ȣ���� :
//Connecting with LG
//play in B class
//p.a
//
//Connecting with LG
//play in B class
//p.a
//
//Connecting with SAMSUNG
//play in C class
//p.a
//
//Connecting with SAMSUNG
//play in C class
//p.a
//
//Connecting with SONY
//play in D class
//p.a
//
//Connecting with SONY
//play in D class
//p.a

