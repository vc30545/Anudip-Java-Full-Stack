package Super;
class Abb{
	Abb(int a) {
		System.out.println("Our team Members are : "  + a);
	}
}
class Baa extends Abb{
	
	Baa(){
		super(100);
		System.out.println("We are Playing Cricket");
	}
}
public class SuperCounstructorAccessUsingKeywordSuper {
	public static void main(String[] args) {
		Baa r = new Baa();
		
	}

}
