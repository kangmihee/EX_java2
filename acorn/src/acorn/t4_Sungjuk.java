package acorn;
import java.io.BufferedReader;
import java.io.IOException;
//������ : 
// 1) �ݺ��Ǵ� �κ� : �Լ��� �����Ͻÿ�
// 2) ���������� ���� �����ϰ� ������ ���� �Լ��� �ۼ��Ͻÿ�
     //set : �Ű������� ����, void
     //get : ���ϰ� ����, �Ű����� ����
// 3) �Է¹޴� �͵� Ŭ������ �Լ��� �����Ͻÿ� (set/get)
import java.io.InputStreamReader;
//�Է��� ���� ��Ű��

//����Ŭ���� (�̸�, ����, ����, ����, ����, ���)�� �ۼ��Ͻÿ�
//�����ڸ� �̿��ؼ� �ʱ�ȭ
//�����͸� ���ڿ��� ���� ����ϴ� �Լ��� ����
//����Ŭ���� 3���� �Է��� �� �ִ� �迭�� ������ ���� �ǽð����� �迭�� ���� �Է�
//�Էµ� ���� ����Ͻÿ�


//Scanner ���ڿ� int // ���۷�
public class t4_Sungjuk {
	public static void main(String[] args) throws IOException {		
		//���1)
/*		 String name;
		 int kor = 0;
		 int eng = 0;
		 int math = 0;		 
		 BufferedReader typein = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("�̸� ���� ���� ���� ������ 3�κ��� �Է��Ͻÿ�.");
	      Student20[] school = new Student20[3]; //�ּҰ� �����ϴ� �迭�� ���� �ּ�
	      for (int i = 0; i < 3; i++) {
	         name = typein.readLine(); //���ڿ�
	         kor = Integer.parseInt(typein.readLine()); //���� �Է�
	         eng = Integer.parseInt(typein.readLine());
	         math = Integer.parseInt(typein.readLine());
	         school[i] = new Student20(name,kor,eng,math);
	      }
	      System.out.println(school[0].printhead());
	      for (int i = 0; i < 3; i++) {
	         System.out.println(school[i].lasttoString());
	     	}*/
		
		//���2)...�ڵ尣������
		Student20[] school = new Student20[3]; //�迭�� �ּ�
		for (int i = 0; i < 3; i++) {
			school[i] = new Student20(); //�����ڿ� �ִ� �Է� ����
		}
		System.out.println(school[0].printhead());
		for (int i = 0; i < 3; i++) {
	         System.out.println(school[i].lasttoString());
	     	}	
			
		//�޴�ȭ
		System.out.println("===========*�������� ���α׷�*===========");	
		menuOpen(school);
	}
	
	//�迭�� �Ű������� �ϴ� �Լ�
	public static void menuOpen(Student20[] school) throws IOException{
		int inputNum = 0;
		boolean re = false;
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		while(!re){
			re = true;
			System.out.println("1.�˻�,  2.���, 3.����,  9.����");
			System.out.println("�޴� ���� : ");
			inputNum = Integer.parseInt(stdin.readLine());
			switch ((inputNum)) {
			case 1: System.out.println("1�˻�����.");
					String inputName = stdin.readLine();
					for(int i =0;i<3;i++){
						if(school[i].name.equals(inputName)){
						System.out.println(school[i].lasttoString());
						}
					}
					menuOpen(school);
					break;
			case 2: System.out.println("2��³���.");
					System.out.println(school[0].printhead());
					for(int i =0;i<3;i++){
						System.out.println(school[i].lasttoString());
					}
					menuOpen(school);
					break;
			// ���� : �����ϰ��� �ϴ� �̸� �Է� => �̸��� �˻� => ������ ������ �����͸� �Է� => �Էµ� �����ͷ� ������ ������ ����
			case 3: System.out.println("3�����ҳ���.");
					String readName = stdin.readLine();
					for(int i =0;i<3;i++){
						if(school[i].name.equals(readName)){
							System.out.println(school[i].lasttoString());				
							String modifyname = stdin.readLine();
							school[i].setName(modifyname);
						}
					}					
					break;
			case 9: re = true; 
					break;	
			default:{System.out.println("�ٽ� �Է����ּ���.");
					re = false; 
					break;}
			}
		}
	}
}

class Student20{
	  String name;
	  int kor;
	  int eng;
	  int math;
	  int sum;
	  float average;
	  	  
	  Student20()throws IOException{//����Ʈ ������
		  BufferedReader typein = new BufferedReader(new InputStreamReader(System.in));
		  this.name = typein.readLine(); //���ڿ�
		  this.kor = Integer.parseInt(typein.readLine()); //���� �Է�
		  this.eng = Integer.parseInt(typein.readLine());
		  this.math = Integer.parseInt(typein.readLine());	         	  
	  }
	  	  
	  public void input() throws IOException{
		  BufferedReader typein = new BufferedReader(new InputStreamReader(System.in));
	  	  name = typein.readLine(); //���ڿ�
          kor = Integer.parseInt(typein.readLine()); //���� �Է�
          eng = Integer.parseInt(typein.readLine());
          math = Integer.parseInt(typein.readLine());	
          //typein.close();
	  }
	  
	  public int total_fun() {
		  return this.kor + this.eng + this.math;
	  }
	  public float avr_fun() {
		  return average = Math.round((double)sum / 3);
	  }
	  	  	  
	  Student20(String name, int kor, int eng, int math) {		 	
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			sum = total_fun();
			average = avr_fun();
	  }
	    
	  public String toString(){
		  return kor + "," + eng + "," + math;
	  }
	  
	  public String lasttoString(){
		  sum = kor + eng + math;
		  average = Math.round((double)sum / 3);
		  return name + "   " + kor + "   " + eng + "   " + math + "   " + sum + "   " + average; 
	  }
	  
	  public String printhead() {
		  return "�̸�" + "   " + "����" + "   " + "����" + "   " + "����" + "   " + "�հ�" + "   " + "���"; 
	  }
	  	  
	  public void setName(String name) {this.name= name;}
	  public void setKor(int kor) {this.kor= kor;}
	  public void setEng(int eng) {this.eng= eng;}
	  public void setMath(int math) {this.math= math;}
	  
	  public String getName() {return name;}
	  public int getKor() {return kor;}
	  public int getEng() {return eng;}
	  public int getMath() {return math;}

}





