//Realizar una funci�n que muestre por pantalla la tabla de multiplicar de los
//n�meros del 1 al 10.
public class EJERCICIO_28 {
  public static void main (String []args) {
    int[][]matriz= new int[11][10];
    for (int i= 0; i< 11; i++) {
      for (int j= 0; j< 11; j++) {
        System.out.print (i*j); System.out.print ("\t");
      }
      System.out.println ();
    }
  }
}

      