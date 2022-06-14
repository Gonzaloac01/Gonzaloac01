import java.util.Scanner;
public class Vectores2 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int []variableArray1; //tambíen se puede poner int []variableArray1= new int[4];.
    variableArray1= new int[4];
    variableArray1[0]= sc.nextInt();
    variableArray1[1]= sc.nextInt();
    variableArray1[2]= sc.nextInt();
    variableArray1[3]= sc.nextInt();
    for (int i= 0; i<= variableArray1.length-1; i++) {
      System.out.println (variableArray1[i]);
    }
  }
}
