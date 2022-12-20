class Aa
{
	public void show1() {
		System.out.println("in Aa");
	}
}
class Bb extends Aa
{
	//@Override --> to override the method of superclass
	
	  public void show1() { 
	  super.show1(); //super.show1(); --> To call Super class method too. 
	  System.out.println("in Bb"); 
	  }
	 
}

	public class OverridingDemo {
		public static void main(String[] args) {
			Bb ob = new Bb();
			ob.show1();
			
			 
		}
		
	
}


