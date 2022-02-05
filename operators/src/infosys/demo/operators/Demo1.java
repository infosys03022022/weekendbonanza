package infosys.demo.operators;
/*
  Unary operator-> acts one one operand
 */
public class Demo1 {

	public static void main(String[] args) {
		/*
		 * num1 and num2 are 2 local int variables
		 * num1 is assigned value of 10
		 * num2 is assigned value of 20
		 * = is assignment operator
		 * LHS=RHS
		 * The RHS entity  is assigned to LHS entity.
		 */
		
	 	 int num1=10;
		 int num2=20;
		 /* 
		  * pre increment 
		    as it is pre increment the variable value is
		    incremented by 1 and then it is displayed
		    so as the value in num1 is 10. 
		    so ++num1 means the value of num1 which is 10 gets
		    incremented by 1 and then the value is 
		    displayed as 11
		  */
		 System.out.println(++num1);
		/*
		 * post increment
		 * as it is post increment , first the num1 is
		 * displayed then the value of num1 is incremented
		 * so the value of num2 is displayed as 20
		 * and then incremented by 1
		 * So the following line will display 20.
		 */
		 System.out.println(num2++);
         /*
          *   the following line shows the incremented 
          *   value of num2 which is 21
          */
		 System.out.println(num2);
	}

}
