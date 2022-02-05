package infosys.demo.operators;
/*
  Unary operator-> acts one one operand
 */
public class Demo3 {

	public static void main(String[] args) {
		
		// ! can be used with boolean only
	 	 int num1=10;
		 
		 // System.out.println(!num1);
		
	 	 char ch='A';
	 	 // System.out.println(!ch);
	     boolean b1=true;
	     System.out.println(b1); //true
	     
	     // ! which is a logical negation and when applied to a variable containing true will 
	     // convert the true value into false
	     System.out.println(!b1);  // false
	     boolean b2=false;
	     System.out.println(b2);  // false
	  // ! which is a logical negation and when applied to a variable containing false will 
	     // convert the false value into true
	     System.out.println(!b2);  // true
	     
	}

}
