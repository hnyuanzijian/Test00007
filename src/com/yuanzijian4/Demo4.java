package com.yuanzijian4;

/*
�������飺

������������ã����������ͳһ�ĳ�ʼ����

���캯�������ã� ����Ӧ�Ķ�����г�ʼ����


��������ĸ�ʽ��
	
	{
		��������
	}

ע�⣺ ��������Ĵ����ű���λ�ڳ�Ա λ���ϡ�


���������
	1. �������顣
	2. �ֲ������.   ������λ�ڷ���֮�ڡ�  ���ã����ֲ̾� ���� ���������ڣ���ʡһ����ڴ档
	3. ��̬�����  static 
*/

class Baby{
	
	int id; //���֤
 
	String  name;  //����
	
	//��������...
	{
		//System.out.println("��������Ĵ���ִ����......");
		
	}

	//���ι��캯��
	public  Baby(int i , String n){
		id  = i;
		name = n;
	}
	
	//�޲ι��췽��
	public Baby(){
	}

	public void cry(){
		System.out.println(name+"���ۿ�...");
	}	
}



class Demo4 
{
	public static void main(String[] args) 
	{
		Baby b1 = new Baby(110,"����");  //  ���� ��ʣ ����
		System.out.println("��ţ�"+ b1.id + " ���֣�"+b1.name);
		/*
		System.out.println("��ţ�"+ b1.id + " ���֣�"+b1.name);
	
		new Baby(112,"��ʣ");
		new Baby();
		*/
		/*
		new Baby(110,"����");
		new Baby(112,"��ʣ");
		new Baby();
		*/
	}
}
