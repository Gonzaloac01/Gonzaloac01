//7. Indicar cuál es el mayor de tres números y si es par o impar
import java.util.Scanner;
public class EJERCICIO_D {
  public static double Mayor (double a, double b, double c) {
    double res;
    if (a > b && a > c) 
      res= a;
    else if (b > a && b > c)
      res= b;
    else 
      res= c;
    return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduce 3 números");
    double a= sc.nextDouble();
    double b= sc.nextDouble();
    double c= sc.nextDouble();
    double res= Mayor(a, b, c);
    if (Mayor(a, b, c) % 2 == 0) {
      System.out.println ("El mayor de los 3 números es: " +res);
      System.out.println ("Además es par"); }
    else {
      System.out.println ("El mayor de los 3 números es: " +res);
      System.out.println ("Además es impar"); }
  }
}

    