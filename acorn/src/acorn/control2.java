package acorn;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//if else if else
//switch / case��

public class control2 {

	public static void main(String[] args) throws IOException { //throws IOException...����ó������� �����ȳ�
		//class�� �Ű����� Ŭ������ �ν��Ͻ��ؼ� ����...new InputStreamReader(System.in)
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//���ڿ� ������� ������ ���ڿ�
		String imsi = in.readLine(); //���ڿ� String������ �Է�
		int score = Integer.parseInt(imsi); //���ڷ� ��ȯ
		char grade = ' '; //���鵵 ������
		switch (score/10) { //if�� ����� ���� �񱳿�����
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
		default: //������ ���� default�� ó��
			grade = 'F';
		}
		System.out.println("���= " + grade + "���");	
		
		
		//����. �۾��ð��� �Է¹޾Ƽ� 5000�ð��� �Ѿ�� 100, �ƴѰ��� �ñ�80���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(if�� ���)
		String time1 = in.readLine(); 
		int time2 = Integer.parseInt(time1); 
		if(time2 > 5000){
			System.out.println("�޿�: " + time2*100 + "��");
			}
			else
				System.out.println("�޿�: " + time2*80 + "��");
		
		//�ٸ����.
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		hours = input.nextInt();
		
		
		System.out.println("�ð��� �Է��Ͻÿ� : ");
		
		if(hours>5000)
		{
			pay = hours * 100;
			//format���ڿ� d: digit, s:string
			//escape���ڿ� - Ư���� ����
			//newline = ���͸��Է��ѰͰ� ���� ȿ�� 
			//printf : format ���ڿ� 
			System.out.printf("�ӱ���%d�Դϴ�.\n", pay); //c�� ȣȯ�ϱ�����		
		}
		else
		{
			pay = hours * 80;
			System.out.printf("�ӱ���%d�Դϴ�.\n", pay);
		}
	
		
		//�ݺ�Ƚ��, ���� �̿��ϴ� ���
		//�ݺ��� 1���� 10������ �� : ���������� ��������
		int sum = 0; //��������  sum = sum + i ��������
		int i = 0;  //�������� i = i + 1 ����� ��
		int count = 0;  //����ȱ��
		for(i=0;i<=10;i++){ //�ʱⰪ, �Ѱ谪, ������
			sum += i; //����
			// 1 2 3  4  5  6  7  8  9 10 
			// 1 3 6 10 15 21 28 36 45 55
			
			count +=1;		
		}
		System.out.println("i����= " + i ); //���:11
		System.out.println(i-1 + " ������ ����= " + sum); //���:55
		System.out.println("Ƚ��= " + count); //���:11
		
		
		//���� for�� = �����������ʹ� ����̷���
		for(i=2;i<=9;i++){ //2 3 4 5 6 7 8 9 => 8��
			for(int j=1;j<=9;j++){ //1 2 3 4 5 6 7 8 9 => 9��				
				//�� 78�� ���ư�				
				System.out.println(i +" * "+ j +" = "+ i*j);
			}
		}
		
		//
		for(i=1;i<=3;i++)
			for(int j=1;j<=3;j++)	
				for(int k=1;k<=3;k++)	
					System.out.println(""+i+j+k);
		
		//
		i=10;
		//while���� Ƚ���� ������ �� ������, �������Ǹ� �˰� ���� �� ����Ѵ�.
		while(i>=0) { //������ ���� ������ �ݺ�, �ַ� ���ѷ���
			System.out.println(i--);
		}
		
		
		//����. while������ ������ �����
		i=1;
		while(i<=9){
			int j=1;
			while(j<=9){			
				System.out.println(i +" * "+ j +" = "+ i*j);
				j++;
			}
			i++;							
		}				
	}
	

}
