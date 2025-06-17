package Com.shravya;

public class Fabonacci {

		static void Series(int count) {
			 int a =0;
			 int b = 1;
			 int c=a + b;
			System.out.print("Fibonacci Series up to " + count + " terms: ");
			        
		 for (int i = 1; i <= count; i++) {
			System.out.print(a+ " ");
			     a = b;
			     b = c;
			        }
			    }

			    public static void main(String[] args) {
			        int count = 10;  
			        Series(count);
			    }
			}


