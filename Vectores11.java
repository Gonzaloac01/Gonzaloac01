import java.util.Scanner;
public class Vectores11 {
  public static int[] invertir (int[] array) {
    int longitud= array.length;
    int[] inversa= new int[longitud];
    for (int i= 0; i<= longitud- 1; i++) {
      inversa[i]= array[longitud-1-i];
    }
    return inversa;
  }
  public static void main (String []args) {
    Scanner sc=new Scanner (System.in);
    int[] inversa= invertir(new int[]{4, 3, 2, 1});
    for (int i= 0; i< inversa.length; i++) {
    System.out.println (inversa[i]);
  }
  }
}
    