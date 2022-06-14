import java.util.Scanner;
public class IfVarianteEjercicio3 {
  public static void main (String [] args) {  
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca la edad de una persona");
    int edad;
    edad= sc.nextInt ();
    String estado= "mayor de edad";
    System.out.println ("Edad introducida= "+(edad));
    if (edad < 18) {
      estado= "menor de edad"; }
    else if (edad > 65); {
      estado= "jubilado"; }
      System.out.println ("Eres" +estado);
    }
  }

