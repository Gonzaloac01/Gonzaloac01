import java.util.Scanner;
public class IfEjercicio3 {
  public static void main (String [] args) {  
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca la edad de una persona");
    int edad;
    edad= sc.nextInt ();
    System.out.println ("Edad introducida= "+(edad));
    if (edad < 18) 
      System.out.println ("La edad que has introducido se corresponde a una persona que es menor de edad= "+edad); 
    else if (edad <= 65) 
        System.out.println ("La edad que has introudcido se corresponde a una persona que es mayor de edad= "+edad); 
      else 
        if (edad > 65)
          System.out.println ("La edad que has introducido se corresponde a una persona que es jubilada= "+edad); 
      }
    }

      
   