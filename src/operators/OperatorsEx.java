package operators;

public class OperatorsEx {
	public static void main(String[] args) {
		//Assignment operators
		int num1,num2;
		num1=35;
		System.out.println(num1);
		num2=30;
		System.out.println(num2);
		//Arithmetic operators
		//addition
		int output=num1+num2;
		System.out.println("num1+num2="+output);
	    //subtraction
		int result=num1-num2;
		System.out.println("num1-num2="+result);
		//multiplication
		int result1=num1*num2;
		System.out.println("num1*num2="+result1);
	    //division
		int result2=num1/num2;
		System.out.println("num1/num2="+result2);
		//modulus
		int result3=num1%num2;
		System.out.println("num1%num2="+result3);
		//unary operator
		double num=30;
		boolean flag=false;
		System.out.println("+num=" + +num);
		System.out.println("-num=" + -num);
		System.out.println("num=" + + +num);//now value is 31
		System.out.println("+num="+ --num);//number-1 that is 31-1=30
		System.out.println("!flag=" + !flag);//now value is 30
		System.out.println(num++);
		System.out.println(num);
		  
		System.out.println(++num);
		System.out.println(num);
		  
		  //Relational operator
		  if(num1>num2)
		  {
			  System.out.println("num1 is Greater");
		  }
		  if(num1<num2)
		  {
			  System.out.println("num2 is greater");
		  }
		  if(num1==num2)
		  {
			  System.out.println("num1 and num2 are equal");
		  }
			
		  //Logical operator
		  int num3=40;
		  boolean result4;
		  result4=(num1>num2)||(num3>num1);
		  System.out.println(result4);
		  result4=(num1>num2)&&(num3>num1);
		  System.out.println(result4);
		  
		  //Ternary operators
		  int februaryDays=29;
		  String display;
		  display=(februaryDays==28)?"Not a leap year":"Leap year;";
		  System.out.println(display);
		  
		  //bitwise operator
		  int a=50;  //50=  0011 0010
		  int b=20;   //20= 0001 0100
		  int c=0;
		  c=a&b; //0001 0000-16
		  System.out.println("a&b="+c);
		  c=a|b;  //0011 0110-54
		  System.out.println("a|b="+c);
		  c=a^b;  // 0010 0110-38
		  System.out.println("a^b="+c);
		  c=~a;
		  System.out.println("~a="+c);
		  //Shift operator
		  c=a>>2;
		  System.out.println("a>>2="+c);//0000 1100-12
		  c=a<<2;
		  System.out.println("a<<2="+c); //11001000-100
		  
		  
		}

	}
		
		
		
		
		
		
	
	


