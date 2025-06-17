package Com.shravya;

public class StaticEx {


		//instance variable
		int num;
		//static variable
		static int val;
		static void getdata()
		{
			System.out.println("Static method"+val);
			
		}
		//instance method
		void getval()
		{
			System.out.println("instance method"+val+","+num);
		}

		public static void main(String[] args) {
			val=50;
			System.out.println(val);
			
			
			

		}



	

	
		
	}


