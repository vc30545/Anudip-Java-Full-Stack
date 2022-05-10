package Constructor;
import java.util.Scanner;

class Addition{
	int c;
	Addition(int a, int b){
		 c = a+b;
	}
	void show() {
		System.out.println("Addition is "+c);
	}
	Addition(int a, int b, int c){
		System.out.println("Addition of Three Number is "+(a+b+c));
	}
	
}



public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Constructor overloading");
		System.out.println("Enter three Numbers");
		int aa = sc.nextInt();
		int ab = sc.nextInt();
		int ac = sc.nextInt();
		sc.close();
		Addition ref = new Addition(aa, ab);
		ref.show();
		Addition ref1 = new Addition(aa, ab, ac);
		

	}

}
