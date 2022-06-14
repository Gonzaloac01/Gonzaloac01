import java.util.Scanner;
public class Funciones11Variante {
  public static String rangoEdad (int edad) {
    String res;
    if (edad <= 0)
      res= "ERROR";
    else if (edad > 0 && edad <18)
      res= "Menor de edad";
    else if (edad >= 18 && edad <= 65)
      res= "Mayor de edad";
    else 
      res= "Jubilado";
      return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);  
    System.out.println (rangoEdad(15));
    System.out.println (rangoEdad(18));
    System.out.println (rangoEdad(35));
    System.out.println (rangoEdad(0));
    System.out.println (rangoEdad(-5));    
    System.out.println ("Introduce una edad");
    int edad= sc.nextInt();
    String res= rangoEdad(edad);
    System.out.println (res);
  }
}