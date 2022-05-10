package Super;

class AC{
	void show() {
		System.out.println("Java is my favourite");
	}
}
class BA extends AC{
	
	void show() {
		super.show();
		System.out.println("So i like a only java and oops");
	}
}


public class SuperMethodAccessUsingSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BA ref = new BA();
		ref.show();
	}

}
