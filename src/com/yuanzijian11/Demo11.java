package com.yuanzijian11;

class Emp{
	//非静态的成员变量
	static int count = 0;
	
	String name;
	
	//构造代码块
	
	public Emp(String name){
		this.name = name;
	}
	public Emp(){
		
	}
	public void showCount(){
		System.out.println("创建了" + count  + "个对象");
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
