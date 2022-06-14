import java.util.Scanner;
public class Potencia {
  public static double Potencia (double numero, double n) {
    double res= 1;
    if (n >= 1) 
      res= numero * Potencia(numero, n-1);
    else if (n <= -1)
      res= 1/numero * Potencia (numero, n+1);
    else
      res= 1;
    return res; }
    public static void main (String [] args) {
      Scanner sc=new Scanner (System.in);
      double numero, n;
      numero= sc.nextInt();
      n= sc.nextInt();    
      double res= Potencia (numero, n);
      System.out.println (+res); 
  }
}
