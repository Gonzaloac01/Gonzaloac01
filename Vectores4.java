import java.util.Scanner;
public class Vectores4 {
  public static String aTexto (int[] array) {
    String res= " ";
    int longitud= array.length;
    for (int i= 0; i< longitud; i++) {
      res+= array[i];
      if (i!= longitud- 1)
        res+= ",";
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
    System.out.println (aTexto(array));
  }
}
    
    
    