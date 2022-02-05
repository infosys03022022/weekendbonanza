package infosys.demos;

public class Demo1 {

	public static void main(String[] args) {
		int num1=10;
		double d=num1; // (type conversion)
		//int num2=d; ( Compilation error)
		int num=(int)d;	// ( type casting)
		
		int num2='A';
	    System.out.println(num2);
	}

}
