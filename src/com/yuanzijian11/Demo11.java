package com.yuanzijian11;

class Emp{
	//�Ǿ�̬�ĳ�Ա����
	static int count = 0;
	
	String name;
	
	//��������
	
	public Emp(String name){
		this.name = name;
	}
	public Emp(){
		
	}
	public void showCount(){
		System.out.println("������" + count  + "������");
	}
}

public class Demo11 {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 =new Emp();
		e3.showCount();
	}
}
