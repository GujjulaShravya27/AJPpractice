package Com.Shravya.lab1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
    char operator;
	double number1,number2,result;
   Scanner scanner=new Scanner(System.in); {
	   System.out.println("enter the first number");
	   number1=scanner.nextDouble();
       
	  System.out.println("Choose the operator:+,-,*,/");
	    operator=scanner.next().charAt(0);
       
	  System.out.println("enter the second number");
	  number2=scanner.nextDouble();
	  result=number1+number2;
	  
	   switch(operator) {
   
	   case  '+':
		   result=number1+number2;
	   System.out.println("addition is:"+result);
	   break;
	   case  '-':
		   result=number1-number2;
		   System.out.println("substraction is:"+result);
	   case  '*':
		   result=number1*number2;
		   System.out.println("multiplication is:"+result);
	   case  '/':
		   result=number1/number2;
		   System.out.println("division is:"+result);
		   default:
			   System.out.println("enter valid details");
			   break;
		   
	   
   
   }

	

	}
	}

}
