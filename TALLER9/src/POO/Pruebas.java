package POO;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		trabajador1.cambiaSeccion("RRHH");

		System.out.println(trabajador1.devuelveDatos1() + "\n" + trabajador2.devuelveDatos1() + "\n"
				+ trabajador3.devuelveDatos1() + "\n" + trabajador4.devuelveDatos1());

		System.out.println(Empleados.dameIdSigueiente());

	}

}

class Empleados {
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		Id = IdSiguiente;
		IdSiguiente++;

	}


	public void cambiaSeccion(String seccion) { //setter
		this.seccion = seccion;
	}
	public String devuelveDatos1() {//getter
		return "El nombre es: " + nombre + "La seccion es " + seccion + "y el Id="+Id;
		
	}

	public static String dameIdSigueiente() { 
		return "El IdSiguiente es : " + IdSiguiente;
	}

	private final String nombre;
	private String seccion;
	private int Id;
	public static int IdSiguiente=1;

}