package projectfinal;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
	
		int opcion = 0;
		
		System.out.println("========================Menu Principal================================");

		do{

			System.out.println("\n _________________________" +
								"\n 1. Nuevo" +
								"\n 2. Busqueda" +  
								"\n 3. Salir");
			
			opcion = leeInt();		
			switch(opcion) {
			case 1: 
				System.out.println("\n ¿Que quiere dar de alta?" );
				break;
			case 2:
				System.out.println("\n ¿Quiere buscar por ...?" );				
				break;
			}
		}while(opcion!=3);
	}
	
	//metodos 
	public static int leeInt() {
		Scanner scan = new Scanner(System.in);
		int entero = scan.nextInt();
		return entero;
	}

}
