//Devolver el elemento máximo almacenado en el array
//9. public static int[] invertir(int[] array)
public class EJERCICIO_20 {
  public static void main (String []args) {
    int[] array= {80, 150, -3};
    int min, max;
    min= max= array[0];
    for (int i= 0; i< array.length; i++) {
      if (max< array[i])
        max= array[i];
    }
    System.out.println (+max);
  }
}
      