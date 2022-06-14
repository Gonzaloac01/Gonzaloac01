import java.util.Scanner;
public class Bucles6 {
  public static boolean esPrimo (int x) {
    boolean res= false;
    int contador= 0;
    for (int i= 1; i<= x; i++) {
      if ((x%i)== 0)
        contador++;
      if (contador== 2)
      res= true;
      else
        res= false;
    }
    return res;
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in); 
    int limite= sc.nextInt();
    for (int i=2; i<= limite; i++){
      if (esPrimo(i)) 
         System.out.print (i+ ", ");
    }
  }
}

