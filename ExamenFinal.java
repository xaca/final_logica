 import java.util.InputMismatchException;
 import java.util.Scanner;

public class ExamenFinal {
  public static int sumatoria(){
                        Scanner ingreso = new Scanner(System.in);
                        int numro, sumatoria = 0, k;
                       
                            System.out.print("Ingresa un numero: ");
                            numro = ingreso.nextInt();
                           
                            for(k = 0; k <= numro; k++){
                              sumatoria = sumatoria + k; 
                            }
                            System.out.print("La sumatoria de 1 a " + numro + " es " + sumatoria + "\n");
                            return sumatoria;
                        }

                            

                    public static double promedio(){
                        int n,s=0,x;
                        double p;
                            Scanner teclado = new Scanner(System.in);
                            System.out.println("Ingresar cantidad de números:");
                            n=teclado.nextInt();
                       
                            for(int i=1;i<=n;i++)
                            { 
                             System.out.println("Número "+i+"=");
                             x=teclado.nextInt();
                             s=s+x;                
                        }   
                            p=s/n;
                            System.out.println("El Promedio es:" +p);
                            return p;
                    }


                        public static float raiz(){
                        Scanner entrada = new Scanner(System.in);
                            double indice, radicando;
                            float raiz;
                            System.out.println("Ingresa radicando");
                                radicando = entrada.nextDouble();
                                System.out.println("Ingresa indice");
                                    indice = entrada.nextDouble();
                                    raiz = (float) Math.pow(radicando, 1 / indice);
                                    System.out.println("La raiz " + indice + " de " + radicando + " es : " + raiz);
                                    return raiz;
                                }

                    public static int factorial(){
                        long factorial=1;
                        int num;
                        Scanner numero = new Scanner(System.in);
                        System.out.print("Introduce un número: ");
                        num = numero.nextInt();
                        for (int i = num; i > 0; i--) {
                            factorial = factorial * i;}
                        System.out.println("El factorial de " + num + " es: " + factorial);
                        return num;
                    }
                    public static void main (String Args[]){
                        Scanner sc = new Scanner(System.in);
                        int menu = 0;
                            System.out.println("Elija una opcion (Ingrese un numero)");
                            System.out.println("\n1. Sumatoria");
                            System.out.println("2. Promedio");
                            System.out.println("3. Raiz");
                            System.out.println("4. Factorial");
                            System.out.print("\nOpcion: ");
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

 
