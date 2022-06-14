import java.util.Scanner;
public class EcuacionSegundoGrado {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Ecuaciones de segundo grado");
    System.out.println ("Este programa va a sacar las soluciones de cualquier ecuación de segundo grado que tenga esta forma");
    System.out.println ("ax^2 + bx + c = 0");
    System.out.println ("Introduce el valor de 'a'");
    double a= sc.nextDouble();
    System.out.println ("Introduce el valor de 'b'");
    double b= sc.nextDouble();
    System.out.println ("Introduce el valor de 'c'");
    double c= sc.nextDouble();
    
    double x1, x2;
    x1= ((-b + Math.sqrt((b*b)-(4*a*c)))/(2*a));
    x2= ((-b - Math.sqrt((b*b)-(4*a*c)))/(2*a));
    
    System.out.println ("El valor de la primera solución es: "+x1);
    System.out.println ("El valor de la segunda solución es: "+x2);
  }
}
