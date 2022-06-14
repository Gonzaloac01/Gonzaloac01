import java.util.Scanner;
public class Funciones2 {
  public static int area (int base, int altura) {
      return (base*altura)/2; }
   public static void main(String args []) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Escribe la base: ");
      int base = sc.nextInt();
      System.out.println("Escribe la altura: ");
      int altura = sc.nextInt(); 
      int area1 = area(base,altura);
      System.out.println("Area: "+area1);
   }
}
