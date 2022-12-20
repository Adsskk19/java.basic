
class Emp
{
	int eid;
	int salary;
	static String ceo;
	static  //when you load a class
	{
		 ceo ="Kumar";
	}
	public Emp()
	{
		eid =1;
		salary = 3000;
	}
	public void show() //Method..
	{ 
		System.out.println("EmpId "+eid+" and Salary "+ salary +" and CEO "+ceo);
	}
	
}
public class StaticDemo {
	static int j=0;
	public static void main(String[] args) {
		j=90;
		Emp kiran = new Emp();
		/*
		 * kiran.eid=282; kiran.salary=30000; kiran.ceo= "Ravan";
		 */
		 
		Emp Mahesh = new Emp();
		/*
		 * Mahesh.eid=250; Mahesh.salary=25000; Mahesh.ceo="Ramesh"; Mahesh.show();
		 *
		 */
		 kiran.show();
		 Mahesh.show();
	}
	
}
