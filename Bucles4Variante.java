import java.util.Scanner;
public class Bucles4Variante {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int i= 0;
    System.out.println ("N�mero secreto");
    int a= sc.nextInt();
    System.out.println ("�C�al es el n�mero secreto?");
    int r= sc.nextInt();
    while (r != a) {
      i++;
      System.out.println ("Error");
      System.out.println ("N� intentos " +i);
      r= sc.nextInt();
    }
    System.out.println ("Correcto, N� de intentos: "+i);     
  }
}