import java.util.Scanner;
public class Bucles11 {
  public static String imprimeT (int altura) {
    String res= " ";
    for (int i= 1; i<= altura; i++) {
      System.out.print ("*"); }
      System.out.println ();
    for (int i= 0; i< altura-2; i++) {
      System.out.print ("*"); 
      for (int j= 0; j< altura-2; j++) {
        System.out.print (" "); }
      System.out.println ("*"); }
    for (int i= 1; i<= altura; i++) {
      System.out.print ("*"); }
    return res;
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int altura= sc.nextInt();
    System.out.println (imprimeT(altura)); 
  }
}
