public class EJERCICIO_13VARIANTE {
  public static void main (String []args) {
    int []array= new int[4];
    array[0]= 1;
    array[1]= 5;
    array[2]= 2;
    array[3]= 17;
    System.out.print (matrizATexto(array));
  }
  public static String matrizATexto (int []matriz) { 
    String texto="";
    for (int i=0; i<matriz.length; i++) {
      texto+= matriz[i] + "\t";
      texto += "\n";
    }
    return texto;
  }
}


