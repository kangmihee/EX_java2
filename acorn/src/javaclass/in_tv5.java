package javaclass;

//�������� ���� on/off
interface TVaction {
	void on();
	void off();
}

//������ -�������̽��� ��ӹ��� ��� ��ü�� ������ �����ϴ� ���
class TV5 {
	void autoOn(TVaction i) { //�������̽��� Ŭ���� �ȿ����??...�������̽��� ��ġ �θ�ó�� �ڽ��� �����ٰ� ���� ����
		i.on();
	}
	void autoOff(TVaction i) {
		i.off();
	}
}

//�������� ������
class LgTV implements TVaction{
	public void on() {
		System.out.println("Lg ON");
	}
	public void off() {
		System.out.println("Lg Off");
	}
}
class SamsungTV implements TVaction{
	public void on() {
		System.out.println("Samsung ON");
	}
	public void off() {
		System.out.println("Samsung Off");
	}
}
class LotteTV implements TVaction{
	public void on() {
		System.out.println("Lotte ON");
	}
	public void off() {
		System.out.println("Lotte Off");
	}
}

public class in_tv5 {
	public static void main(String[] args) {
		TV5 tv = new TV5(); //������
		
		tv.autoOn(new LgTV());
		tv.autoOn(new LotteTV());
		tv.autoOn(new SamsungTV());
		
		tv.autoOff(new LgTV());
		tv.autoOff(new LotteTV());
		tv.autoOff(new SamsungTV());		
		
	}
}










