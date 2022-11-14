package com.javapackage;

public class LambdawithParameter {
	public static void main(String[] args) {
		int speed=200;
		Runnable1 r= (int carSpeed)-> {
				System.out.println("Running at the speed of" +carSpeed);
				};
				r.run(speed);
}
		}


