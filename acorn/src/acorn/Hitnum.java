package acorn;

import javax.swing.JOptionPane;  //Java GUI ��Ű��
public class Hitnum {

	public static void main(String[] args) {
		int answer = (int)(Math.random() * 100) +1;
		int input = 0;
		// char �ѹ��� char [] ch ���ڿ��� ó������
		String temp = ""; //���ڿ� class
		int count = 0;
		do{ // GUI ����� interface�� ��� => text �Է�(�Է±⺻���� string��)
			count++;
			temp = JOptionPane.showInputDialog("1~100������ �� �Է� " + "����� -1");
			if(temp.isEmpty() || temp.equals("-1")) {
				break;
			}
			System.out.println("�Է��� ��: " + temp );
			input = Integer.parseInt(temp);
			if(answer > input) {
				System.out.println("���ڰ� �ʹ� �۽��ϴ�. ");
			}else if(answer < input) {
				System.out.println("���ڰ� �ʹ� Ů�ϴ�. ");
			}else {
				System.out.println("�����Դϴ�. ");
				System.out.println("�Է��Ͻ� Ƚ���� " +count+"ȸ �Դϴ�." );
				break;
			}
		}while(true); //while�� ���� ������� ���
		//1���� �ݵ�� ����
					
	}
}
