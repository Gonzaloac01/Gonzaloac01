//Función que recibe un parámetro de tipo entero N y devuelve una matriz NxN
//con todos los elementos a 0 excepto la diagonal a 1.
import java.util.Scanner;
public class EJERCICIO_36 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int numero= sc.nextInt();
    System.out.println (matrizATexto(diagonal(numero)));
  }
  public static int[][] diagonal (int numero) {
    int[][] res= new int[numero][numero];
    for (int i= 0; i< numero; i++){
      for (int j= 0; j< numero; j++){
        if (i== j) {
          res[i][j]+= 1; }
        else
          res[i][j]+= 0; 
      }
    }
    return res;
  }
  public static String matrizATexto (int[][] matriz) {
    String texto="";
    for(int i=0; i< matriz.length; i++){
      for(int j= 0; j< matriz[i].length; j++){
        texto+= matriz[i][j] + "\t";
      }
      texto+= "\n";
    }
    return texto;
  }
}