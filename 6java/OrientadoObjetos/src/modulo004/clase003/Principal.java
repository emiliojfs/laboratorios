package modulo004.clase003;

public class Principal {

	public static void main(String[] args) {
		Persona personas[] = new Persona[3];
		//sobrecarga de constructores
		personas[0] = new Persona("Anthony","Flores",1997);
		personas[1] = new Deportista("Dangelo","Garaundo",2002,"Atleta",1.7f,60);
		personas[2] = new Ingeniero("Junior","Flores",1988,"Sistemas",2,"java se");

		for (Persona p:personas){
			System.out.println(p.mostrarDatos());
			System.out.println(" ");
		}
		//sobrecarga de metodos
		personas[0].correr();
		personas[1].correr();
		personas[2].correr();

	}
}
