import java.util.Scanner;
public class Final{
	public static int sumatoria(){
		Scanner sc = new Scanner(System.in);
		int sumatoria = 0;
		int numero = 0;

		System.out.print("Ingrese un numero: ");
		numero = sc.nextInt();
		do{
			sumatoria = sumatoria + numero;
			numero--;
		}while(numero>0);
		System.out.print("El resultado es: " + sumatoria);
		return sumatoria;
	}
	public static double promedio(){
		Scanner sc = new Scanner(System.in);
		int cantidad = 0, sumatoria = 0; 
		double promedio = 0;
		int[] numeros;
		
		System.out.print("Ingrese la cantidad de numeros a los que se le sacara el promedio: ");
		cantidad = sc.nextInt();
		numeros = new int[cantidad];

		System.out.println("Ingrese los numeros:");
		for(int i=0; i<numeros.length; i++){
		numeros[i] = sc.nextInt();
		sumatoria = sumatoria + numeros[i];
		}
		promedio = (double) sumatoria/cantidad;
		System.out.print("El promedio de los numeros es: " + promedio);
		return promedio;
	}
	public static int factorial(){
		Scanner sc = new Scanner(System.in);
		int numero = 0, factorial = 1;
		System.out.print("Ingrese el numero: ");
		numero = sc.nextInt();
		do{
		factorial = factorial*numero;
		numero--;
		}while(numero>0);
		System.out.print("El factorial del numero es: "+ factorial);
		return factorial;
	}
	public static float raiz(){
		Scanner sc = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		double indice = 0; 
		int numero = 0;
		float raiz = 0;

	System.out.print("Ingrese el indice: ");
	indice = sc.nextInt();		
	System.out.print("Ingrese el radicando: ");
	numero = teclado.nextInt();
	raiz = (float) Math.pow(numero,1/indice);
	System.out.print("El resultado es: " + raiz);
	return raiz;
	}
	public static void main (String Args[]){
		Scanner sc = new Scanner(System.in);
		int menu = 0;
	System.out.println("Elija una opcion (Ingrese un numero)");
	System.out.println("1. Sumatoria");
	System.out.println("2. Promedio");
	System.out.println("3. Factorial");
	System.out.println("4. Raiz");
	System.out.print("Opcion: ");
	menu = sc.nextInt();
	switch (menu){
		case 1:
		sumatoria();
		break;
		case 2:
		promedio();
		break;
		case 3:
		factorial();
		break;
		case 4:
		raiz();
		break;
		default:
		System.out.print("Dato invalido.");
		break;
	}
	}
}