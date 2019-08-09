package acorn;

//Ŭ���� base�� �۾��ϸ�...
//��üȭ : user(�����), com(�Է�), judge(����)
//���� : Ŭ���� ���̽��� ���������������� �����Ͻÿ�.

import javax.swing.JOptionPane;

class User{ //�����Է� ���� //������� + ����Լ�
	int input = 0;
	String temp ="";

	User(){}
	User(int input){		
		this.input =input;	
	}
	public int getUser(){
		temp = JOptionPane.showInputDialog("[ (����)=0, (����)=1, (��)=2, (����)=3 ]:");
		if(temp == null || temp.equals("3"))
			return 3;	
		System.out.println("�Է��� ��: " + temp);
		input = Integer.parseInt(temp);
		return input;
	}
}

class Com{	
	private int answer;
	Com() {
		answer =0;
	}
	Com(int answer){
		this.answer = answer;
	}
	public int getComputer(){
		answer = ((int)(Math.random() * 100 )) % 3;
		return answer;
	}
}

class Judge{ //���и� ����, ����� ������ �־����(����), ���Ӱ�� ���
	int victory;
	int lose;
	int draw;
	int count;
	
	Judge() {
		victory = 0;
		lose = 0;
		draw = 0;
		count = 0;
		System.out.println("������ �ʱ�ȭ �Ǿ����ϴ�.");
	}
	
	public static int doarray(int com, int user){
		int [][] judge = {{0,1,2}, {2,0,1}, {1,2,0}};
		return judge[com][user];
	}	
		
	//�Լ��� Ŭ���� : � �����͸� ó���� ������, ó���� ���� � �����͸� ������ ������
	public void gamdicidion(int com, int user){
		
		int result = doarray(com, user);
		count++;
		if(result==0){
			System.out.println("���");
			draw++;
		}else if(result==1){
			System.out.println("�̱�");
			lose++;
		}else{
			System.out.println("��");
			victory++;
		}
		print();
	}
	public void print(){
		System.out.println("���Ӱ��: " + count + "�� " + victory + "�� " + draw + "��� " + lose + "��.\n");
	}
}


public class ����������Ŭ���� {
	public static void main(String[] args) {
		
		Com com = new Com();
		User user = new User();
		Judge jud = new Judge();
		
		while(true){
		int sel = user.getUser();
		if(sel == 3){
			jud.print();
			System.out.println("������ ����Ǿ����ϴ�.");
			break;
		}
		jud.gamdicidion(com.getComputer(), sel);
		
		}
	}
}

