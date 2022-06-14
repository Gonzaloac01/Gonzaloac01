import java.util.Scanner;
public class Examen2 {
  public static int[] frecuenciaVocales (String texto) {
    int []array;
    array= new int[5];
    int a, i;
    texto.chartAt(i)= a;
    for (i= 0; i< array.length; i++) {
      if ("a".equalsIgnoreCase("a")) {
        array[0]+= 1; }
      if ("a".equalsIgnoreCase("e")) {
        array[1]+= 1; }
      if ("a".equalsIgnoreCase("i")) {
        array[2]+= 1; }
      if ("a".equalsIgnoreCase("o")) {
        array[3]+= 1; }
      if ("a".equalsIgnoreCase("u")) {
        array[4]+= 1; }
    }
    return array;
  }
  
  public static void main (String []args) {
   Scanner sc=new Scanner (System.in);
   String texto= sc.nextLine();
   for (int i= 0; i< string.length; i++) {
     System.out.println (frecuenciaVocales(texto));
   }
  }
}

    
  