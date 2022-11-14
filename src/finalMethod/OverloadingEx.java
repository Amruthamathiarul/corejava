package finalMethod;
class Sum {
	 
    public final void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
 
    public void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
 }
 
public class OverloadingEx 
{
	public static void main(String[] args) {
		Sum s = new Sum();
		s.sum(10, 5);
		s.sum(10, 5, 20);
	}
}



