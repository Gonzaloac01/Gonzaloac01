public class Ejercicio7 {
  public static void main (String []args) {
    int numeroA= 10;
    int numeroB= ++numeroA;
    // Si ponemos "X++" el valor de numeroB se va a convertir en el valor del numeroA y el valor del numeroA se incrementara en una unidad
    // Si ponemos "++X" el valor de numeroB se va a convertir en el valor del numeroA +1 y el valor del numeroA sera al valor del numeroB
    System.out.println ("numeroA= "+(numeroA));
    System.out.println ("numeroB= "+(numeroB));
  }
}
