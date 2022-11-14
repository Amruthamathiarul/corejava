package methodoverloading;

public class MethodoverloadingEx {

		void sum(int a,double b)
		{
		System.out.println(a+b);
		}
		void sum(double b,int a)
		{
		System.out.println(a+b);
		}

		public static void main(String[] args) {
		MethodoverloadingEx obj=new MethodoverloadingEx();
		obj.sum(55,65.0);
		obj.sum(75.0,60);
		}

		}


