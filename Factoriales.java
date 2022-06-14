//Recursividad
import java.util.Scanner;
public class Factoriales {
  public static int Factorial (int numero) {
    if (numero <= 1) {
      return 1; }
    else {
     return (numero*Factorial(numero-1)); } }
    public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
      int numero;
      numero= sc.nextInt();      
      int res= Factorial (numero);
      System.out.println (+res); 
  }
}
