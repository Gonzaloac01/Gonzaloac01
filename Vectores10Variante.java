import java.util.Scanner; //con for
public class Vectores10Variante {
  public static boolean estaOrdenado (int[] array) {
    boolean res= false;
    int longitud= array.length;
    int i= 0;
    while ((i<= longitud -1) && (res)) {
      if (array[i]> array[i+1])
        res= false;
      i++; }
    return res;
  }
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int []array;
    array= new int[4];
    array[0]= sc.nextInt();
    array[1]= sc.nextInt();
    array[2]= sc.nextInt();
    array[3]= sc.nextInt();
    System.out.println(estaOrdenado(array));
  }
}

    