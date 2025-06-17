package Com.shravya;

public class Box {

	
		public int length;
		private int breadth;
		protected int height;
		int weight;
		 
		public int volume() {
		return length*breadth*height;
		}
			public static void main(String args[]) {
			Box b=new Box();
			b.length=20;
			b.breadth=30;
			b.height=40;
	           System.out.println("volume"+b.volume());
				
						}
			
		
		

	}


