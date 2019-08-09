package acorn;


public class t2_Circle {

	public static void main(String[] args) {
		Circle1 c1 = new Circle1();
		//c1.radius = 100; //private������ �� ����
		c1.setRadius(100);
		c1.display();
		
	}
}

// ���� ǥ���ϴ� class : �Ӽ� - ������, �߽���
class Circle1 {
	private double radius = 0; //���� ������
	
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public void display() {
		System.out.println("���� ������" + getArea());
	}
	
}


