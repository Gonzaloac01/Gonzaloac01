import java.util.Scanner;
public class SwitchEjercicio80 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("Calculadora");
    System.out.println ("Elige el número de la operación que quieras realizar");
    System.out.println ("1. Suma");
    System.out.println ("2. Resta");
    System.out.println ("3. Multiplicación");
    System.out.println ("4. División");
    int numero;
    int numero1, numero2;
    numero= sc.nextInt ();
    switch (numero) {
      case 1:
      System.out.println ("Ponga los dos números que quiera sumar");
      numero1= sc.nextInt ();
      numero2= sc.nextInt ();
      System.out.println ("La suma es= "+(numero1 + numero2));
      break;
      case 2:
      System.out.println ("Ponga los dos números que quiera restar");
      numero1= sc.nextInt ();
      numero2= sc.nextInt ();
      int multiplicar;
      multiplicar= ( numero2*numero2);
      System.out.println ("La resta es= "+((32)*(numero2*numero2)));
      break;
      case 3:
      System.out.println ("Ponga los dos números que quiera multiplicar");
      numero1= sc.nextInt ();
      numero2= sc.nextInt ();
      System.out.println ("La multiplicación es= "+(numero1 * numero2));
      break;
      case 4:
      System.out.println ("Ponga los dos números que quiera dividir");
      numero1= sc.nextInt ();
      numero2= sc.nextInt ();
      if (numero2 == 0) {
        System.out.println ("ERROR"); }
      else {
        System.out.println ("La división es= "+(numero1 / numero2)); }      
      break;
      default:
      System.out.println ("El número introducido no es válido");
      break;
    }  
  }
}
