package Shrav;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int a=5;
		int num=scanner.nextInt();
		 int factorial=1;
		
		for(int i=1;i<=num;i++) 
			factorial*=i;
			
		}
		System.out.println("Factorial of:"+num1+"="+factorial);
	
	}


