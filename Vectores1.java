//declarar variableArray1, asignar valores a la variable y sacar por pantalla sus valores.
public class Vectores1 {
  public static void main (String [] args) {
    int []variableArray1; //int [] variableArray1= {1, 5, 2, 17};
    variableArray1= new int[4];
    variableArray1[0]= 1;
    variableArray1[1]= 5;
    variableArray1[2]= 2;
    variableArray1[3]= 17;
    for (int i= 0; i<= 3; i++) { //i<= 3 equivalente a i< variableArray1.length equivalente a i<= variableArray1.length-1.
      System.out.println (variableArray1[i]);
    }
  }
}