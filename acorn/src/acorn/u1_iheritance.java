package acorn;

class Parent {
	int x = 100;
	void method() {
		System.out.println("parent Method");
	}
	public void setvalue(int x){
		this.x = x;
	}
}

class Child extends Parent{
	int x = 200; //������ ������
	public Child() {
		x = 1000; 
	}
	public void setvalue(int x){
		this.x = x; //overriding ������
	}
	void method(){
		System.out.println("child method " + x );
	}
	void Method2(){ //�ڽ�Ưȭ, �ڽ��� ���Ƿ� �߰�
		System.out.println("child.method " + x );
	}
}



class Child2 extends Parent{
	int x=200;
	public Child2() {
		x = 2000;
	}
	public void setvalue(int x){
		this.x = x;
	}
	void method(){
		System.out.println("child method " + x );
	}
	void Method3(){
		System.out.println("child.method " + x );
	}
}



public class u1_iheritance {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();  //Ŭ���� ����, ��Ӱ����� �θ�� �ڽ��� ����ų �� �ִ�.
			
		//�������̵� �� �Լ��� ȣ���
		c.method();
		p.method(); 
		c.Method2();
		//p.method2(); //�����߻�: �ڽ��� ������(�߰��� ����) �θ��� �̸����� ȣ��Ұ� -> �ٿ�ĳ�����ʿ�
		
		Child d = (Child) p; //�ٿ�ĳ����
		d.Method2();
		
		Child ch[] = new Child[3]; //��ü �迭
		for(int i=0;i<3;i++){
			ch[i] = new Child(); //���� heap�� �޸� ����Ȯ
		}
		ch[0].setvalue(100);
		ch[1].setvalue(20);
		ch[2].setvalue(10);
		
		for(int i=0;i<3;i++){
			ch[i].method();
		}
		//�θ� �ڽ��� ����Ű���� �Ѵ�.
		Parent chp[] = new Parent[6];  // 3 : child,  3 : child2  
		for(int i=0;i<3;i++){
			chp[i] = new Child();
		}
		for(int i=3;i<6;i++){
			chp[i] = new Child2();
		}
		chp[0].setvalue(100);
		chp[1].setvalue(20);
		chp[2].setvalue(10);
		
		for(int i=0;i<3;i++){
			chp[i].method(); //�θ��� �̸����� �ڽ��� �Լ��� ȣ�� ����
		}

		
	}
}
