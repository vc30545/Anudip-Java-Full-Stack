package inheritance;

public class SecondClass extends FirstClass {
	String name = "Vishal";
	static int subtract(int a , int b) {
		int z = a- b;
		System.out.println("Substraction is : "+z);
		return z;
	}
	void dis() {
		System.out.println("Name is: "+name+"A: "+a+"B: "+b);
	}
	

}
