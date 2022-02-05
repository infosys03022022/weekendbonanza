package infosys.demo.operators;
/*
  Unary operator-> acts one one operand
 */
public class Demo2 {

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
		  * pre decrement 
		    as it is pre decrement the variable's value is
		    decremented by 1 and then it is displayed
		    so as the value in num1 is 10. 
		    so --num1 means the value of num1 which is 10 gets
		    decremented by 1 and then the value is 9 gets
		    displayed
		  */
		 System.out.println(--num1);
		/*
		 * post decrement
		 * as it is post decrement , first the num1 is
		 * displayed then the value of num2 is decremented.
		 * so the value of num2 is displayed as 20
		 * and then decremented.
		 */
		 System.out.println(num2--);
         /*
          *   the following line shows the decremented
          *   value of num2 as 19
          */
		 System.out.println(num2);
	}

}
