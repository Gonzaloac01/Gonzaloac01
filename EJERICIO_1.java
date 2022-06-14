//1. Calcular el área de un círculo para un radio introducido por teclado (double)
import java.util.Scanner;
public class EJERICIO_1 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int numero;
    double radio, res;
    System.out.println ("Calculadora de áreas para círculos");
    System.out.println ("¿En que únidad quieres el área del círculo?");
    System.out.println ("Escoge el número de la unidad que quieras obtener: ");   
    System.out.println ("1. mm*mm");
    System.out.println ("2. cm*cm");
    System.out.println ("3. dm*dm");
    System.out.println ("4. m*m");
    numero= sc.nextInt();
    switch (numero) {
      case 1: 
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= Math.pow(radio, 2)*Math.PI;
    System.out.println ("El área del cículo es "+res+" mm*mm");
      break;
     case 2:
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= Math.pow(radio, 2)*Math.PI;
    System.out.println ("El área del cículo es "+res+" cm*cm");
      break;
     case 3:  
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= Math.pow(radio, 2)*Math.PI;
    System.out.println ("El área del cículo es "+res+" dm*dm");
      break;
     case 4:
    System.out.println ("Introduzca el radio en la unidad deseada");
    radio= sc.nextDouble();
    res= Math.pow(radio, 2)*Math.PI;
    System.out.println ("El área del cículo es "+res+" m*m");
      break;
     default:
       System.out.println ("NÚMERO NO VÁLIDO");
    }
                        }
}
                      
                       
 
  
  