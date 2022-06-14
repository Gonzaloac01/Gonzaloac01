import java.util.Scanner;
public class Bucles6Variante {

    public static boolean esPrimo (int n) {
    boolean encontrado= true;
    int i= 2;
    while (encontrado) {
      if ((n%i)== 0)
        encontrado= false;
      i++;
    }
    return encontrado;