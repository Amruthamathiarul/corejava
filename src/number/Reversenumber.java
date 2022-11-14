package number;

public class Reversenumber { 
		int r;
		long REVNUM(long n,long res)
		{
			if (n==0)
				return res;
			else
			{
				r = (int) n % 10;  // 4  3   2   1
				res = res*10 + r; // 0*10+4 , 4*10+3 , 43*10+2  ,432*10+1=4321 , 0
				n = n / 10; // 1234 /10  = 123   , 123 /10 = 12 , 12/10 =1   , 1/10 = 0
				return REVNUM(n,res);
			
			}			
		}
		
		
		public static void main(String... g)
		{
			long r=0;
			
			Reversenumber obj = new Reversenumber();
			System.out.println("Reverse number : "+obj.REVNUM(1234,r));
					

	}
	}

	
	



