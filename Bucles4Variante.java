import java.util.Scanner;
public class Bucles4Variante {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int i= 0;
    System.out.println ("Número secreto");
    int a= sc.nextInt();
    System.out.println ("¿Cúal es el número secreto?");
    int r= sc.nextInt();
    while (r != a) {
      i++;
      System.out.println ("Error");
      System.out.println ("Nº intentos " +i);
      r= sc.nextInt();
    }
    System.out.println ("Correcto, Nº de intentos: "+i);     
  }
}