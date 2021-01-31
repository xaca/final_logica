import java.util.Scanner;
public class Finalnuevo{
	public static int sumatoria(){
		Scanner sc = new Scanner(System.in);
		int sumatoria = 0;
		int numero = 0;
		String suma = "";
		try{
		System.out.print("Ingrese un numero: ");
		numero = sc.nextInt();
		sc.nextLine();
		}
		catch(Exception e){
			sc.reset();
			suma = "error";
		}
		do{
			sumatoria = sumatoria + numero;
			numero--;

		}while(numero>0);
		if(suma == "error"){
			System.out.println("El numero ingresado no es entero, intente nuevamente.");
		}else{
			System.out.print("El resultado es: " + sumatoria);
		}
		return sumatoria;
	}
	public static double promedio(){
		Scanner sc = new Scanner(System.in);
		int cantidad = 0, sumatoria = 0; 
		double promedio = 0;
		int[] numeros;
		String numero = "";
		try{
		System.out.print("Ingrese la cantidad de numeros a los que se le sacara el promedio: ");
		cantidad = sc.nextInt();
		}
		catch(Exception e){
			sc.reset();
			numero = "error";
		}
		if(numero == "error" || cantidad == 0){
			System.out.print("Dato invalido");
		}else{
		numeros = new int[cantidad];
		System.out.println("Ingrese los numeros:");
		for(int i=0; i<numeros.length; i++){
		try{
			numeros[i] = sc.nextInt();
			sumatoria = sumatoria + numeros[i];	
			promedio = (double) sumatoria/cantidad;
			System.out.print("El promedio de los numeros es: " + promedio);
		}
		catch(Exception e){
			sc.reset();
			numero = "error";
		}
		}
		if(numero == "error"){
			System.out.print("Dato invalido");
		}
	}
		
		return promedio;
	}
	public static int factorial(){
		Scanner sc = new Scanner(System.in);
		int numero = 0, factorial = 1;
		String n = "";
		try{
			System.out.print("Ingrese el numero: ");
			numero = sc.nextInt();	
		}
		catch(Exception e){
			sc.reset();
			n = "error";
		}
		if(n == "error"){
			System.out.print("Dato invalido.");
		}
		else{
		do{
		factorial = factorial*numero;
		numero--;
		}while(numero>0);
		System.out.print("El factorial del numero es: "+ factorial);
		}
		return factorial;
	}
	public static float raiz(){
		Scanner sc = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		double indice = 0; 
		int numero = 0;
		float raiz = 0;
		String numeros = "";
		try{
		System.out.print("Ingrese el radicando: ");
		numero = teclado.nextInt();
		System.out.print("Ingrese el indice: ");
		indice = sc.nextInt();
		}
		catch(Exception e){
			sc.reset();
			numeros = "error";
		}
		if(numeros == "error" || indice == 0){
			System.out.print("Dato invalido");
		}
		else{
			raiz = (float) Math.pow(numero,1/indice);
			System.out.print("El resultado es: " + raiz);
		}
	
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