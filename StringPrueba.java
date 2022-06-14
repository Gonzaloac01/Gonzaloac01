import java.util.Scanner;
public class StringPrueba {
  public static void main (String [] args) {
  Scanner sc=new Scanner (System.in);
  String a="E";
  int longitud=a.length();
  System.out.println (+longitud);
  String str="El primer programa";
  boolean resultado=str.startsWith("El primer");
  System.out.println (resultado);
  String str2="El primer programa";
  boolean resultado2=str2.endsWith("programa");
  System.out.println (resultado2);
  String cadena="Ejemplo de Operaciones con ";
  int pos=cadena.indexOf('j'); //si ponemos lastindexOf
  System.out.println (+pos);
  String x= "eee";
  String y= "HOla";
  x.concat(y);
  System.out.println(x.concat(y));
  }
}