import java.util.Scanner;
public class SwitchEjercicio3 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("REFRANES POPULARES:");
    System.out.println ("Elige el número de uno de los 3 refranes:");
    System.out.println ("1. Para hacer las cosas con calma");
    System.out.println ("2. Para dar ánimos");
    System.out.println ("3. Experiencia");
    int numero;
    numero= sc.nextInt ();
    switch (numero) {
      case 1:
      System.out.println ("No por mucho madrugar amananece más temprano");
      break;
      case 2:
      System.out.println ("A darle que es mole de olla");
      break;
      case 3:
      System.out.println ("Más sabe el diablo por viejo que por diablo");
      break;
      default:
      System.out.println ("El número introducido no es válido");
      break;
    }  
  }
}
