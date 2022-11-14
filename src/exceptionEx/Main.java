package exceptionEx;

public class Main {

	public static void main(String[] args) {
		try
		{
			int array[] = {1,2,3,4};
			System.out.println(array[10]);
		}
		catch(Exception e)
		{
			System.out.println("something went wrong..");
		}
		finally
		{
			System.out.println("The 'try' and 'catch' finished");
		}

	}

}
