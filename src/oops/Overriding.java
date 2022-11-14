package oops;

         //parent class
		  class Bank
		{
			int gerRatesOfInterest()
			{
				return 0;
				
			}}
			//creating child class
			class SBI extends Bank
			{
				int gerRatesOfInterest()
				{
					return 8;
				}}
				class ICIC extends Bank
				{
				int gerRatesOfInterest()
				{
					return 7;
				}}
				class AXIS extends Bank
				{
					int gerRatesOfInterest()
					{
						return 9;
					}
				}
				

		public class Overriding {

			public static void main(String[] args) {
				  SBI s=new SBI();
				  ICIC i=new ICIC();
				  AXIS a=new AXIS();
				  System.out.println("SBI rates of interest:"+s.gerRatesOfInterest());
				  System.out.println("ICIC rates of interest:"+i.gerRatesOfInterest());
				  System.out.println("AXIS rates of interest:"+a.gerRatesOfInterest());
			}}

	

	