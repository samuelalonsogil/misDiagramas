package entornosDesarrollo;

import java.util.Scanner;

public class Ejercicio_5_Triangulo {

	public static void main(String[] args) {
		double base=0, altura=0;
		double area;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce base:");
		base=sc.nextInt();
		
		
		System.out.println("Introduce altura:");
		altura=sc.nextInt();
		
		area= (base*altura)/2;
		
		System.out.println("Área:" + area);
		area=sc.nextInt();
	 

	}

}
