import java.util.Scanner;
public class IfEsMultiplo {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int numero, divisor;
    numero= sc.nextInt () ;
    divisor= sc.nextInt ();
    if (numero % divisor == 0) {
      System.out.println ("X es multiplo de Y"); }
      else {
        System.out.println ("X no es multiplo de Y"); }
  }
}