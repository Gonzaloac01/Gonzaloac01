import java.util.Scanner;
public class Funciones3 {
  public static double areaCirculo (double radio) {
    return (radio*radio*Math.PI); }
  public static double areaCilindro (double radio, double altura) {
    return (altura*areaCirculo(radio)); }
   public static void main(String args []) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Escribe el radio: ");
      double radio = sc.nextDouble();
      System.out.println("Escribe la altura: ");
      double altura = sc.nextDouble();
      double AREA = areaCilindro(radio, altura);
      System.out.println("Area: "+AREA);
   }
}
