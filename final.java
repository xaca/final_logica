package final;

import java.util.ArrayList;
import java.util.Scanner;

public class final {
    
    public static int Sumatoria(int[] dato){
        int sum = 0;
        for(int i = 0; i < dato.length; i++){
            sum += dato[i];
        }
        return sum;
    }
    
    public static double Promedio(double[] dato){
        double prom = 0;
        int i;
        for(i = 0; i < dato.length; i++){
            prom += dato[i];
        }
        prom = prom/i;
        return prom;
    }
    
    public static long Factorial(int dato){
        long fact = 1;
        for(int i = 2; i <= dato; i++){
            fact = fact * i;
        }
        return fact;
    }
    
    public static double RaizN(int n, int dato){
        double raiz = 0;
        raiz = Math.pow(dato, (double)1/n);
        return raiz;
    }
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        while (op < 1 || op > 4) {
            System.out.println("1. Sumatoria");
            System.out.println("2. Promedio");
            System.out.println("3. Factorial");
            System.out.println("4. Raíz n-ésima");
            System.out.println("Digite el tipo de función que desea implementar: ");
            op = sc.nextInt();
        }
        switch (op) {
            case 1: {
                int ContD = 0;
                int x = 0;
                while(ContD < 1){
                    System.out.println("¿Cuántos datos desea sumar?");
                    ContD = sc.nextInt();
                }
                int[] datos = new int[ContD];
                for (int i = 0; i < ContD; i++) {
                    System.out.print("Digite el " + (i+1) + "° dato: ");
                    datos[i] = sc.nextInt();
                    System.out.println("");
                }
                x = Sumatoria(datos);
                System.out.println("El resultado de su sumatoria es de: " +x);
                break;
            }
            case 2:{
                int ContD = 0;
                double x = 0;
                while(ContD < 1){
                    System.out.println("¿Cuántos datos desea promediar?");
                    ContD = sc.nextInt();
                }
                double[] datos = new double[ContD];
                for (int i = 0; i < ContD; i++) {
                    System.out.print("Digite el " + (i+1) + "° dato: ");
                    datos[i] = sc.nextDouble();
                    System.out.println("");
                }
                x = Promedio(datos);
                System.out.println("El resultado de su sumatoria es de: " +x);
                break;
            }
            case 3:{
                long x = 1;
                int dato = 0;
                while(dato < 1){
                    System.out.println("¿A qué dato desea conocerle el factorial?");
                    dato = sc.nextInt();
                }
                x = Factorial(dato);
                System.out.println("El resultado de su factorial es de: " +x);
                break;
            }
            case 4:{
                double x = 0;
                int dato = -1;
                int n = -1;
                while(dato < 0){
                    System.out.println("¿A qué dato desea conocerle su raíz n-ésima?");
                    dato = sc.nextInt();
                }
                while(n < 1){
                    System.out.println("Digite 'n':");
                    n = sc.nextInt();
                }
                x = RaizN(n, dato);
                System.out.println("El resultado de su raíz n-ésima es de: " +x);
                break;
            }
        }
    }

}
