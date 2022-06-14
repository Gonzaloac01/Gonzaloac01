//9. Introducir un número hasta 99.999 e indicar por pantalla cuantas cifras tiene.
import java.util.Scanner;
public class EJERCICIO_9 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduce un número del 1 hasta el 99.999");
    int numero= sc.nextInt();
    if (numero < 0)
      System.out.println ("ERROR");
    if (numero > 100000)
      System.out.println ("ERROR");
      if ((numero % 10) > 0 && (numero % 10) < 10)
        System.out.println ("El número tiene 2 cifras");
      else if ((numero % 10) > 10 && (numero % 10) < 100)
        System.out.println ("El número tiene 3 cifras");
      else if ((numero % 10) > 100 && (numero % 10) < 1000)
        System.out.println ("El número tiene 4 cifras");
      else if ((numero % 10) > 1000 && (numero % 10) < 10000)
        System.out.println ("El número tiene 5 cifras");
  }
}
//hacerlo igual que con el 0 