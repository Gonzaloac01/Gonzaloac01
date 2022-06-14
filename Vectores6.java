import java.util.Scanner;
public class Vectores6 {
  public static int sumaPosPares (int[] array) {
    int res= 0;
    int longitud= array.length;
    for (int i= 0; i< longitud; i++) {
      if (array[i]%2== 0)
        res=res+ array[i];
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
    System.out.println (sumaPosPares(array)); 
  }
}
    
    
    