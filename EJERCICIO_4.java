//Realizar una función que reciba un parámetro N y muestre por pantalla todos los
//primos anteriores
import java.util.Scanner;
public class EJERCICIO_4 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int contador= 2;
    int numero= sc.nextInt();
    boolean primo= true;
    while ((primo) && (contador!= numero)) {
      if (numero% contador == 0)
        primo = false;
      contador++;
    }
    System.out.println (primo);
  }
}
