import java.util.Scanner;
public class Bucles3 {
  public static int Encontrar (int n) {
    int res;
    if (n % 2 != 0)
      res= n;
    else
      res= 1;
    return res;
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int n= sc.nextInt();
    System.out.println (Encontrar(n));
  }
}
      