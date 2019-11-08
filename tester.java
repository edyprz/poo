import java.util.*;

public class tester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Serializacion util = new Serializacion();
		
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		String archAlumno = "alumno.ser";
		List<Profesor> listaProfesor = new ArrayList<Profesor>();
		String archProfesor = "profesor.ser";
		List<Ayudante> listaAyudante = new ArrayList<Ayudante>();
		String archAyudante = "ayudante.ser";
		List<Visitante> listaVisitante = new ArrayList<Visitante>();
		String archVisitante = "visitante.ser";
		List<UEA> listaUea = new ArrayList<UEA>();
		String archUea = "uea.ser";
		List<Salon> listaSalon = new ArrayList<Salon>();
		String archSalon = "salon.ser";
		List<Horario> listaHorario = new ArrayList<Horario>();
		String archHorario = "horario.ser";
		
		listaAlumno = util.deserializaLista(archAlumno);
		listaProfesor = util.deserializaLista(archProfesor);
		listaVisitante = util.deserializaLista(archVisitante);
		listaUea = util.deserializaLista(archUea);
		listaSalon = util.deserializaLista(archSalon);
		listaHorario = util.deserializaLista(archHorario);
		
		System.out.println("Menu Principal");
		int opcion = 0;
		do{
			System.out.println(menuprincipal);
			
			opcion = scan.nextInt();
			switch(opcion) {
                case 1: // Alta de registro
                	int alta;
                	do {
                        System.out.println("Que quiere dar de alta?");
                        System.out.println(desplegarRegistros());
                        alta = scan.nextInt();
                        switch(alta) {
                            case 1: // alumno
                            	Alumno a = new Alumno();
                            	a.registro();
                            	a.registroAlumno();
                            	listaAlumno.add(a);
                            	System.out.println(a.toString());
                                break;
                            case 2: // profesor
                            	Profesor p = new Profesor();
                            	p.registro();
                            	p.registroEmpleado();
                            	listaProfesor.add(p);
                            	System.out.println(p.toString());
                                break;
                            case 3: // ayudante
                            	Ayudante ayu = new Ayudante();
                            	ayu.registro();
                            	ayu.registroAlumno();
                            	ayu.registroEmpleado();
                            	listaAyudante.add(ayu);
                            	System.out.println(ayu.toString());
                                break;
                            case 4: // Visitante
                            	Visitante v = new Visitante();
                            	v.registro();
                            	listaVisitante.add(v);
                            	System.out.println(v.toString());
                                break;
                            case 5: // Salon
                                break;
                            case 6: // UEA
                                break;
                            case 7: // horario
                                break;
                            default: break;
                        }//switch
                    } while (alta != 8);                                                 
                    break;
                case 2: //busqueda de registro
                	int busqueda;
                	do {
                        System.out.println("Que quiere buscar?");
                        System.out.println(desplegarRegistros());
                        busqueda = scan.nextInt();
                        switch(busqueda) {
                            case 1: // alumno
                                break;
                            case 2: // profesor
                                break;
                            case 3: // ayudante
                                break;
                            case 4: // visitante
                                break;
                            case 5: // salon
                                break;
                            case 6: // uea
                                break;
                            case 7: // horario
                            	break;
                            default: break;
                        }//switch
                    } while (busqueda != 8);                                                 
                    break;
                case 3: //consulta de registo
                	int consulta;
                    do {
                        System.out.println("Que quiere consultar?");
                        System.out.println(desplegarRegistros());
                        consulta = scan.nextInt();
                        switch(consulta) {
                            case 1: // alumno
                            	Iterator<Alumno> iterAlumno = listaAlumno.iterator();
            					iterar(iterAlumno);
                                break;
                            case 2: // profesor
                            	Iterator<Profesor> iterProfesor = listaProfesor.iterator();
                            	iterar(iterProfesor);
                                break;
                            case 3: // ayudante
                            	Iterator<Ayudante> iterAyudante = listaAyudante.iterator();
                            	iterar(iterAyudante);
                                break;
                            case 4: // visitante
                            	Iterator<Visitante> iterVisitante = listaVisitante.iterator();
                            	iterar(iterVisitante);
                                break;
                            case 5: // salon
                            	Iterator<Salon> iterSalon= listaSalon.iterator();
                            	iterar(iterSalon);
                                break;
                            case 6: // uea
                            	Iterator<UEA> iterUea = listaUea.iterator();
                            	iterar(iterUea);
                                break;
                            case 7: // horario
                            	Iterator<Horario> iterHorario= listaHorario.iterator();
                            	iterar(iterHorario);
                                break;
                            default: break;
                        }//switch
                    } while (consulta != 8);  
                    break;
                    
                default:
                    System.out.println("ingrese un valor valido");
            }
        } while(opcion != 4);    
        
                    util.serializaLista(archAlumno, listaAlumno);
                	util.serializaLista(archProfesor, listaProfesor);
                	util.serializaLista(archAyudante, listaAyudante);
                	util.serializaLista(archVisitante, listaVisitante);
                	util.serializaLista(archSalon, listaSalon);
                	util.serializaLista(archUea, listaUea);
                	util.serializaLista(archHorario, listaHorario);    
	}//llave main
	
	public static <E> void iterar(Iterator<E> iter) {
		while (iter.hasNext()) 
			System.out.println(iter.next());
	}
	
	public static String desplegarRegistros() {
		return "1. Alumno" +
                "\n 2. Profesor" + 
                "\n 3. Ayudante"+
                "\n 4. Visitante" +
                "\n 5. Salon" + 
                "\n 6. UEA" + 
                "\n 7. Horario"+
                 "\n 8. Salir";
	}
    public static String menuprincipal(){
        return "Que quiere realizar?" +
			    "\n 1. Alta de registro" +
				"\n 2. Busqueda individual de registro" + 
				"\n 3. Consulta de registro" + 
				"\n 4. Salir"
    }
}