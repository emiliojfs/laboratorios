package modulo004.clase004;

import java.time.Year;

public class Persona {

	private String nombre;
	private String apellido;
	private int anioNacimiento;
	private int edad;

	public Persona(String nombre, String apellido, int anioNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioNacimiento = anioNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public int getEdad() {
		calcularEdad();
		return edad;
	}

	private void  calcularEdad (){
		int anioActual = Year.now().getValue();
		this.edad=anioActual-this.anioNacimiento;
	}
	public void correr(){
		System.out.println("Persona comun: " + getNombre()+" "+getApellido()+" "+"corre a 10km/h");
	}
	
}
