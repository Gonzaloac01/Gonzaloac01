//Dadas dos matrices 2x2 cuyos datos, sumar matrices.
//si no te dan la matriz habrá que poner la clase escaner y una función que lea la dimensión.
public class Vectores13 {
  public static String matrizATexto (double[][] matriz) {
    String texto="";
    for(int i=0; i< matriz.length; i++){
      for(int j= 0; j< matriz[i].length; j++){
        texto+= matriz[i][j] + "\t";
      }
      texto+= "\n";
    }
    return texto;
  }
  public static double[][] sumaMatrices (double[][] matrizAux, double[][] matrizAux2) {
    //si las dos matrices no tienen la misma dimensión no se pueden sumar.
    if (matrizAux.length!= matrizAux2.length || matrizAux[0].length!= matrizAux2[0].length) {
      return new double[][] {{0}}; }
      double [][] res = new double [matrizAux.length][matrizAux[0].length]; 
    for (int i= 0; i< matrizAux.length; i++){
      for (int j= 0; j< matrizAux[i].length; j++) 
        res[i][j]= matrizAux[i][j] + matrizAux2[i][j];
    }
    return res;
  }
  public static void main (String[] args) {
    double[][] matriz1 = {{200,3},{-2,0}};
    System.out.println (matrizATexto(matriz1));
    double[][] matriz2 = {{200,18},{66,-100}};
    System.out.println (matrizATexto(matriz2));
    System.out.println (matrizATexto(sumaMatrices(matriz1, matriz2)));
  }
}
