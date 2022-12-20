class Calc
{
	int num1;
	int  num2,result;//instance variables
	public Calc() //default Constructor
	{
		num1=8;
		num2=9;
		System.out.println("In constructor");
	}
	public Calc(int n) //Parametrized constructors
	{
	 num1=n;
	 num2=n;
	}
	public Calc(double d,int n)
	{
		num1 = (int)d;
		num2 = n;
	}
	public Calc(int num1,int num2)//local variables
	{
		this.num1 = num1;//current object
		this.num2 = num2;
	}
	
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj = new Calc(28.5,74);//obj is Ref and an object knows something and does something.
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
