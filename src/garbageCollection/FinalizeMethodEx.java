package garbageCollection;

public class FinalizeMethodEx {
	public static void main(String[] args) {
		FinalizeMethod str2 = new FinalizeMethod();
		str2 = null;

		System.gc();
		System.out.println("output of main method");

	}

	protected void finalize() {
		System.out.println("output of finalize method");
	}
}
