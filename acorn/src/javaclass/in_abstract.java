package javaclass;

interface Printable1{
	void print(); //�߻�޼���
}
/*interface Showable1 extends Printable1{  //�������̽� ���
	void show(); //�޼���
}*/

interface Showable1{ //...�����������̽� ������ؼ� �� �������̽� �ּ�ó���ϰ� �������
	void show();
}

//�������̽� ��ӽ� �� ����� �������̽�
public class in_abstract implements Showable1,Printable1{
	
	public void print(){System.out.println("�ȳ�");}
	public void show(){System.out.println("�ִ��� �ɷ¹���");}
	
	public static void main(String[] args) { //static //main
		
		in_abstract obj = new in_abstract();
		//�迭 ó���ϰų� �Լ��� �Ű������� �ޱ�����(�ڽ�)
		obj.print(); 
		obj.show(); 
		
		//�������̽� ����
		Printable1 insp = new in_abstract();
		insp.print(); 
		//insp.show(); //ȣ��Ұ���..�ٿ�ĳ���� ���־����
		//������ �ٿ�ĳ����
		obj = (in_abstract) insp;
		obj.print(); 
		obj.show(); 
	}
}
