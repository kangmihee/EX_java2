package acorn;
//����
//���� ���� ���� �����̴�. 
//���� ���� ������ �հ�� ����� ���Ͻÿ�
//���κ� �հ�� ����� ���Ͻÿ�
//��տ� ���� grade�� ���Ͻÿ�
//����� �Ҽ��� 2°�ڸ����� �ݿø��Ͻÿ�
//�迭, �ݺ���
//90, 90, 90 //�����հ�
//20, 20, 20
//30, 30, 30
//40, 40, 40
//50, 50, 50
//�����հ�

class Data2 { //1���� �迭�� ó�� ����
	int korea;
	int english;
	int math;
	int sum;
	float avr;
	public Data2(int korea, int english, int math) {
		this.korea = korea; this.english = english; this.math = math;
		this.sum = korea + english + math;
		this.avr = this.sum / 3.0f;		
	}
	
	public void run() { 
		System.out.println("�հ��:"+ this.sum + " �����:" + this.avr);
	}
}


public class Sunjuk1 {
	public static void main(String[] args) {
		int kor=0, eng=0, math=0;
		
		int[][] sunjuk = {{99, 91, 89},{88, 70, 71},{40, 65, 17},{80, 62, 65},{95, 68, 93}};
		
		for(int i=0;i<sunjuk.length;i++){  //���ǰ���
			int sum=0;
			char grade;
			kor=kor+sunjuk[i][0];
			eng=eng+sunjuk[i][1];
			math=math+sunjuk[i][2];	
			
			System.out.print(" " + (i + 1 )+ " ");
			
			for(int j=0;j<sunjuk[i].length;j++){ //���ǰ���
				sum = sum + sunjuk[i][j];
			}			
			if(sum/sunjuk[i].length >=90)
				grade = 'A';
			else if(sum/sunjuk[i].length>=80)
				grade = 'B';
			else if(sum/sunjuk[i].length>=70)
				grade = 'C';
			else if(sum/sunjuk[i].length>=60)
				grade = 'D';
			else 
				grade = 'F';
			
			
			
			System.out.println("���κ� �հ��: " + sum + "  �����: " + (Math.round(sum*10 /(float)sunjuk[i].length)/10f) + "  ������: " + grade);			
		}System.out.println("���� �հ�= " + "����:"+ kor + " ����:" + eng+" ����:" +math );
		 System.out.println("���� ���= " + "����:"+ Math.round(kor*10/(float)sunjuk.length)/10f + 
				                           " ����:" + Math.round(eng*10/(float)sunjuk.length)/10f + 
				                           " ����:" +Math.round(math*10/(float)sunjuk.length)/10f );
		 
		 
		 //Ŭ������ �̿��� �����հ�� �����¿� ���ؼ� �����Ͻÿ�.
		 //Ŭ������ 1���� �迭�� ������ ȿ���� ����
		 //string�� �ѹ��� �ϸ� �ڵ� string��ü�� 1���� �迭
		 Data2 [] score = new Data2[3]; //��ü�� ����� �ּ� �迭�� heap�� ����
		 score[0]= new Data2(15,25,30);
		 score[0].run();
		 
		 Data2 [] data1 = new Data2[5]; //��ü�� ����� �ּ� �迭�� heap�� ����
		 data1[0] = new Data2(90,  90,  90); //���� �����͸� ����. �� �ּҸ� �ּ� �迭�� ����
		 data1[1] = new Data2(20,  20,  20);
		 data1[2] = new Data2(30,  30,  30);
		 data1[3] = new Data2(40,  40,  40);
		 data1[4] = new Data2(50,  50,  50);
		 
		 Data2 [] data = {new Data2(90,  90,  90), new Data2(20,  20,  20),new Data2(30,  30,  30), 
				          new Data2(40,  40,  40), new Data2(50,  50,  50) };
		 
			for(int i=0; i< data.length;i++){ //����� ���� ������Ÿ���� class
				
				System.out.print(data[i].korea+ " " + data[i].english + " " + data[i].math + " " 
				                + data[i].sum + " " + data[i].avr + "\n");
			}
			kor = 0;
			eng = 0;
			math = 0;
			for(int i=0; i<data.length;i++){
				kor += data[i].korea;
				eng += data[i].english;
				math += data[i].math;	
			}
			System.out.println("���� �հ�= " + "����:"+ kor + " ����:" + eng+" ����:" +math );
			 System.out.println("���� ���= " + "����:"+ Math.round(kor*10/(float)sunjuk.length)/10f + 
					                          " ����:" + Math.round(eng*10/(float)sunjuk.length)/10f + 
					                          " ����:" +Math.round(math*10/(float)sunjuk.length)/10f );
		 		 
		}
		
	}

