import java.util.Scanner;
public class String4Variante {
  public static int esVocal (String cadena1) {
    int res1;
    String a, e, i, o, u;
    if ((cadena1== a)||(cadena1== e)||(cadena1== i)||(cadena1== o)||(cadena1== u))
      res1= + 1;
    else
      res1= + 0;
    return res1;
  }
  public static int contarVocales (String cadena) {
    int res;
    if (cadena.length()==0) {
      res= 0; }
    else if (cadena.length() == 1) 
      res= esVocal(cadena);
    else 
      res= esVocal((cadena.length)- 1) + (cadena);
      return res;
  }
  public static void main (String [] args) {
    String cadena;
    Scanner sc=new Scanner (System.in); 
    cadena= sc.next();
    System.out.println (contarVocales (cadena));
  }
}