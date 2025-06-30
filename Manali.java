package Com.Shravya.lab1;

 class Manali extends HillStations {

	@Override
	void location() {
	System.out.println("Location:Manali,Himachalpradesh");	
	super.location();
	}

	@Override
	void FamousFor() {
		System.out.println("Manali famousfor:kullu valley");
		super.FamousFor();
	}
	

}
  
class Mussoorie extends HillStations{

	@Override
	void location() {
		System.out.println("location:Mussoorie, Uttarkand");
		super.location();
	}

	@Override
	void FamousFor() {
		System.out.println("Mussoorie is famousfor:Kempty falls");
		super.FamousFor();
	}
	
}
class Gulmarg extends HillStations{

	@Override
	void location() {
		System.out.println("location:Gulmarg,Kashmir");
		super.location();
	}

	@Override
	void FamousFor() {
		System.out.println("Gulmarg is famousfor:Gulmarg Gondola");
		super.FamousFor();
	}
	
}