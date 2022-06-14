//Función que recibe un array de enteros y devuelve una matriz con dos filas,
//donde la primera fila son los pares y la segunda fila los impares
public class EJERCICIO_31 {
  public static void main (String []args) {
    int[][] matriz= {{1, 2 , 3}, {4, 5, 6}};
    System.out.println (matrizATexto(paresEImpares(matriz)));
  }
  public static int[][] paresEImpares (int[][] matrizAux) {
    int[][] res= new int[2][2];
    for (int i= 0; i< matrizAux.length; i++) {
      for (int j= 0; j< matrizAux.length; j++) {
        if (i%2 == 0)
          res[1][i]+= matrizAux[i][j];
        else
          res[2][i]+= matrizAux[i][j];
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