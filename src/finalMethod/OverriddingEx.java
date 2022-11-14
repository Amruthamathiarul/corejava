package finalMethod;
class SumTest {
	 
    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
 
    public final void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
 }
 
public class OverriddingEx extends SumTest
{
    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
	public static void main(String[] args) {
		SumTest s = new SumTest();
		s.sum(10, 5);
		s.sum(10, 5, 20);
		OverriddingEx o= new OverriddingEx();
		o.show();
		
	}
	private void show() {
		// TODO Auto-generated method stub
		
	}
	
	
}

