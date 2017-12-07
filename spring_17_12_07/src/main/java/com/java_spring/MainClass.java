package com.java_spring;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculation calculation = new calculation();
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mult();
		calculation.div();
	}

}
