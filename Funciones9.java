import java.util.Scanner;
public class Funciones9 { 
  public static double AreaCirculo (double radio) {
        return (radio*radio*Math.PI); }
  public static double AreaTriangulo (double base, double altura) {
        return ((base*altura)/2); }
  public static double AreaRectangulo (double base, double altura) {
        return (base*altura); }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Cálculo de áreas");
    System.out.println ("Elige el número de la área que quieras calcular:");
    System.out.println ("1. Círculo");
    System.out.println ("2. Triángulo");
    System.out.println ("3. Rectángulo");
    int numero;
    double radio;
    double base;
    double altura;
    numero= sc.nextInt ();
    switch (numero) {
      case 1:
        System.out.println ("Introduzca el radio");
        radio= sc.nextDouble ();
        if (radio == 0) {
          System.out.println ("ERROR"); }
          else {
        double res= AreaCirculo (radio);
        System.out.println (+ res); }
          break;
      case 2:
        System.out.println ("Introduzca la base");
        base= sc.nextDouble ();
        System.out.println ("Introduzca la altura");
        altura= sc.nextDouble ();
          if ((base == 0) ||  (altura == 0)) {
          System.out.println ("ERROR"); }
          else {
            double res= AreaTriangulo (base, altura);
        System.out.println (+ res); }
          break;
      case 3:
        System.out.println ("Introduzca la base");
        base= sc.nextDouble ();
        System.out.println ("Introduzca la altura");
        altura= sc.nextDouble ();
        if ((base == 0) || (altura == 0)) {
          System.out.println ("ERROR"); }
          else {
            double res= AreaTriangulo (base, altura);
        System.out.println (+ res); }
          break;
      default:
        System.out.println ("ERROR");
        break;
    }
  }
}

        
        