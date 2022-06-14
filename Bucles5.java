import java.util.Scanner;
public class Bucles5 {
  public static int factorial (int x) {
    int factorial= 1;
    for (int i= 1; i<= x; i++) {
      factorial= factorial* i; }
    return factorial;
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int x= sc.nextInt();
    int res= factorial(x);
    System.out.println(+res);
  }
}