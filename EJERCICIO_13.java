//public static String aTexto(int[] array)
//Crear un String con el contenido contenido del array, devolviendo por ejemplo
//para el array {3,9,0,-2} la cadena “3, 9, 0, -2”
public class EJERCICIO_13 {
  public static void main (String []args) {
    int []array= new int[4];
    array[0]= 1;
    array[1]= 5;
    array[2]= 2;
    array[3]= 17;
    for (int i= 0; i<= array.length- 1; i++) {
      System.out.print (array[i]);
    }
  }
}