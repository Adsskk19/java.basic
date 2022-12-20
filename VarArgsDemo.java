//variable (length) arguments
class Add {
	public int add(int... l) // {5,6,7,56,8,9}
	{
		int sum = 0;
		for (int i : l) {
			sum = sum + i;
		}
		return sum;
	}

}

public class VarArgsDemo {
	public static void main(String[] args) {
		Add obj = new Add();
		System.out.println(obj.add(5, 6, 7, 56, 8, 9));
	}

}
