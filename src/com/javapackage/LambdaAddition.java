package com.javapackage;
interface Addable{
	int add(int a,int b);
}
interface Multi{
	int multiply(int c, int d);
}
public class LambdaAddition {
	public static void main(String[] args) {
		Addable ad=(a,b)->(a+b);
		System.out.println(ad.add(5,7));
		Multi m=(c,d)->(c*d);
		System.out.println(m.multiply(8, 9));
		
		
				
	}

}
