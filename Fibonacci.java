import java.util.Scanner;
public class Fibonacci {
  public static int Fibonacci (int numero) {
    if (numero==0) 
      return 0; 
    else if (numero==1) 
      return 1; 
    else 
      return Fibonacci(numero-1) + Fibonacci(numero-2); } 
    public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
       int numero;
       numero= sc.nextInt();
      int res= Fibonacci (numero);
      System.out.println (+res); 
    }
}

      