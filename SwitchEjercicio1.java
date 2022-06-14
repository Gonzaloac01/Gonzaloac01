import java.util.Scanner;
public class SwitchEjercicio1 {
  public static void main (String [] args) {  
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca un número menor que 10 y mayor que 0= ");
    int valor1;
    valor1= sc.nextInt();
    switch (valor1) {
      case 1: System.out.println ("El numero introducido es el uno");
      break;
      case 2: System.out.println ("El numero introducido es el dos");
      break;
      case 3: System.out.println ("El numero introducido es el tres");
      break;
      case 4: System.out.println ("El numero introducido es el cuatro");
      break;
      case 5: System.out.println ("El numero introducido es el cinco");
      break;
      case 6: System.out.println ("El numero introducido es el seis");
      break;
      case 7: System.out.println ("El numero introducido es el siete");
      break;
      case 8: System.out.println ("El numero introducido es el ocho");
      break;
      case 9: System.out.println ("El numero introducido es el nueve");
      break;
      default: System.out.println ("El numero introducido no es valido");
    }
  }
}

