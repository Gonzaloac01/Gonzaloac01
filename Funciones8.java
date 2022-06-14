import java.util.Scanner;
public class Funciones8 {
  public static int maximo (int a, int b) {
    return a>b ? a : b; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int numero1= sc.nextInt();
    int numero2= sc.nextInt();
    int numero3= sc.nextInt();
    int numero4= sc.nextInt();
    System.out.println ("El mayor es "+ maximo(maximo(maximo(numero1, numero2), numero3), numero4));
  }
}
