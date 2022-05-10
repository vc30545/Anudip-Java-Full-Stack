package Polymorphism;

public class TataSumo extends Car{
	
	
	public TataSumo() {
		super();
	}
	
	public TataSumo(String ctype) {
		super();
		this.ctype = ctype;
	}

	public TataSumo(String ctype, Engine e) {
		super(ctype, e);
		// TODO Auto-generated constructor stub
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Start the Tata Sumo");
		
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Move the Tata Sumo Car");
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the Tata Sumo car");
		
		
	}

}
