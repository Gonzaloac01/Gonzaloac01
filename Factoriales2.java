public class Factoriales2 {
  public static int Factorial (int numero) {
    if (numero <= 1) {
      return 1; }
    else {
     return (numero*Factorial(numero-1)); } }
  public static void main (String [] args) {
      System.out.println (Factorial(4));
  }
}
