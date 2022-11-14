package string;

import java.util.Arrays;
//import java.util.Arrays;

public class Getchar {
     public static void main(String[] arags) {
    	 String s1="JAVA";
    	 char[]dest=new char[4];
    	 s1.getChars(0,4,dest,0);
    	 System.out.println(Arrays.toString(dest));
     }
}
