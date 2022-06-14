import java.util.Scanner;
public class String2 {
  public static void main (String [] args) {
    char caracter;
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduce un caracter: ");
    caracter= sc.next().charAt(0);
    System.out.println ("Carácter introducido " +caracter);
  }
}
