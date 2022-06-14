import java.util.Scanner;
public class If {
  public static void main (String [] args) {  
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca un numero entero= ");
    int valor1;
    valor1= sc.nextInt();
    if (valor1%2 == 0) {
      System.out.println ("El numero es par= "+valor1); }
    else {     
      System.out.println ("El numero es impar, multiplicado por 2= "+(valor1*2)); }
  }
}
