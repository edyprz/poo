import java.io.Serializable;
import java.util.Scanner;

public class Visitante implements Persona, Serializable {
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correo;

	@Override
	public String toString() {
		return nombre+" "+apellidoPaterno+" "+apellidoMaterno+" "+correo;
	}

	public void registro() {
        Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el nombre:");
		this.nombre = scan.nextLine();
		System.out.println("Escribe el apellido paterno:");
		this.apellidoPaterno = scan.nextLine();
		System.out.println("Escribe el apellid materno:");
		this.apellidoMaterno = scan.nextLine();
		System.out.println("Escribe el correo:");
		this.correo = scan.nextLine();
	}

}
