//Realizar una función que reciba 2 parámetros y muestre por pantalla los primos
//entre ambos
public class EJERCICIO_5 {
  public static void main (String []args) {
    System.out.println (primos(2, 8));
  }
  public static int primos (int numero, int numero2) {
    int contador= 2;
    boolean primo= true;
    while ((primo) && (contador!=numero)){
      if (numero% contador == 0)
        primo= false;
      contador++;
    }
  }
    return contador;
  }
}

int contador = 2;
boolean primo=true;
 
while ((primo) && (contador!=numero)){
  if (numero % contador == 0)
    primo = false;
  contador++;
}