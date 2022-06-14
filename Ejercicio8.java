//declarar dos numeros enteros, sacarlos por pantalla con el resto y ver si es par o no
import java.util.Scanner;
public class Ejercicio8 {
  public static void main (String []args) {
    int numeroA;
    int numeroB;
    int resto;
    int resto2;
    Scanner sc=new Scanner (System.in);                            
    numeroA= sc.nextInt();
    numeroB= sc.nextInt();
    resto= numeroA%numeroB;
    resto2= resto%2;
    System.out.println ("%= "+(numeroA%numeroB));
    System.out.println ("¿El resto es par? "+(resto2 == 0));
  }
}