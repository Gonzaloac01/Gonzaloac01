public class Examen2Alternativa2 {
  public static void main(String[] args) {
    System.out.println (matrizATexto(frecuenciaVocales("Hola Mundo")));
  }
  public static int[] frecuenciaVocales (String texto) {
 int[] res = new int[5];
 texto=texto.toLowerCase();
 for (int i=0; i<texto.length(); i++) {
 char caracter = texto.charAt(i);
 switch (caracter) {
 case 'a':
 res[0]++;
 break;
 case 'e':
 res[1]++;
 break;
 case 'i':
 res[2]++;
 break;
 case 'o':
 res[3]++;
 break;
 case 'u':
 res[4]++;
 break;
 }
 }
 return res;
 }
    public static String matrizATexto (int[] matriz) {
    String texto="";
    for(int i=0; i< matriz.length; i++){
        texto+= matriz[i] + "\t";
        texto+= "\n";
    }
    return texto;
  }
}