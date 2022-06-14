//Función que recibe una matriz cuadrada (error si no lo es) y devuelve un array
//con la suma de sus filas
public class EJERCICIO_37 {
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
  public static double[][] sumaFilas (double[][] matrizAux) {
      res= new double[][] {{0}}; }
    double [][] res = new double [2][2]; 
    for (int i= 0; i< matrizAux.length; i++){
      for (int j= 0; j< matrizAux.length; j++){
        res[i][j]+= matrizAux[i][j]; }
    }
    return res;
  }
  public static void main (String[] args) {
    double[][] matriz1 = {{200, 2},{-2,0}};
    System.out.println (matrizATexto(matriz1));
    System.out.println (matrizATexto(sumaFilas(matriz1)));
  }
}
