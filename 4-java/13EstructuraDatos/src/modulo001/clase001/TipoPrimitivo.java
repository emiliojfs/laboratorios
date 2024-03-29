package modulo001.clase001;

public class TipoPrimitivo {
	public static void main(String[] args) {
		System.out.println("Tipo Primitivo: Almacena un unico dato");
		System.out.println("---------------------------------------------------------------------");

		boolean resultado = true; System.out.println("boolean\t:"+resultado);
		char caracter = 'c'; System.out.println("char\t: "+caracter);
		byte numero1 = 120; System.out.println("byte\t: "+numero1);
		short numero2 = -4852; System.out.println("short\t: "+numero2);
		int numero3 = 5321345; System.out.println("int\t\t: "+numero3);
		long numero4 = 954538444; System.out.println("long\t: "+numero4);
		float numero5 = 100.23f; System.out.println("float\t: "+numero5);
		double numero6 = 20000.46; System.out.println("double\t:"+numero6);

		System.out.println("---------------------------------------------------------------------");
		System.out.println("Tipo"+"\t\t"	+"M�nimo"	+"\t\t\t\t\t"			+"M�ximo");
		System.out.println("boolean\t\t" 	+ "false" 	+ "\t\t\t\t\t" 			+ "true");
		System.out.println("char\t\t\t");
		System.out.println("byte\t\t" 		+ "-128" 	+ "\t\t\t\t\t" 			+ "127");
		System.out.println("short\t\t" 		+ "-32768" 	+ "\t\t\t\t\t" 			+ "32767");
		System.out.println("int\t\t\t" 		+ "-2147483648" + "\t\t\t\t" 		+ "2147483647");
		System.out.println("long\t\t" 		+ "-9223372036854775808" + "\t" 	+ "9223372036854775807");
		System.out.println("float\t\t" 		+ "1.4E-45" + "\t\t\t\t\t" 			+ "3.4028235E38");
		System.out.println("double\t\t" 	+ "4.9E-324" + "\t\t\t\t" 			+ "1.7976931348623157E308");
	}
}
