import java.util.Scanner;
public class InvertirNumeroAlt {
  public static int invertirNumero(int numero) {
    return invertirAux(numero, 0); }  
  public static int invertirAux(int numero, int res) {
    if (numero == 0) 
      return res;
    else
    return invertirAux(numero / 10, (numero % 10) + res * 10); } 
  public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
      int numero;
      numero= sc.nextInt();
      int res= invertirNumero (numero);
      System.out.println (+res); 
  }
}