//������ ������, ������ ������, ��ü�� ������

package acorn;

public class Car { //Ŭ���� : ������� + ��� �żҵ�
	public String name;
	//������ : ��������� �ʱ�ȭ �Ҵ� ���
	//     : ������ ȣ���� �� ���� Ŭ���� �ν��Ͻ� �� �� ó�� �� ���� ����
	
	public Car(String name){ //���ϰ��� ����
		this.name=name; //this�� �ν��Ͻ� �� Ŭ���� ��ü�� this
	}
	public void drive() { //�Լ��̸��� drive�� ������ ���� �ٸ��� �༭ ȣ�⳻���� �ٸ�
		System.out.println(this.name+ "��(��) �޶��.");
	}
}
