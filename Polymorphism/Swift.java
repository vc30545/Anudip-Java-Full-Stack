package Polymorphism;

public class Swift extends Car {
	
	

	public Swift()
	{
		
	}

	public Swift(String ctype, Engine e) {
		super(ctype, e);
		// TODO Auto-generated constructor stub
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Start the Swift Car");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Move the Swift Car");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the Swift car");
		
	}
	

}
