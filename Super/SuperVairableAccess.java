package Super;


class A{
	int a =10;
}
class B extends A{
	int a =20;
	void show() {
		System.out.println(a);
		System.out.println(super.a);
	}
}



public class SuperVairableAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B r = new B();
		r.show();
	}

}
