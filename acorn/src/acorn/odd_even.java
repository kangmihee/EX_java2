package acorn;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class odd_even {
	public static void main(String[] args) { // static : �ν��Ͻ� ���� ����
		//����. Ȧ¦���� = turn around ����, ��븦 ����, ���: �Է�, ��ǻ�� : random		
		int count =0;  int win = 0;  int loss = 0;
		Scanner scan = new Scanner(System.in);
		for(;;){ // ���ѷ���...�������� ��� break�Է����� ��������ش�.
			System.out.println("0(¦)"
					+ ", 1(Ȧ)�� �Է��ϼ���.");
			// Integer.parseInt : ����ȯ
			int person = Integer.parseInt(scan.nextLine()); //���ڷ� �Է�
			if( person == 9 ) break; // break : for���� ������ �����Ŵ
			int com = (int)(Math.random() *2); // Math : static method ���� ����
			if( person%2 == com ){
				win+=1;
				System.out.println("���߾����ϴ�. ");
			}else{
				loss+=1;
				System.out.println("Ʋ�Ƚ��ϴ�. (�����) ");
			}
			count +=1;
		}
		System.out.println("�Ѱ���Ƚ���� = " + count + "�� : " + win +"�� : "+ loss +"�� �Դϴ�. ");
	}
}
