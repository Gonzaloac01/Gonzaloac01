import java.util.Scanner;
public class Funciones11 {
  public static int rangoEdad (int edad) {
    int res;
    if (edad <= 0)
      res= 0;
    else if (edad > 0 && edad <18)
      res= 1;
    else if (edad >= 18 && edad <= 65)
      res= 2;
    else 
      res= 3;
      return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);  
    System.out.println ("Introduce una edad");
    int edad= sc.nextInt();
    int res= rangoEdad(edad);
    switch (res) {
    case 0:
      System.out.println ("ERROR");
      break;
    case 1:
      System.out.println ("Menor de edad");
    break;
    case 2:
      System.out.println ("Mayor de edad");
    break;
    case 3:
      System.out.println ("Jubilado");
    break; }
  }
}
    