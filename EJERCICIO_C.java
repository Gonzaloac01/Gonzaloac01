//A. Realizar un funci�n que tenga dos par�metros enteros y devuelva el m�ximo de los
//dos
//B. Lo mismo pero con 3 par�metros
//C. Igual que B pero utilizando la funci�n de A.
  
import java.util.Scanner;
public class EJERCICIO_C {
  public static int Maximo (int a, int b) {
    int res;
    if (a > b)
      res= a;
    else
      res= b;
    return res; }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);   
    System.out.println ("Introduzca tres n�meros");
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    int res= Maximo(a, b);
    if (c > Maximo(a, b)) 
      System.out.println ("El m�ximo de los tres n�meros es: " +c);
    else
      System.out.println ("El m�ximo de los tres n�meros es: " +res);
  }
}