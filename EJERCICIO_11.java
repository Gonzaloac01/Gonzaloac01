//Realizar una función que escriba por pantalla la tabla de multiplicar del número
//recibido como parámetro
import java.util.Scanner;
public class EJERCICIO_11 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int numero= sc.nextInt();
    tabla(numero);
  }
  public static void tabla (int numero) {
    for (int i= 0; i<= 10; i++) {
        System.out.println (+i*numero);
        System.out.println ();
    }
  }
}

    
  