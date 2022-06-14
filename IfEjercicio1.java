import java.util.Scanner;
public class IfEjercicio1 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int valor1;
    valor1= sc.nextInt();
    int valor2;
    valor2= sc.nextInt();
    int valor3;
    valor3= sc.nextInt();
    if ((valor1>= valor2) && (valor1>= valor3)) {
      System.out.println ("Valor1 es el más grande= "+(valor1)); }
    else {
      if ((valor2>= valor3)) {
      System.out.println ("Valor2 es el más grande= "+(valor2)); }
      else {
      if (valor2<= valor3) {
        System.out.println ("Valor3 es el más grande= "+(valor3)); }}}
  }
}

      