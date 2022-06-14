//Realiza un programa que pida por pantalla continuamente que introduzcas un
//número. Te devuelva por pantalla si el número introducido es par o no y que
//acabe cuando se introduzca un número menor que 0
import java.util.Scanner;
public class EJERCICIO_2 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int numero= sc.nextInt();
    while (numero >= 0) {
      if (numero% 2== 0)
        System.out.println ("PAR");
      else
        System.out.println ("IMPAR");
      numero= sc.nextInt();
    }
  }
}

    