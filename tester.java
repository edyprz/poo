package poo;

public class tester {
	
	
	public static void main(String[] args) {
		
		alumno alu1 = new alumno();
		
		alumno[] grupo = new alumno[5];
		grupo[0] = new alumno("Pepe", "Electronica", "2152002243", (float)3500.00, (float)8.00);
		grupo[1] = new alumno("Jose", "Computacion", "21520022453", (float)2500.00, (float)9.500);
		grupo[2] = new alumno("Luis", "Quimica", "21432002243", (float)4000.00, (float)7.00);
		grupo[3] = new alumno("Maricela", "Literatura", "6552002243", (float)800.00, (float)9.50);
		grupo[4] = new alumno("Juana", "Idiomas", "2187002243", (float)1500.00, (float)6.0);		
	

		
		alu1.imprime(grupo);
		alu1.promedio(grupo);
		
		}
}
