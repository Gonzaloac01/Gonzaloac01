import java.util.Scanner;
public class String4 {
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
    int contarVocales= cadena.length();
    if (contarVocales == 1) 
      res= esVocal(contarVocales(cadena));
      else 
      res= esVocal(contarVocales(cadena) - 1) + contarVocales(cadena);
      return res;
  }
  public static void main (String [] args) {
    String cadena1;
    Scanner sc=new Scanner (System.in); 
    cadena1= sc.next();
    System.out.println (contarVocales (cadena1));
  }
}

  