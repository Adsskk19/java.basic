class Casio  // Method OverLoading //
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j,int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i,double j)
	{
		System.out.println(i+j);
	}
}
public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Casio obj = new Casio();
		obj.add(25, 65);
		obj.add(45, 65,89);
		obj.add(4.6, 8.9);
	}

}
