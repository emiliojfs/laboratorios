package modulo001.clase001;

public class TipoEnvoltorio {
	public static void main(String[] args) {
		System.out.println("Tipo Envoltorio: Contiene valores de tipo primitivo Tienen atributos y metodos, heredan de la clase Object");
		System.out.println("---------------------------------------------------------------------");

		Boolean resultado = new Boolean(false);
		System.out.println("Boolean"+"\t\t\t\t:"+resultado);

		Character letra = new Character('a');
		System.out.println("Character"+"\t\t\t:"+letra);
		System.out.println("Character compareTo z"+":"+letra.compareTo('z'));

		String cadena = new String("Una cadena de Texto");
		System.out.println("Cadena"				+"\t\t\t\t:"+cadena);
		System.out.println("Cadena startWith U"	+"\t:"+cadena.startsWith("U"));
		System.out.println("Cadena endsWith u"	+"\t:"+cadena.endsWith("u"));
		System.out.println("Cadena tamano"		+"\t\t:"+cadena.length());

		Byte num11 = new Byte("23");
		System.out.println("Byte"+"\t\t\t\t:"+num11);
		System.out.println("Byte byteValue"+"\t\t:"+num11.byteValue());
		System.out.println("Byte shortValue"+"\t\t:"+num11.shortValue());

		Short num21 = new Short("643");
		System.out.println("Short"+"\t\t\t\t:"+num21);
		System.out.println("Short hashCode"+"\t\t:"+num21.hashCode());
		System.out.println("Short longValue"+"\t\t:"+num21.longValue());

		Integer entero = new Integer(563);
		System.out.println("Integer "+"\t\t\t:"+entero);
		System.out.println("Integer describeConstable"+":"+entero.describeConstable());

		Long num30 = new Long(564641315);
		System.out.println("Long "+"\t\t\t\t:"+num30);
        System.out.println("Long byteValue"+"\t\t:"+num30.byteValue());

        Float num40 = new Float(46.246);
		System.out.println("Float "+"\t\t\t\t:"+num40);
        System.out.println("Float intValue"+"\t\t:"+num40.intValue());

        Double num50 = new Double(31.3164);
		System.out.println("Double "+"\t\t\t\t:"+num50);
        System.out.println("Double describeConstable"+":"+num50.describeConstable());

        System.out.println("---------------------------------------------------------------------");
		System.out.println("Tipo\t\tMínimo\t\t\t\t\tMáximo");
		System.out.println("Boolean"+	"\t\t" + Boolean.FALSE + "\t\t\t\t\t" + Boolean.TRUE);
		System.out.println("Character"+	"\t\t");
		System.out.println("String"+	"\t\t");
		System.out.println("Byte"+		"\t\t" + Byte.MIN_VALUE + "\t\t\t\t\t" + Byte.MAX_VALUE);
		System.out.println("Short"+		"\t\t" + Short.MIN_VALUE + "\t\t\t\t\t" + Short.MAX_VALUE);
		System.out.println("Integer"+	"\t\t" + Integer.MIN_VALUE + "\t\t\t\t" + Integer.MAX_VALUE);
		System.out.println("Long"+		"\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
		System.out.println("Float"+		"\t\t" + Float.MIN_VALUE + "\t\t\t\t\t" + Float.MAX_VALUE);
		System.out.println("Double"+	"\t\t" + Double.MIN_VALUE + "\t\t\t\t" + Double.MAX_VALUE);
	}
}