package ConstructorEx;
public class ParameterisedConstr {
	int i;
	ParameterisedConstr(int i)
	{
		i=1;
	
	System.out.println("Student for playing carrom:" + i);
}

	public static void main(String[] args) {
		
		ParameterisedConstr a =new ParameterisedConstr(1);
		ParameterisedConstr b =new ParameterisedConstr(2);
		ParameterisedConstr c =new ParameterisedConstr(3);
		ParameterisedConstr d =new ParameterisedConstr(4);
		ParameterisedConstr e =new ParameterisedConstr(5);
	}

}

