import java.util.Scanner;
public class String3 {
  public static String Invertir (String x) {
    String res;
    int Longitud= x.length();
    if (Longitud == 1) 
      res= x;
      else 
        res= x.substring(Longitud-1, Longitud) + Invertir(x.substring (0, Longitud-1));
      return res;
  }
  public static void main (String [] args) {
    String x;
    Scanner sc=new Scanner (System.in); 
    x= sc.next();
    System.out.println (Invertir(x));
  }
}
