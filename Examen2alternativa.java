public class Examen2alternativa {
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
  public static void main (String []args) {
    int []res= frecuenciaVocales ("Hola Mundo");
    for (int i=0; i< res.length; i++) { //el length de los string tiene paréntesis(metodo) y el length de los arrays no (atributo)
      System.out.print(res[i]);
    }
  }
  public static boolean estaOrdenado (int[] numero) {
    boolean res= true;
    if (numero.length== 1)
      res= false;
    else
      for (int i= 0; i< numero.length && res; i++) {
        if (numero[i]< numero[i+ 1])
          res= false;
    }
    return res;
  }
  public static String decodificaTexto (char[] alfabeto, int[] clave) {
    String res;
    for (int i= 0; i
  }
}
