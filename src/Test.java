
public class Test {

	public static void main(String[] args) {
		System.out.println("Bonita");
		System.out.println('x');
		System.err.println("Feito");
		//		System.out.println(args[100]);
		String miSuperArgumento = new String();
		int miVariableNueva = 3;
		System.out.println(miVariableNueva);
		for(int i = 0; i<args.length; i++)
		{
			//			System.out.println("Arg: " + i +" es: " + args[i]);
			miSuperArgumento = miSuperArgumento 
					+ " " + args[i];

		}
		System.out.println("5"+1);

		//Creo un error
		int x = Integer.valueOf(args[1]);
		System.out.println("x es: " + x);

		int y = 5 + 3;
		int z = 21;
		z = 20;
		int p = z - y;
		System.out.println(p);
		System.out.println(y);

		int resultado = (y*5) + 3%2;
		System.out.println(resultado);

		int test = 20;
		int prueba = test = 11;
		System.out.println(test);
		int penalesPeru = 0;
		System.out.println(penalesPeru);

		boolean peruClasifica = true;
		if(peruClasifica) {
			System.out.println("Bravo Peru.");
		}
		else {
			System.out.println("Que pena Peru.");
		}
		System.out.println("Funca???");
		
		String barra = "Chichichi Led led led";
		System.out.println(barra);
		
		double miNumero = 0;
		System.out.println(miNumero);
		
		miNumero = miNumero + 2;
		System.out.println("Mi numero es: " + miNumero);
		
		miNumero += 2;
		System.out.println("Mi numero ahora es: " + miNumero);
		
//		int enteroNoEntero = 2.3;
		int doubleEntero = 3;
		
		int miEntero = 33333;
		System.out.println("Mi entero es: " + miEntero);
		
		byte miByte = (byte)miEntero;
		System.out.println("Mi byte es: " + miByte);
		
		short miShort = (short) miEntero;
		System.out.println("Mi short es: " + miShort);
		
		float miDouble = (float)3.1;
		System.out.println("Mi float es: " + miDouble);
		
		String frase = "Hello";
		frase = "Chao";
		System.out.println(frase);
		
		int numeroPersonas = 3;
		int numeroBombones = 5;
		double bombonesPorPersona = ((double)numeroBombones/numeroPersonas);
		System.out.println("Los bombones por persona son: " + bombonesPorPersona);
		
		
		

	}

}
