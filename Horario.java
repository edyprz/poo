import java.io.Serializable;

public class Horario implements Serializable {

	private String clave;
	private String dias;
	private String iniHora;
	private String finHora;
	private Salon salon;
	private UEA uea;
	private Profesor prof;
	
	public Horario(String clave, String dias, String iniHora, String finHora, Salon salon, UEA uea, Profesor prof) {
		super();
		this.clave = clave;
		this.dias = dias;
		this.iniHora = iniHora;
		this.finHora = finHora;
		this.salon = salon;
		this.uea = uea;
		this.prof = prof;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public String getIniHora() {
		return iniHora;
	}

	public void setIniHora(String iniHora) {
		this.iniHora = iniHora;
	}

	public String getFinHora() {
		return finHora;
	}

	public void setFinHora(String finHora) {
		this.finHora = finHora;
	}

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public UEA getUea() {
		return uea;
	}

	public void setUea(UEA uea) {
		this.uea = uea;
	}

	public Profesor getProf() {
		return prof;
	}

	public void setProf(Profesor prof) {
		this.prof = prof;
	}
	
	public String toString() {
		return clave + " " + dias + " " + iniHora + " " + finHora + " " + 
				prof.getNombre() + " " + prof.getApellidoPaterno() + " " + 
				salon.getNombre() + " " + uea.getNombreUea() + " " + uea.getCreditos();
	}
}
