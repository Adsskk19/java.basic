//IS-A  HAS-A 
class Calculator {   //Super , Parent , Base
	public int add(int i,int j) {
		return i+j;
	}}
	class CalcAdv extends Calculator{  //Sub , Child , Derived
		public int sub(int i,int j) {
			return i-j;
	}}
	class CalcVeryAdv extends CalcAdv{
		public int mul(int i,int j) {
			return i*j;
	}
	}

public class InheritanceDemo {
public static void main(String[] args) {
	Calculator c1 = new Calculator();
	CalcAdv c2 = new CalcAdv();
	CalcVeryAdv c3 = new CalcVeryAdv();
	
	System.out.println(c1.add(5, 6));
	System.out.println(c2.sub(8, 4));
	System.out.println(c3.mul(8, 9));
	
			
}

}
