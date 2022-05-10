package Constructor;

public class StaticInstanceBlock {
	
	
	StaticInstanceBlock(){
		int a=252;
		String name= "Darshana";
		System.out.println("Roll number is "+a+" "+"Name : "+name);
	}
	
	
	{
		int a=25; 
		String name = "Chaudhari";
		System.out.println("Roll number is "+a+" "+"Name : "+name);
	}
	
	static {
		int a=10;
		String name = "vishal";
		System.out.println("Roll number is "+a+" "+"Name : "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInstanceBlock ref = new StaticInstanceBlock();
	}

}
