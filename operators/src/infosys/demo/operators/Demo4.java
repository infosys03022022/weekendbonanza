package infosys.demo.operators;

public class Demo4 {

	public static void main(String[] args) {
		int num1=10;
		int num2;
		/*
		 * In the following line the value of num1 is first incremented and then assigned to num2
		 * so the value in num1 gets increments as 11 and then assigned to num2 and num2 also
		 * contains the value as 11.
		 */
		num2=++num1;
		System.out.println(num1); // 11
		System.out.println(num2); // 11
		int num3=20;
		/*
		 * In the following line the value of num3 is first assigned to num4 and then incremented.
		 * so the value in num4 is 20 and value of num3 becomes 21
		 */
		int num4=num3++;
		System.out.println(num4); // 20
		System.out.println(num3); // 21

	}

}
