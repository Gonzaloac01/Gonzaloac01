//Función que recibe un array de enteros y una posición y devuelve un array con el
//elemento de esa posición eliminado y sin dejar huecos (es decir que se
//decrementa la longitud del array)
public class EJERCICIO_305 {
  public static void main (String []args) {
    int[] matriz= {1, 2, 3};
    int n= 1;
    System.out.println (matrizATexto(posicion(matriz, 1)));
  }
  public static int[] posicion (int[] matrizAux, int n) {
    int[] res= new int[3];
    for (int i= 0; i< matrizAux.length; i++) {
      res[i]+= matrizAux[i];
      if (matrizAux[n])
        res[i]+= 0;
    }
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
      
      