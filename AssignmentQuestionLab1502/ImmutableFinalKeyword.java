package AssignmentQuestionLab1502;

public class ImmutableFinalKeyword {
	/*
	 In this program we are using "final" keyword which makes the datatype immutable ,
	 In this program i have made int d immutable thatswhy we cant change the value of int d.
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a=5;
			int b=10;
			int c=b/a;
			final int d=a*b;
			
			System.out.println("before changing " +"c="+c);
			System.out.println("before changing " +"d="+d);
			
			c=a+b;
			//d=a-b;        here we tried to make changes but we failed ,beacause "d" is immutable
			System.out.println("after changing " +"c="+c);
			//System.out.println("after changing " +d);
		}
	
}
