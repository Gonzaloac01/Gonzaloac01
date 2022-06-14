public class Ejercicio2Presentacion {
  public static void main (String [] args) {
    int A=10;
    int B=20;
    int C=30;
    int D=40;
    int intercambioA= A;
    int intercambioB= B;
    int intercambioC= C;
    int intercambioD= D;
    intercambioA= D;
    intercambioD= B;
    intercambioC= A;
    intercambioB= C;
    System.out.println ("Valor A= "+intercambioA);
    System.out.println ("Valor B= "+intercambioB);
    System.out.println ("Valor C= "+intercambioC);
    System.out.println ("Valor D= "+intercambioD);
  }
}