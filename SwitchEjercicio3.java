import java.util.Scanner;
public class SwitchEjercicio3 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println ("REFRANES POPULARES:");
    System.out.println ("Elige el n�mero de uno de los 3 refranes:");
    System.out.println ("1. Para hacer las cosas con calma");
    System.out.println ("2. Para dar �nimos");
    System.out.println ("3. Experiencia");
    int numero;
    numero= sc.nextInt ();
    switch (numero) {
      case 1:
      System.out.println ("No por mucho madrugar amananece m�s temprano");
      break;
      case 2:
      System.out.println ("A darle que es mole de olla");
      break;
      case 3:
      System.out.println ("M�s sabe el diablo por viejo que por diablo");
      break;
      default:
      System.out.println ("El n�mero introducido no es v�lido");
      break;
    }  
  }
}
