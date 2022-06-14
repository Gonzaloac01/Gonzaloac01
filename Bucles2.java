//suma de los números pares.
import java.util.Scanner;
public class Bucles2 {
  public static int sumaN (int n) {
    int suma= 0;
    for (int i=1; i<= n; i++) { 
      if (i%2 == 0)
        suma= suma + i;
    }
    return suma;
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int n= sc.nextInt();
    System.out.println (sumaN(n));
  }
}
      