package modulo004.clase004;

public class Deportista extends Persona {

	private String especialidad;
	private float altura;
	private float peso;

	public Deportista(String nombre, String apellido, int anioNacimiento,String especialidad, float altura, float peso) {
		super(nombre, apellido, anioNacimiento);
		this.especialidad = especialidad;
		this.altura = altura;
		this.peso = peso;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public void correr(){
		System.out.println("Deportista: " + getNombre()+" "+getApellido()+" "+"corre a 15km/h");
	}
}
