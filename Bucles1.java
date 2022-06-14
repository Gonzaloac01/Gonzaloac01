import java.util.Scanner;
public class Bucles1 {
  public static int sumaN (int n) {
    int i= 1;
    int suma= 0;
    for (i=1; i<= n; i++) { //también se puede poner int i= 1;
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
      