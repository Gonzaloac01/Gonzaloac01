import java.util.Scanner;
public class Vectores5 {
  public static boolean esta (int elemento, int[] array) {
    boolean res= false;
    int longitud= array.length;
    for (int i= 0; ((i< longitud)&& (!res)); i++) { 
      if (elemento== array[i])
        res= true;
    }
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
    int elemento= sc.nextInt();
    System.out.println (esta(elemento, array)); //también se puede poner, (esta( 7, new int[]{3, 9, 0, 7, 3}))
  }
}
    
    
    