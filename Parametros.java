public class Parametros {
  public static void main (String [] args) {
    int n= 10;
    System.out.println ("Antes: " +n);
    cambiar (n);
    System.out.println ("Despu�s: " +n);
  }
  public static void cambiar (int a) {
    a= 50;
    System.out.println ("Dentro: " +a);
  }
}
