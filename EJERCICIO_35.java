//Función que recibe una matriz cuadrada (error si no lo es) y devuelva la matriz
//traspuesta.
import java.util.Scanner;
public class EJERCICIO_35 {
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int[][] matriz= {{1,2,3}, {4,5,6}, {7, 8, 9}};
    System.out.println (matrizATexto(cuadrada(matriz)));
  }
  public static int[][] cuadrada (int[][] matrizAux) {
    int[][] res= new int[3][3];
    for (int i= 0; i< matrizAux.length; i++){
      for (int j= 0; j< matrizAux.length; j++){
        res[i][j]+= matrizAux[j][i];
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