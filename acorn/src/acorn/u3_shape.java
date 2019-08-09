package acorn;
//Shape => Triangle(�غ�,����), Rectangle(�غ�,����), Circle
//����. Rectangle class, Triangle class�� ������ ���ÿ�
//�������
public class u3_shape {
	//���� �����ϴ� �Լ��� �������� �ϵ��� ����
	//���� ������ ���� ����ϵ��� �ϴ� ���� �Լ� ����
	//�Ű������� ��ü�� ������ ���� �ٿ� ĳ������ �ڵ����� �ϴ� �Լ��� �ۼ�
	public static void shaperPrint(Shape sh, double base, double height){ // sh:��ü����
		if(sh instanceof Circle ) { //�ν��Ͻ� �� Ŭ���� Ȯ��
			Circle ci = (Circle)sh; //����ؼ� ����� ��
			ci.setRadius(base);
			ci.makeArea();
			ci.display();
		}
		else if (sh instanceof Rectangle) {
			Rectangle rec = (Rectangle)sh;
			rec.setbase(base);
			rec.setheight(height);
			rec.makeArea();
			rec.display();
		}
		else if(sh instanceof Triangle){
			Triangle tri = (Triangle)sh;
			tri.setbase(base);
			tri.setheight(height);
			tri.makeArea();
			tri.display();
		}
	}
	
	
	public static void main(String[] args) {
		Shape sh = new Circle(10);
		sh.makeArea();
		System.out.println(sh.getArea());
		
		//sh.setRadius(1000); //�߰��� �Լ��� ȣ��Ұ�
		Circle ci = (Circle)sh; //����ȯ
		ci.setRadius(1000);
		
		Shape sh2 = new Rectangle(10, 20);
		sh2.makeArea();
		sh2.display();
		Rectangle rec = (Rectangle)sh2;
		
		Shape sh3 = new Triangle(10, 20);
		sh2.makeArea();
		sh2.display();
		Triangle tri = (Triangle)sh3;
				
		
		shaperPrint(rec, 5, 4);
		shaperPrint(tri, 6, 4);
		shaperPrint(ci, 100, 0); //���� ���� ��¥ �Ű����� 0�� �����ؾ� ��
	}
}

class Shape {
	protected double area;
	public void display() {
		System.out.println("������ " + this.area + "�Դϴ�.");
	}
	public void makeArea() {}
	public double getArea() {
		return area;
	}
}

class Circle extends Shape{
	private double radius; //�ڽ� �߰�
	public Circle(int radius){
		this.radius = radius;
	}
	public void makeArea() { //������
		area = Math.PI*Math.pow(radius, 2);
	}
	public double getRadius() { //�ڽ��߰�
		return radius;
	}
	public void setRadius(double radius){ //�ڽ��߰�
		this.radius = radius;
	}	
}

class Rectangle extends Shape{
	private double base;
	private double height;
	
	public Rectangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	public void makeArea() { 
		area = base*height;
	}
	public double getbase(double base) { 
		return base;
	}
	public void setbase(double base){ 
		this.base = base;
	}	
	public double getheight(double height) { 
		return base;
	}
	public void setheight(double height){ 
		this.height = height;
	}	
}

class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	public void makeArea() { //������
		area = (float)(base*height)/2;
	}
	public double getbase(double base) { //�ڽ��߰�
		return base;
	}
	public void setbase(double base){ //�ڽ��߰�
		this.base = base;
	}	
	public double getheight(double height) { //�ڽ��߰�
		return base;
	}
	public void setheight(double height){ //�ڽ��߰�
		this.height = height;
	}	
}







