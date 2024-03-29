import java.io.Serializable;
import java.util.Scanner;
public class UEA implements Serializable {

	private int claveUea;
	private String nombreUea;
	private int creditos;
	
	public int getClaveUea() {
		return claveUea;
	}
	public void setClaveUea(int claveUea) {
		this.claveUea = claveUea;
	}
	public String getNombreUea() {
		return nombreUea;
	}
	public void setNombreUea(String nombreUea) {
		this.nombreUea = nombreUea;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public UEA(int claveUea, String nombreUea, int creditos) {
		super();
		this.claveUea = claveUea;
		this.nombreUea = nombreUea;
		this.creditos = creditos;
	}
    
    public void registro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el nombre de la UEA:");
		this.nombreUea = scan.nextLine();
		System.out.println("Escribe la Clave de la UEA:");
		this.claveUea = scan.nextInt();
		System.out.println("Escribe los creditos de la UEA:");
		this.creditos = scan.nextInt();
	}
    
	public String toString() {
		return claveUea+" "+nombreUea+" "+creditos;
	}
}
