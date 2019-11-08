import java.io.Serializable;

public class UEA implements Serializable {

	private String claveUea;
	private String nombreUea;
	private int creditos;
	
	public String getClaveUea() {
		return claveUea;
	}
	public void setClaveUea(String claveUea) {
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
	
	public UEA(String claveUea, String nombreUea, int creditos) {
		super();
		this.claveUea = claveUea;
		this.nombreUea = nombreUea;
		this.creditos = creditos;
	}
	
}
