import java.util.Scanner;
public class IfEjercicio4 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca un número");
    int valor1;
    valor1= sc.nextInt();
    if (valor1 < 0) {
      System.out.println ("El valor absoluto del número que has introducido es= "+(-valor1)); }
    else {
      System.out.println ("El valor absoluto del número que has introducido es= "+(valor1)); }
  }
}