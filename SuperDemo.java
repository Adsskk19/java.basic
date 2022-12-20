class A{
	public A() {
		System.out.println("in A");
	}
	public A(int i) {
		System.out.println("in A int");
	}
}
class B extends A  //Sub class
{
	public B() {
		super(0);
		System.out.println("in B");
	}
	public B(int i) {
		super(i);
		System.out.println("in B int");
	}
}
public class SuperDemo 
{

	public static void main(String[] args) 
	{
		//A a = new A(2);
		B b = new B();
	}

}
