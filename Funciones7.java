import java.util.Scanner;
public class Funciones7 {
  public static int maximo (int a, int b, int c, int d) {
    int res;
    if (a > b && a > c && a > d)
      res= a;
      else if (b > a && b > c && b > d)
      res= b;
      else if (c > a && c > b && c > d)
      res= c;
      else
      res= d;
        return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int a, b, c, d;
    System.out.println ("Introduzca 4 números");
    a= sc.nextInt();
    b= sc.nextInt();
    c= sc.nextInt();
    d= sc.nextInt();
    int res= maximo (a, b, c, d);
    System.out.println (+res);
  }
}

    