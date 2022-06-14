import java.util.Scanner; //se importa la clase Scanner
public class EntradaDeDatos {
  public static void main (String []args) {
    String variableCadenaTexto;
    //se declara e inicializa una variable de tipo Scanner
    Scanner sc=new Scanner (System.in);
    //usamos la variable para leer del teclado
    variableCadenaTexto = sc.nextLine();
  }
}
