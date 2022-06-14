 //Función que recibe un número N como parámetro y escribe N asteriscos por
//pantalla
import java.util.Scanner;
public class EJERCICIO_1 {
  public static String numero (int numero) {
    String res="";
    for (int i= 0; i<= numero; i++) {
      res+= System.out.print ("*"); }
    return res;
  }

public static void main (String []args) {
  Scanner sc=new Scanner (System.in);
  int numero= sc.nextInt();
  System.out.println (numero(numero));
}
}