//7. Indicar cuál es el mayor de tres números y si es par o impar
import java.util.Scanner;
public class EJERCICIO_7 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca 3 números");
    int numero1= sc.nextInt();
    int numero2= sc.nextInt();
    int numero3= sc.nextInt();
        if (numero1 > numero2) 
            if (numero1 > numero3) 
                System.out.println("El mayor es: " + numero1);
             else 
                System.out.println("el mayor es: " + numero3);
        else if (numero2 > numero3) 
            System.out.println("el mayor es: " + numero2);
         else 
            System.out.println("el mayor es: " + numero3);
         //par o impar
        if (numero1 % 2== 0)
          System.out.println ("El número1 es par");
        else
          System.out.println ("El número1 es impar");
        if (numero2 % 2== 0)
          System.out.println ("El número2 es par");
        else
          System.out.println ("El número2 es impar");
        if (numero3 % 2== 0)
          System.out.println ("El número3 es par");
        else
          System.out.println ("El número3 es impar");
    }
}