package Com.Shravya.lab1;

public abstract  class Vaccine {
 int age;
 String nationality;
 boolean firstdose;
 boolean seconddose;
 void firstdose() {
	 if(age>=18) {
		 System.out.println("your are eligible for firstdose");
		 System.out.println("pay 250rs for for firstdose");
		 this.firstdose=true;
	 }else {
		 System.out.println("your are not eligible for firstdose");
		 this.firstdose=false;
	 }
 } 
	 void seconddose() {
		 if(firstdose) {
		 System.out.println("after completing firstdose you are eligible for boosterdose");
		 this.seconddose=true;
		 }else {
			 System.out.println("after you need to first complete firstdose");
			 this.seconddose=false;
		 }
		 
	 }
	 abstract void Boosterdose(); {
		 if(firstdose);
		 
		 
 }
	 
		 
	 }
	 
		  

 

