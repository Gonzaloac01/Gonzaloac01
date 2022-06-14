//16. Función que recibe una lista de enteros y la desplaza n posiciones.
import java.util.Scanner;
public class EJERCICIO_30 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int n= sc.nextInt();
    int[] matriz= {1, 2, 3};
    for (int i= 0; i< matriz.length; i++) {
      System.out.print (i+ n);
    }
  }
}

    
    

  