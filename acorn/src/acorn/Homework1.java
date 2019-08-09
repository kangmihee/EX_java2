package acorn;
import java.util.Scanner;

//point class �����Ͻÿ� x,y��ǥ  set/get, move, display �Լ� ���
//�Ÿ����� ���ϴ� �Լ�(distance)�� ���ִ� class �ۼ�
//Color Point Class �� ��ǥ���� �÷����� ǥ���ϵ��� �����ϴ� Ŭ���� �ۼ�
//Rectangle (��ǥ�� 2��), Triangle (�غ� ��ǥ�� 2��), Circle (�߽����� ������)

class Point{
	int x1;
	int y1;
	
	Point(int x1, int y1){
		this.x1 = x1;
		this.y1 = y1;
	}
	public Point(){
		x1 = 0;
		y1 = 0;
    }
	public double distance(Point p){
		double dis = Math.sqrt( (this.x1-p.x1)*(this.x1-p.x1)+(this.y1-p.y1)*(this.y1-p.y1) );
		return dis;
	}	
	public void setvalue1(int x1){ this.x1 = x1;}
	public void setvalue2(int y1){ this.y1 = y1;}
	
	public int getvalue1(int x1){ return x1;}
	public int getvalue2(int y1){ return y1;}		
}


class Color_Point extends Point{
	String color;
	public Color_Point(int x1, int y1, String color) {
		super(x1, y1);
		this.color = color;
	}
}

abstract class Shape_hw{
	public Point start, end;	
	public Shape_hw(Point p1, Point p2){
		this.start = p1;
		this.end = p2;
	}
	public abstract double display();
	public void move(Point p1, Point p2){
		start = p1;
		end = p2;
	}		
}

class Rectangle_hw extends Shape_hw{
	public int width,height;
	public Rectangle_hw(Point p1, Point p2){
		super(p1, p2);
	}
	public double display() {
		width = Math.abs(start.x1-end.x1);
		height = Math.abs(start.y1-end.y1);
		return width*height;
	}
}

class Triangle_hw extends Shape_hw{
	Point c;
	public Triangle_hw(Point a, Point b, Point c) {
		super(a, b);
		this.c=c;
	}
	public void move(Point a, Point b, Point c) {
		super.move(a, b);
		this.c = c;
	}
	public double display() {
		double value = 0.5*Math.abs(((start.x1*end.y1 + end.x1*c.y1 + c.x1*start.y1)
                                    -(end.x1*start.y1 + c.x1*end.y1 + start.x1*c.y1)));
		return value;
	}	
	
	
}

class Circle_hw extends Shape_hw{
	public double r;
	public Circle_hw(Point p1, Point p2) {
		super(p1,p2);
	}
	public double display() {
		r = start.distance(end);
		return Math.round((Math.PI*r*r)*100/100.0);
	}
	
}


public class Homework1 {
	public static void main(String[] args) {	
		Point p1 = new Point();
        Point p2 = new Point(0,5);
        System.out.println("�� ��ǥ ���� �Ÿ�: "  + Math.round(p1.distance(p2))*100/100.0);
        
        Rectangle_hw r = new Rectangle_hw(new Point(), new Point(10,5));
        Triangle_hw t = new Triangle_hw(p1, new Point(5,0),new Point(5,5));
        Circle_hw c = new Circle_hw(p1, new Point(0,5));
        Color_Point cp = new Color_Point(0, 5,"red");
        System.out.println("(" + cp.x1 + "," + cp.y1 + ")��ǥ�� color��:" + cp.color );
               
        System.out.println("��ǥ �̵� ���� ������ ����: ");
        System.out.print("�簢��:" + r.display() + " �ﰢ��:"  +  t.display() + " ��:" +  c.display() + "\n");    
        
        System.out.println("��ǥ �̵� ���� ������ ����: ");
        r.move(new Point(8,8),new Point(3,3));
        c.move(new Point(), new Point(0,2));
        t.move(new Point(), new Point(4,0), new Point(0,4));		
        System.out.print("�簢��:" + r.display() + " �ﰢ��:"  +  t.display() + " ��:" +  c.display() + "\n");    		
	}

}
