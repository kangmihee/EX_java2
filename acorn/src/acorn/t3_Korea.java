package acorn;

//���� : ���ѹα��� ���� ������ �α�, ����, Ư��("�Ƹ���, ���ֹڹ���, ���ִ�")��
//�����ϴ� Ŭ������ ����� ������ private�� �ϰ� �α��� �����ϰ� �α��� �����ϴ� set/get �Լ��� �ۼ��Ͻÿ�.

public class t3_Korea {
	public static void main(String[] args) {		
		/*���1
		Korea k; //�ּҸ� ������ �������� Ȯ�� - �����ּҴ� ���� null
		k = new Korea();*/
		
		//���2
		Korea ko = new Korea();
		
		ko.setPeople(5000); //0�� �Է������� ��
		int p = ko.getPeople();
		System.out.println("�α�: " + p);
		
		ko.setSeoul("����"); //
		String s = ko.getSeoul();
		System.out.println("����: " + s);
		
		//�ּҸ� �����ϴ� �������� Ȯ��
		String[] list = ko.getCharacter(); //����� �ּ��ϰ� character�� ����� 
		for(int i=0;i<list.length;i++){
			System.out.print(list[i] + " " );
		}
		
		//�ּҰ��� �Ѿ� ������ Ȯ��
		list[2] = "���Ⱥ�";
		String[] list2 = ko.getCharacter();
		System.out.println(list2[2]);
		//���Ⱥ��� �����
			
	
		Worker wo = new Worker();
		wo.setName("������");
		wo.setNo(25);
		wo.setDept("������");	
		wo.print();
		
		
		Document d1 = new Document(); //���:Ŭ���� ���������� 1��°�� �����Ǿ����ϴ�.
		Document d2 = new Document("�Ƹ���"); //���:Ŭ���� �Ƹ�����°�� �����Ǿ����ϴ�.
		Document d3 = new Document(); //���:Ŭ���� ���������� 2��°�� �����Ǿ����ϴ�.
		Document d4 = new Document(); //���:Ŭ���� ���������� 3��°�� �����Ǿ����ϴ�.
		System.out.println(d4.count); //0���� �ʱ�ȭ... ���:3
		System.out.println(d1.count); //0���� �ʱ�ȭ... ���:3		

	}

}

class Korea { //�迭�� �⺻������  reference �̴�.
	private int people =0;
	private String seoul;
	private String[] character = {"�Ƹ���", "���ֹڹ���", "���ִ�"}; //���������ʹ� heap�� ����Ǿ� ����

	public void setPeople(int p) {
		if(p < 1){ //����
			System.out.println("�α��� 1�̻����� �����ϼ���.");
			return;
		}
			people = p;
	}
	public void setSeoul(String s) {
		seoul = s;
	}
	public void setCharacter(String[] c) {
		character = c;
	}
	
	
	public int getPeople() {
		return people;
	}	
	public String getSeoul() {
		return seoul;
	}
	public String[] getCharacter() { //�����Ҵ翡 ���� reference�� ����
		return character; // reference�� ���� ����
	}
		
	public void print() {
		System.out.println("���ѹα��� �μ�����: " + getPeople() + "���̴�." + 
	                       "���ѹα��� ������: " + getSeoul() + "�̴�." + 
	                       "���ѹα��� Ư����: " + getCharacter() + "�� �ִ�.");
		}
	
}



//��� (name, no, dept(�μ�)�� �ۼ��ϴ� Ŭ������ �ۼ��Ͻÿ�)
//������ �����ε��� ���� �Է��� ���� �� �ʱ�ȭ�ϴ� �Լ��� �̸�, ��ȣ, �μ��� �Է¹޴� �����ڸ� �ۼ��Ͻÿ�
//��������� ������ ������ ����ϴ� print�Լ��� �ۼ��Ͻÿ�


class Worker{
	private String name;
	private int no;
	private String dapt;
	//�ν��Ͻ� ���  
	
	/*public Worker() {
		name = "�ʱ�ȭ";
		no = "����Է�";
		dept = "�μ����Է�";
		System.out.println("���ھ��� ������ ȣ���!!!");
	}*/
	
	public void setName(String n) {		
		name = n;
	}
	public void setNo(int number) {
		no = number;
	}
	public void setDept(String d) {
		dapt = d;
	}
	
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public String getDept() {
		return dapt;
	}
	
	public void print() {
		System.out.println("�̸��� " + getName() + "�̴�." + "\n" +
	                       "�����ȣ�� " + getNo() + "�̴�." + "\n" +
	                       "�μ��� " + getDept() + "�̴�.");
		}
}



//static ���� : Ŭ���� �ν��Ͻ� object���� �������� ����ϴ� ������
class Document {
	static int count = 0; //�����ڿ��� �ʱ�ȭ���� ����...��������(static)�� �ѹ��� ����� ����...������ �� Ŭ������ �������λ���
	//�л� => �б�
	String name; //��������(static)�� �ƴѺ����� �������� �ʱ�ȭ ����(?)
	
	public Document(){ //�����ڰ� �����ڸ� ȣ��
		this("���������� " + ++count);
	}
	public Document(String name) {
		this.name = name;
		System.out.println("Ŭ���� " + this.name + "��°�� �����Ǿ����ϴ�.");
	}
}



