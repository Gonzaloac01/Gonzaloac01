//2. Calcular la longitud de una circunferencia para un radio introducido por teclado
import java.util.Scanner;
public class EJERICIO_2 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int numero;
    double radio, res;
    System.out.println ("Calculadora de longitudes para círculos");
    System.out.println ("¿En que únidad quieres la longitud del círculo?");
    System.out.println ("Escoge el número de la unidad que quieras obtener: ");   
    System.out.println ("1. mm");
    System.out.println ("2. cm");
    System.out.println ("3. dm");
    System.out.println ("4. m");
    numero= sc.nextInt();
    switch (numero) {
      case 1: 
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= 2*radio*Math.PI;
    System.out.println ("El área del cículo es "+res+" mm");
      break;
     case 2:
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= 2*radio*Math.PI;
    System.out.println ("El área del cículo es "+res+" cm");
      break;
     case 3:  
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= 2*radio*Math.PI;
    System.out.println ("El área del cículo es "+res+" dm");
      break;
     case 4:
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= 2*radio*Math.PI;
    System.out.println ("El área del cículo es "+res+" m");
      break;
     default:
       System.out.println ("NÚMERO NO VÁLIDO");
    }
                        }
}