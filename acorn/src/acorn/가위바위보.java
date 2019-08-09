package acorn;

import javax.swing.JOptionPane;

//���� ����(scissors) ����(rock) ��(papper) ���� �����
//1. ����� ���� �ľ��ؼ� ���� �����ϱ�
//2. ��꿡 ���� ���� �����ϱ�
//3. �迭 �ε����� �̿��� ���� �����ϱ�

public class ���������� {
	//  ����:0, ����:0, ��:0
	//  ���:0, �̱�:1, ��:2
	// ǥ : �����  0  1  2
	// com   0  0  1  2
	//       1  2  0  1
	//       2  1  0  1
	
	//���1)����� ���� �ľ��ؼ� ���� �����ϱ�
	public static int doif(int com, int person) {
		if(person==0){
			if(com==0) {return 0;}
			else if(com==1) {return 2;}
			else return 1;
		}
		else if(com==1) {
			if(com==0) {return 1;}
			else if(com==1) {return 0;}
			else return 2;
		}
		else  
			if(com==2) {return 2;}
			else if(com==1) {return 1;}
			else return 0;
	}			
	//���3)�迭 �ε����� �̿��� ���� �����ϱ� - ����� �迭�� ����
		public static int doarray(int com, int person){
			int [][] judge = {{0,1,2}, {2,0,1}, {1,2,0}};
			return judge[com][person];
		}				
	//���2)��꿡 ���� ���� �����ϱ�	(�Լ��� ���¸� ���� �ؾ� ȣȯ, 3���� ���� ����)
	public static int docalc(int com, int person){
		if( com == (person%3) ) { 
			return 0;} //���
		
		// 2 + 1 = 3
		// 0(����) + 1 == 1(����)
		// 1(����) + 1 == 2(��)
		// 2(��)  + 1 == 0 (����)
		else if( (com+1)%3 == (person%3) ) { 
			return 1;} 
		else {
			return 2;} 	
	}	
	
	
	
	
	public static void main(String[] args) {
		int input;
		String temp; //���ڿ�
		int count = 0;
		int victory = 0;
		int lose = 0;
		int draw = 0;
	
		while(true){ //�ݺ��� ���ǹ�,
			//�Է� => ó�� => ���
			temp = JOptionPane.showInputDialog("[ (����)=0, (����)=1, (��)=2, (����)=3 ]:");
			input = Integer.parseInt(temp);
			int answer = (int)(Math.random() * 100) + 1;
			
			if(input == 3){ //������ ����
				System.out.println("\n===���Ӱ�� :" + count + "�� " + victory + "��" + draw +"��� " +lose + "��. ===");
				break;
			}
			count++;
			
			//not
			if(!(input == 0 || input == 1 || input == 2 || input == 3)){
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
				input = Integer.parseInt(temp);
				count--;
			}
			
			else{
				int result = doif(answer%3, input);
				if(result == 0){ draw++; }                                                       
				else if(result == 1){ victory++; }
				else lose++;
			}
			
			System.out.println("���Ӱ��: " + count + "�� " + victory + "�� " + draw + "���" + lose + "��.\n");
		}
	}
	
}




