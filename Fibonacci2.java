import java.util.Scanner;
public class Fibonacci2 {
  public static int Fibonacci (int numero) {
    int res;
    if ((numero==0) || (numero==1)) {
      res= numero; }
    else {
      res= Fibonacci(numero-1) + Fibonacci(numero-2); }
    return res; }
    public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
       int numero;
       numero= sc.nextInt();
      int res= Fibonacci (numero);
      System.out.println (+res); 
    }
}

      