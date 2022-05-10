package Polymorphism;

public abstract class Car

{
	String ctype;
	Engine e;
	
	public Car()
	{
		
	}
	
	public Car(String ctype) {
		super();
		this.ctype = ctype;
	}

	public Car(String ctype, Engine e) {
		super();
		this.ctype = ctype;
		this.e = e;
	}
	
	
	
	void display()
	{
		System.out.println("Car Type is : "+ctype);
		System.out.println("Brand Name is "+e.cname + "\n "+"Horse Power"+e.hp);
	}

	abstract void start();
	abstract void move();
	abstract void stop();

}
