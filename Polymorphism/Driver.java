package Polymorphism;

public class Driver {
	
	String name;
	int lno;
	
	 public Driver(String name, int lno) {
	
		this.name = name;
		this.lno = lno;
		System.out.println("DRIVER DETAILS : Name = "+ name + " and License no = "+lno);
	}




	void drive(Car c) {
		 c.start();
		 c.move();
		 c.stop();
	 }

}
