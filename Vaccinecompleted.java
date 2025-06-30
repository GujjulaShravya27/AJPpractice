package Com.Shravya.lab1;

public class Vaccinecompleted  extends Vaccine{
	

	@Override
	void Boosterdose() {
		
	
		System.out.println("your are successfully eligible for boosterdose");
		
	}

	public static void main(String[] args) {
		Vaccinecompleted person1=new Vaccinecompleted();
		person1.age=25;
		person1.nationality="indian";
		person1.firstdose();
		person1.seconddose();
		person1.Boosterdose();
		}

}
