package com.learn;

public class Lion extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animal a = new Lion();
			a.mammal();//upcasting. a has reference of Animal class so we dont have access to method name()
			Lion l = (Lion)a;//downcasting
			l.name();
			
	}
	 public void name() {
		 System.out.println("hello");
	 }
	 
	 public void mammal() {
		 System.out.println("lion");
	 }
	

}
