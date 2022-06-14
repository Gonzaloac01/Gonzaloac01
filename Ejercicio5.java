public class Ejercicio5 {
  public static void main (String []args) {
    int numeroA= 3;
    int numeroB= 4;
    boolean distinto= false;
    boolean igual= false;
    boolean mayor= false;
    boolean menor= false;
    System.out.println ("Valores antes de operar");
    System.out.println ("distinto "+distinto);
    System.out.println ("igual "+igual);
    System.out.println ("mayor "+mayor);
    System.out.println ("menor "+menor);

    distinto= (numeroA!= numeroB);
    igual= (numeroA== numeroB);
    mayor= (numeroA> numeroB);
    menor= (numeroA< numeroB);
    
    System.out.println ("Valores despues de operar");
    System.out.println ("distinto "+distinto);
    System.out.println ("igual "+igual);
    System.out.println ("mayor "+mayor);
    System.out.println ("menor "+menor);
  }
}
