package acorn;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {		
		for(int i=0; i<args.length;i++)
			System.out.println("args[ " + i + " ] = " + args[i] );
		
		System.out.println("���θ޼ҵ尡 ���۵Ǿ����ϴ�.");
		
		int[] nums = new int[3]; //stack = heap �� �ּҰ� ����, heap
		nums[0] = 10; //�ʱ�ȭ���
		nums[1] = 20;
		nums[2] = 30;
		int[] nums2 ={10, 20, 30}; //�ʱ�ȭ���2
		for(int i=0; i<nums2.length;i++){
			System.out.println(nums2[i] + "\n");
		}
		
		//���ڿ� �迭...int �� ������ �޶� stack -> main��������, heap -> �ּ�����
		//heap ���ڿ� �ּ� �迭
		//���ڿ��� ���� ����Ȯ���ϰ� ������ �Է��� �� �ּҸ� ���ڿ� �ּ� �迭�� ����
 		String[] names = new String[3];
		names[0] = "�����";
		names[1] = "���ֽ�";
		names[2] = "����";
		String[] names2 = {"�����", "���ֽ�", "����"};
		for(int i =0; i< names2.length;i++){
			System.out.println(names2[i] + "\n");
		}
		
		Car[] cars = new Car[3]; //������ �����Ȳ..�ʱ�ȭ�ʿ�!
		//���1
		cars[0] = new Car("�ҳ�Ÿ"); //��ü�� ���������� �ϱ� ������ new�� ����ؼ� �����͸� ���� �־��ش�...���ڿ��� �ʱ�ȭ �ʿ�
		cars[1] = new Car("�ƹݶ�");
		cars[2] = new Car("�ƿ��");
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		//���2
		Car[] cars2 = {new Car("A"), new Car("B"), new Car("C")};
		cars2[0].drive();
		cars2[1].drive();
		cars2[2].drive();
		
		
		//Person (�̸��� ����) Ŭ������ ������ ���� ����ϴ� �Լ��� ����ÿ�
		//Person Ŭ������ �迭3���� ����� �ʱ�ȭ �� ���� �Լ��� �̿��ؼ� ������ ����Ͻÿ�
		Person[] pe = new Person[3];
		pe[0] = new Person ("������", 30);
		pe[1] = new Person ("�ں���", 25);
		pe[2] = new Person ("������", 20);
		pe[0].print();
		pe[1].print();
		pe[2].print();	
		
		
		//int[] score = {79, 88, 91, 33, 100, 55, 95};
		//�ִ밪�� �ּҰ��� ã�Ƽ� ����Ͻÿ�.
			
		
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int min = score[0];  //79
		int max = score[0];  //79
		
		for(int i=0;i<score.length;i++){
			if(score[i]>max){
				max = score[i];
			}if(score[i]<min){
				min = score[i];
			}
		}
		System.out.println("�ּҰ���:" + min + " �ִ밪��:" + max );
		
	
		
		int[] number = new int[10];
		for(int i=0; i<number.length;i++){
			number[i] = i;
			System.out.print(number[i] + " ");
		}
		
		for(int i=0; i<100;i++){
			int n =(int)(Math.random() * 10); //0~9����
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;	

		}
		//����. shuffling�� �����͸� ����(����) �������� �����Ͻÿ�(��������)
		for(int i=0; i <number.length;i++){
			boolean changed = false;
			for(int j=0; j < number.length-i-1 ;j++){//-1�� ������ ������ ���ڰ� �����Ǿ� ��� �ȳ���
				if(number[j] < number[j+1]){
					int temp = number[j]; //�ӽú����� �����͸� ���
					number[j] = number[j+1];
					number[j+1] = temp;
					changed =true; //��ȭ�� ����
				}	
			 // ! ����not
			}if(!changed) break; // ���� �� ����
		}
		
		
		
		//����. �ݺ������
		//     0.000 ~ 0.9999 : 0, 99   
		//     com : 1~100 ������ ���� ���� Math.random *100 + 1
		//     ����ڴ� ���� �Է��ؼ� ������ ���� (��)
		//     Ʋ���� �޽����� ��������� �Է��� ���ں��� ũ�ų� �۴ٴ� ���� ���
		//     ���������� ������ ���߸� event���
		//     Hitnum class�� ���޴� Ǯ��
		
		int com = (int)(Math.random() * 100) +1;
		for(int i=0; i<100;i++){			
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			if(a > com){
				System.out.println("�Է°� " + a + " ���� �۽��ϴ�.");
			}else if(a < com){
				System.out.println("�Է°� " + a + " ���� Ů�ϴ�.");
			}else 
				System.out.println("�Է°� " + a + " �� �����ϴ�.");
			
		}	
		
	}
}









