package acorn;

public class Person {

	String name; 
	int age;
	
	public Person(String name, int age){ 
		this.name=name; 
		this.age=age; 		
	}
	
	public void print() { 
		System.out.println(this.name+ "�� " + this.age +"�� �Դϴ�.");
	}
}
