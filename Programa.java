import java.lang.Math;

public class Programa{

	public static int sumatoria(int entrada)
	{
		int resultado = 0;

		while (entrada != 0) {
		   
		  resultado = resultado + entrada;
		  entrada--;
			 
		}

		return resultado;
	}

	public static float promedio(float[] entrada)
	{
		float resultado = 0;

		for(int i=0; i < entrada.length; i++){
       
            resultado = resultado + entrada[i];

        }

        resultado = resultado / entrada.length;

		return resultado;
	}

	public static int factorial(int entrada)
	{
		int resultado = 1;

		while (entrada != 0) {
		   
		  resultado = resultado * entrada;
		  entrada--;
			 
		}

		return resultado;
	}

	public static double raizEnesima(float entrada, int nRaiz)
	{

		double potencia = 1.0 / (double) nRaiz;

		double entrada_double = (double) entrada;

		double resultado = Math.pow(entrada, potencia);

		return resultado;
	}



	public static void main(String[] args) {

		/*
		// Ejemplo lectura de datos
		System.out.println("Ingrese una cadena");
		String temp = ConsoleInput.getString();
		System.out.println("La cadena leida fue:"+temp);
		System.out.println("Ingrese un numero entero");
		int entero = ConsoleInput.getInt();
		System.out.println("El entero leido fue:"+entero);
		System.out.println("Ingrese un numero flotante");
		float flotante = ConsoleInput.getFloat();
		System.out.println("El flotante leido fue:"+flotante);
		*/

		int centinela = 0;

		do{
			System.out.println("Ingrese una opcion asi:");
			System.out.println("1. Sumatoria");
			System.out.println("2. Promedio n datos");
			System.out.println("3. Factorial");
			System.out.println("4. Raiz n-esima");
			System.out.println("5. salir");
			centinela = ConsoleInput.getInt();

			if(centinela == 1){
				//Sumatoria
				System.out.println("Ingrese el numero para realizar sumatoria");
				int entrada = ConsoleInput.getInt();
				int resultado = sumatoria(entrada);
				System.out.println("El resultado es: "+resultado);
			} else if(centinela == 2){
				//Promedio
				System.out.println("Ingrese el numero de datos para los que se va a calcular el promedio");
				int nDatos = ConsoleInput.getInt();
				float[] entrada = new float[nDatos];
				int contador = nDatos;
				while (contador != 0) {
		   		  
		   		  System.out.println("Ingrese el dato numero"+contador);
				  entrada[contador-1] = ConsoleInput.getFloat();
				  contador--;
					 
				}
				float resultado = promedio(entrada);
				System.out.println("El resultado es: "+resultado);

			} else if(centinela == 3){
				//Factorial
				System.out.println("Ingrese el numero para realizar factorial");
				int entrada = ConsoleInput.getInt();
				int resultado = factorial(entrada);
				System.out.println("El resultado es: "+resultado);

			} else if(centinela == 4){

				System.out.println("Ingrese el numero al que se le va a calcular la raiz");
				float entrada = ConsoleInput.getFloat();
				System.out.println("Ingrese la raiz n");
				int nRaiz = ConsoleInput.getInt();
				double resultado = raizEnesima(entrada, nRaiz);
				System.out.println("El resultado es: "+resultado);

			} else if(centinela == 5){
				System.out.println("Terminando...");
				System.exit(0);
			}


		}while(centinela!=5);

		System.out.println("Terminando...");
	}
}