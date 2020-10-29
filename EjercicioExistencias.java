package entornosDesarrollo;

import java.util.Scanner;

public class EjercicioExistencias {

	public static void main(String[] args) {
		int ex;
		int en;
		ex=3200;
		
		while (ex>=100){
			System.out.println("Selecciona el nº de existencias a pedir:");
			Scanner sc= new Scanner(System.in);
			en=sc.nextInt();
			ex-=en;
			System.out.println("Existencias actuales:" + ex);
		}
		System.out.println("No queda calipo niño, solo maxibon");
		

	}

}
