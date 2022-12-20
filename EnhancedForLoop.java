
public class EnhancedForLoop {
	public static void main(String[] args) {
		 int a[] = {1,2,3,4};
		 int d[][]= {
				     {1,2,3,4},
				     {2,4,6,8},
				     {5,6,7,8}
		            };
		 for(int k : a) {
			 System.out.println(k);
		 }
		 
		 for(int j[]:d) {
			 for(int l: j) {
				 System.out.print(" "+ l);
			 }
			 System.out.println();
		 }
	}

}
