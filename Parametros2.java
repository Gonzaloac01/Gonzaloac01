public class Parametros2 {
  public static void main (String [] args) {
    int n= 10;
    System.out.println ("Antes: " +n);
    n= cambiar (n);
    System.out.println ("Después: " +n);
  }
  public static int cambiar (int a) {
    a= 50;
    System.out.println ("Dentro: " +a);
    return a;
  }
}
