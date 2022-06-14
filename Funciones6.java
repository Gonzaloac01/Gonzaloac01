import java.util.Scanner;
public class Funciones6 {
  public static boolean esMultiplo (int dividendo, int divisor) {
    return ((dividendo % divisor)== 0); }
    public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
      int dividendo, divisor;
      System.out.println ("Introduzca el dividendo= Y");
      dividendo= sc.nextInt();
      System.out.println ("Introduzca el divisor= X");
      divisor= sc.nextInt();
    if (divisor == 0) {
      System.out.println ("ERROR"); }
    else if (esMultiplo (dividendo, divisor) == true) {
    System.out.println ("X es múltiplo de Y"); }
    else {
        System.out.println ("X no es múltiplo de Y"); }
    }
}


