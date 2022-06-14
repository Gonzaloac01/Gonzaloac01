import java.util.Scanner;
public class Bucles8Variante {
  public static String imprimeT (int altura) {
    String res= " ";
    for (int i= altura; i>= 1; i--) {
      for (int j= 1; j<= i; j++) {
        System.out.print ("*");
      }
      System.out.println ();
    }
    return res;
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int altura= sc.nextInt();
    System.out.println (imprimeT(altura)); 
  }
}

  
