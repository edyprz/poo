import java.io.Serializable;
import java.util.Scanner;

public class Salon implements Serializable {

	private int clave;
	private String ubicacion;
	

	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
    
    public Salon(int clave, String ubicacion) {
		super();
		this.clave = clave;
		this.ubicacion = ubicacion;
	}
    
    public void registro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la clave del salon:");
		this.clave = scan.nextInt();
		System.out.println("Escribe la descripcion de la ubicacion:");
		this.ubicacion = scan.nextLine();
	}
    
	public String toString() {
		return clave+" "+ubicacion;
	}
	
}
