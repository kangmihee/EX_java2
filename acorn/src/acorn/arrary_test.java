package acorn;

public class arrary_test {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f; 
		              // 0,  1,  2,   3,  4  �ε���
		int[] score = {100, 88, 100, 100, 90}; //�迭�ʱ�ȭ�ô� �߰�ȣ ���
		
		for (int i=0;i<score.length;i++){ //Ƚ���� �� => �迭 �ε���
			sum += score[i]; //�ε��� ������ ���� �߻�
		}
		
		//for in ��
		//�ε��� ������ �߻����� ����, x������ ��ü�� �ȴ�
		for (int x : score){ //������ ��Ҹ� �ϳ� ������ �����ϸ鼭 ó��
			sum += x;
		}
		
		average = sum/score.length;
		System.out.println("�հ��: " + sum);
		System.out.println("�����: " + average);
		
		
		int ave = (int)average/10;
		char grade = 'F';
		switch (ave) {
		case 10:
		case 9:
			grade = 'A';			
			break;
		case 8:
			grade = 'B';			
			break;
		case 7:
			grade = 'C';			
		case 6:
			grade = 'D';					
		default:
			grade = 'F';	
		}
		
		System.out.println("����� = " + grade + "�Դϴ�.");
		switch (grade) {
		case 'A' : //���ڸ� �̿��� �Ǵ�
			System.out.println("Excellent!");
			break;
		case 'B' :
		case 'C' :
			System.out.println("Well done");
			break;
		case 'D' :
			System.out.println("you passed");
			break;
		case 'F' :
			System.out.println("Better try again");
			break;
			
		default: 
			System.out.println("Invalid grade");
			break;
		}
		
	}

}
