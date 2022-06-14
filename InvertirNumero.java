import java.util.Scanner;
public class InvertirNumero {
public static int InvertirNumero (int numero) {
    int res;
    numero= numero < 0? - numero: numero;
    if (numero < 10) {
      res= numero; }
      else {
        res= ((numero%10)*(10^numeroDigitos(numero/10) + InvertirNumero (numero/10)); }
      return res; }
public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
      int numero;
      numero= sc.nextInt();
      int res= InvertirNumero (numero);
      System.out.println (+res); 
      System.out.println (InvertirNumero(15));
      System.out.println (InvertirNumero(18));
      System.out.println (InvertirNumero(35));
      System.out.println (InvertirNumero(0));
      System.out.println (InvertirNumero(-5));
    }
}
//hacer con la suma recursiva
