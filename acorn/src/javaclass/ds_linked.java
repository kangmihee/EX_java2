package javaclass;
//�ڷᱸ�� : �����͸� �����ϴ� ����
//�������¿� ���� ���й��
	//stack : LIFO, FILO
	//Queue : FIFO ��⿭ : memory, printer�� �ӵ���

//������ ������ 
	//�迭/list/hash(hash�Լ�: Ű�� �ּҰ� mapping�ϴ� �Լ�)

	//1)�迭 : �������� �޸� ������ ����, ���Ի����� �ҷ�
	//2)list : �������� ���̳� �ڿ� ������������ �ּҸ� ����
		//�޸� ������ ����������, �޸𸮸� ȿ�������� ��밡��
		//����, ���� ����
	
	//3)hash�Լ� : �˻��ӵ��� ���� ����(�����޸�)
		//�������� : Ű�� + ������ ����, Ű�̸� �ּҰ����� ��ȯ

//���α׷� ���� ����
//������ ���α׷��� -> ��ü ���� ���α׷��� -> �Ϲ�ȭ ���α׷��� -> �Լ�ȭ ���α׷���
//���������� ����   -> ������ + �Լ�
//  			    -> �����ε��� �������̵� -> ��ǥŸ�Ի�� (TŸ��...���Ÿ������ ��밡���ϴ�)
//					-> �Լ��̸��� ������  ( T -> int, T -> float )
//						T add(T a, T b){ 
//								return a + b; }

//Collection => oracle������ Collection
//�ڹ��� �ڷᱸ�� = ��� + Generic �� �̿��ؼ� �۾�
// Iterable (�ݺ���) => COllection => List, Queue, Set

import java.util.*;
public class ds_linked {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(); //���ڿ��� ��� ���׷� ����
		
		//�޸� + �Լ�
		v.add("����"); //iterator �ּҸ� �迭������ ����
		v.add("�α�");
		v.add("����");
		
		Iterator<String> itr = v.iterator(); //Iterator(�ݺ���)
		//reference ����, �ּҺ���
		while(itr.hasNext()){ 
			System.out.println(itr.next()); //���������� �����͸� ó���ϵ��� �ε���
								//next()�� �ڽ��� ����Ű�� ����������ҿ��� ������ġ�� ���������� �ϳ� �����ؼ� �̵��ϴ� ��
		}
		ArrayList<String> list = new ArrayList<String>();
		v.add("����"); 
		v.add("�α�");
		v.add("����");
		System.out.println(list);
		
		Iterator itr_list = list.iterator();
		while(itr_list.hasNext()){ 
			System.out.println(itr_list.next()); 
		}
		for(String obj:v){ //for in
			System.out.println(obj);
		}
		for(int i=0;i<v.size();i++){ //���ᰪ�� size��
			System.out.println(v.get(i)); //get �Լ��� �̿��� ��� ���� 
		}
		
		//�����Լ� ��, �ڹٿ��� �Լ��� ����Ϸ��� : �ݵ�� Class�� �̿�
		//foreach�� �������� �Լ�
		//lambda�Լ� - python���� : �����Լ�
		//(int a, int b) -> {return a+b;}
		//javascript - web browser���� �۵��ϴ� script : ���� ���� ȿ�� �ο�
		System.out.println("foreach�� ��� :"); //�Լ�ȭ ���α׷���
			v.forEach(a->{ 
				System.out.println(a);
				//���ڿ��� �⺻�� ������ (1���� �迭, �迭�� �⺻������)
			});
		System.out.println(" foreachRemainimg() :");
		Iterator<String> itr_2 = v.iterator();
		itr_2.forEachRemaining(a->{
			System.out.println(a);
		});	
	}
}
