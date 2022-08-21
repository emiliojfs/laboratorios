package modulo004.clase004;

public class Principal {

	public static void main(String[] args) {
		//CASTING

		Persona persona = new Ingeniero("Junior","Flores",1988,"Sistemas",2,"java se");
		Ingeniero  ingeniero = (Ingeniero) persona;

		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
		System.out.println(persona.getAnioNacimiento());
		System.out.println(((Ingeniero) persona).getEspecialidad());
		System.out.println(((Ingeniero) persona).getAnioExpericencia());
		System.out.println(((Ingeniero) persona).getSkill());
		persona.correr();
		System.out.println(persona.getEdad());

		System.out.println("-------------------------------------");

		System.out.println(ingeniero.getNombre());
		System.out.println(ingeniero.getApellido());
		System.out.println(ingeniero.getAnioNacimiento());
		System.out.println(ingeniero.getEspecialidad());
		System.out.println(ingeniero.getAnioExpericencia());
		System.out.println(ingeniero.getSkill());
		ingeniero.correr();
		System.out.println(ingeniero.getEdad());

	}
}
