/*
 * Inner class
 *   method class
 *   static class
 *   Anonymous class
 * 
 * 
 * */
class Outer //outer class
{
	static int a;
	public static void show()
	{
		System.out.println("in Show");
	}
	static class Inner //Outer$Inner.class
	{
		public void display() 
		{
			System.out.println("in Display");
		}
		
	}
}
public class InnerDemo 
{
	//variables, method , class
	public static void main(String[] args)
	{
		//Outer obj =new Outer();
		//obj.show();
		//Outer.Inner obj1 = obj.new Inner();  //method class
		Outer.Inner obj1 = new Outer.Inner();   //static class

		obj1.display();
		
	}

}
