import java.util.Scanner;
public class SumaRecursiva {
  public static int SumaRecursiva (int numero) {
    int res;
    numero= numero < 0? - numero: numero;
    if (numero < 10) {
      res= numero; }
      else {
        res= (numero%10 + SumaRecursiva(numero/10)); }
      return res; }
  public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
      int numero;
      numero= sc.nextInt();
      int res= SumaRecursiva (numero);
      System.out.println (+res); 
      System.out.println (SumaRecursiva(15));
      System.out.println (SumaRecursiva(18));
      System.out.println (SumaRecursiva(35));
      System.out.println (SumaRecursiva(0));
      System.out.println (SumaRecursiva(-5));
    }
}
    