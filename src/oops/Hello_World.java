package oops;
	//Creating a parent class. 
	class Books{ 
	//defining a method 
	void run()
	{
	System.out.println("Book not in stock");
	} 
	} 
	//Creating a child class
	class Hello_World extends Books{
	void run()
	{
	System.out.println("Book is available");
	}
	public static void main(String[] args) {
	Books obj = new Books(); //creating object 
	Hello_World obj1 = new Hello_World();
	
	obj.run(); //calling method
	obj1.run();
	}
	}

