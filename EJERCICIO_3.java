//Realizar un juego para adivinar un n�mero. Primero se pide el n�mero a adivinar
//y despu�s se piden n�meros continuamente, indicando para cada n�mero
//introducido si el deseado es mayor, menor o si es el n�mero buscado, en cuyo
//caso acabar� el programa
import java.util.Scanner;
public class EJERCICIO_3 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int n= sc.nextInt();
    int numero=sc.nextInt();
    while (numero!= n) {
      System.out.println ("Porfavor, siga intent�ndolo");
      numero= sc.nextInt();
    }
  }
}
