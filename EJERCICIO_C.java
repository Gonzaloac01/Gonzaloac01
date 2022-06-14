//A. Realizar un función que tenga dos parámetros enteros y devuelva el máximo de los
//dos
//B. Lo mismo pero con 3 parámetros
//C. Igual que B pero utilizando la función de A.
  
import java.util.Scanner;
public class EJERCICIO_C {
  public static int Maximo (int a, int b) {
    int res;
    if (a > b)
      res= a;
    else
      res= b;
    return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);   
    System.out.println ("Introduzca tres números");
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    int res= Maximo(a, b);
    if (c > Maximo(a, b)) 
      System.out.println ("El máximo de los tres números es: " +c);
    else
      System.out.println ("El máximo de los tres números es: " +res);
  }
}