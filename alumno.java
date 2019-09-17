package poo;

public class alumno {
	private String nombre;
	private String carrera;
	private String matricula;
	private float beca;
	private float promedio;
	
	public alumno() {
		
	}
	public alumno(String nombre, String carrera, String matricula, float beca, float promedio) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.matricula = matricula;
		this.beca = beca;
		this.promedio = promedio;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public String getMatricula() {
		return matricula;
	}
	public float getBeca() {
		return beca;
	}
	public float getPromedio() {
		return promedio;
	}
	
	//imprime el arreglo
	public void imprime(alumno[] lista) {
		for(int i=0;i<lista.length;i++) {
			System.out.print("Nombre: " + lista[i].getNombre());
			System.out.print(" Carrera: " + lista[i].getCarrera());
			System.out.print(" Matricula: : " + lista[i].getMatricula());
			System.out.print(" Beca: " + lista[i].getBeca());
			System.out.println(" Promedio: " + lista[i].getPromedio());
		}
	}
	//metodo que calcula el promedio del grupo
	public void promedio(alumno[] lista) {
		float res=0,suma=0;
		for(int i = 0; i<lista.length;i++) {
			suma += lista[i].getPromedio();
		}
		res=suma/lista.length;
		System.out.print(res);
	}
	
	
}
