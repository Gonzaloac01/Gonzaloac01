import java.util.Scanner;
public class Bucles4 {
  public static int adivinaNumero (int numero) {
    Scanner sc=new Scanner (System.in);
    int i= 0;
    int r= sc.nextInt();
    while (r != numero) {
      i++;
      System.out.println ("Error");
      System.out.println ("Nº intentos " +i);
      r= sc.nextInt();
    }
    return i;
  }
  public static void main (String [] args) {
    System.out.println (adivinaNumero(0));
  }
}

      
                          
  
