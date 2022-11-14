package Inheritance;
//Parent class
class Car{
	   public Car()
	   {
		System.out.println("Class Car");
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}
//Child class
	class Maruti extends Car{
	   public Maruti()
	   {
		System.out.println("Class Maruti");
	   }
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
	public class MultiLevelEx extends Maruti{

	   public MultiLevelEx()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	  
	   public static void main(String args[])
	   {
		 MultiLevelEx obj=new MultiLevelEx();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}


