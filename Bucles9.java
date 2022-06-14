import java.util.Scanner;
public class Bucles9 {
  public static void dibujarLinea(String limitador, String intercalador, int n) {
    String linea = "";
    linea += limitador;
    for (int i = 2; i < n; i++) 
      linea += intercalador.toString();
    linea += limitador;
    System.out.println(linea);
  }
  public static void dibujarCuadrado(int n) {
    if (n < 2) System.out.println("+"); 
    dibujarLinea("+", "-", n);  
    for (int i = 2; i < n; i++) {
      dibujarLinea("|", " ", n);
    }  
    dibujarLinea("+", "-", n);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n= sc.nextInt();
    dibujarCuadrado(n);
  }
}  