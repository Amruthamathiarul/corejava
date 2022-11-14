package Array;

public class avg {
	public static void main(String[] args) {
int[] num = new int[6];
num[0]= 25;
num[1]=37;
num[2]=44;
num[3]=53;
num[4]=68;
num[5]=79;

double avg = 0.0;
int sum = 0;
//Find the sum of these numbers.
	for(int i = 0; i <6; i++)
		 sum  = sum + num[i];
		 avg = (double)sum/6;
		 System.out.println("Sum of six numbers: " +sum);
		 System.out.println("Average of six numbers: " +avg);


	}
	

}
