import java.util.Scanner;
public class SwitchEjercicio2 {
public static void main (String [] args) {  
    Scanner sc=new Scanner (System.in);
    System.out.println ("Introduzca un n�mero del mes del a�o");
    int valor1;
    valor1= sc.nextInt();
    switch (valor1) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println ("Este mes tiene 31 d�as");
      break;
      case 4:
      case 6:
      case 9:
      case 11:
      System.out.println ("Este mes tiene 30 d�as");
      break;
      case 2:
      System.out.println ("Este mes tiene 28 d�as");
      default: 
      System.out.println ("El numero introducido no es valido");
    }
  }
}

