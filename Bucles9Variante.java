import java.util.Scanner;
public class Bucles9Variante {
  public static String fila (int longitud, boolean esTapa) {
    String res= " ";
    for (int i= 0; i< longitud; i++) {
      if (i== 0 || i== longitud- 1)
        res+= esTapa?"+":"|";
      else
        res+= esTapa?"-":" ";
    }
    return res+"\n";
  }
  public static void imprimeC (int lado) {
    for (int i= 0; i< lado; i++) {
      int res;
      res+= fila(lado, i==0 || i== lado-1);
  }
}
}
