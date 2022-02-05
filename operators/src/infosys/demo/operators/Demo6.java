package infosys.demo.operators;

public class Demo6 {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=10;
		System.out.println(num1<num2);    // true
		System.out.println(num1>num2);    // false
		System.out.println(num1<num3);    // false
		System.out.println(num1>num3);     // false 
		System.out.println(num1==num2);    // false
		System.out.println(num1==num3);    // true
		System.out.println(num1=num2);     // 20
		System.out.println(num1==num3);     // false num1 values changes from 10 to 20
        System.out.println(num1>=num2);      // num1 is not greater than num2 but is equal to num2
	    System.out.println(num1<=num2);     // num1 is not less than num2 but is equal to num2
	    System.out.println(num1!=num2);     // false
	    System.out.println(num1!=num3);     // true
	} 

}
