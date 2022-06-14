import java.util.Scanner;
public class longitudNumero  {
  public static int longitud (int numero) {
    int res;
    if (numero < 10)
      res= 1;
    else 
      res= 1 + longitud (numero/10);
    return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca un número");
    int numero= sc.nextInt();
    System.out.println ("La longitud de "+numero+" es "+longitud(numero));
  }
}
