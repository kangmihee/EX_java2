package acorn;
import java.util.Random;
import java.util.Scanner; 
//���� ����(scissors) ����(rock) ��(papper) ���� �����
//1. ����� ���� �ľ��ؼ� ���� �����ϱ�
//2. ��꿡 ���� ���� �����ϱ�
//3. �迭 �ε����� �̿��� ���� �����ϱ�

public class Game {
	public static void main(String[] args) {
		int scannum;
		int rannum = (int)(Math.random()*3%3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���. ����:0  ����:1  ��:2");
		scannum = input.nextInt();
				
		//���1)
		switch (scannum) {
		case 0:
			if(rannum==0){
				System.out.println("�����ϴ�.");
			}else if(rannum==1){
				System.out.println("�����ϴ�.");
			}else if(rannum==2){
				System.out.println("�̰���ϴ�.");
			}break;	
			
		case 1:
			if(rannum==0){
				System.out.println("�̰���ϴ�.");
			}else if(rannum==1){
				System.out.println("�����ϴ�.");
			}else if(rannum==2){
				System.out.println("�����ϴ�.");
			}break;	
			
		case 2:
			if(rannum==0){
				System.out.println("�����ϴ�.");
			}else if(rannum==1){
				System.out.println("�̰���ϴ�.");
			}else if(rannum==2){
				System.out.println("�����ϴ�.");
			}break;	
		default:
			break;
		}
	}
	
	//���2)��꿡 ���� ���� �����ϱ�
	//    ����:0, ����:0, ��:0
	//    ���:0, �̱�:1, ��:2
	//    �Լ��� ���¸� ���� �ؾ� ȣȯ
	public static int docalc(int com, int person){
		if(com == (person %3)) {
			return 0; //���
		}
		else if((com+1) == (person %3)) {
			return 2; //��
		}
		else
			return 1; //�̱�		
	}
	
	//���3)�迭 �ε����� �̿��� ���� �����ϱ�
	public static int doarray(int com, int person){
		int [][] judge = {{0,1,2}, {2,0,1}, {1,2,0}};
		return judge[com][person];
	}
	
}







