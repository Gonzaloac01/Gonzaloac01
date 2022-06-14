//Realizar un juego para adivinar un número. Primero se pide el número a adivinar
//y después se piden números continuamente, indicando para cada número
//introducido si el deseado es mayor, menor o si es el número buscado, en cuyo
//caso acabará el programa
import java.util.Scanner;
public class EJERCICIO_3 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int n= sc.nextInt();
    int numero=sc.nextInt();
    while (numero!= n) {
      System.out.println ("Porfavor, siga intentándolo");
      numero= sc.nextInt();
    }
  }
}
