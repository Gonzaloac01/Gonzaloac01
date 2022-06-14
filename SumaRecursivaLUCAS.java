import java.util.Scanner;

public class SumaRecursiva {
  public static int sumaRecursiva(int num) {
    if ((-9 <= num) && (num <= 9)) return Math.abs(num);
    
    return sumaRecursiva(num / 10) + sumaRecursiva(num % 10);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca las cifras: ");
    int num = sc.nextInt();
    
    System.out.println("La suma de las cifras es " + sumaRecursiva(num));
  }
}