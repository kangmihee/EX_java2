package javaclass;
class Unit { //����� ���� ������ Ÿ��
	int currentTHP;  //������ ü��
	int x;           //������ ��ġ(x��ǥ)
	int y;           //������ ��ġ(y��ǥ)
}

//����� ����
//�������̽� ���� ���
interface Flightable extends Movable, Attackable {}
//���� �ٸ� �������̽��� �и��� ���� ���� ��� ������ �ϱ� ����

interface  Movable { void move( int x, int y ); }
interface  Attackable { void attack( Unit u ); }
//����ϰ� �޼ҵ�
//�Ű�����


//���� �������̽�(Movable,Attackable)�� ��ӹ��� �ڼ��������̽� Flightable�� FighterŬ������ ���� 
class Fighter extends Unit implements Flightable{ 
	public void move( int x, int y ) {}
	public void attack( Unit u ) {}
}

public class in_flighter {
	public static void main(String[] args) {
		Fighter f = new Fighter(); //�ڹٿ��� Ŭ���� �ν��Ͻ��� ���� �޸� �Ҵ�
		
		//�����ڰ� ȣ��
		if (f instanceof Unit) {
			System.out.println("f�� Unit Ŭ������ �ڼ��Դϴ�.");
		}
		if (f instanceof Flightable) {
			System.out.println("f�� Flightable �������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Movable) {
			System.out.println("f�� Movable �������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Attackable) {
			System.out.println("f�� Attackable �������̽��� �����߽��ϴ�.");
		}
		if (f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ��Դϴ�.");
		}	
	}
}
