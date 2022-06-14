import java.util.Scanner;
public class Funciones10 { 
  public static boolean comprobarAnyo (int anyo) {
    return (anyo > 0);  }
  public static boolean comprobarMes (int mes) {
    return ((mes > 0) && (mes < 13));  }
  public static boolean comprobarDia (int dia) {
    return ((dia > 0) && (dia <32));  }
  public static boolean esBisiesto (int anyo) {
    return ((anyo%4==0) || (anyo%400==0)); }
  public static void main (String [] args) {
    Scanner sc= new Scanner (System.in);
    int dia, mes, anyo;
    System.out.println ("COMPROBADOR DE FECHAS");
    System.out.println ("Introduzca un a�o:");
    anyo= sc.nextInt();
    System.out.println ("Introduzca el n�mero de un mes:");
    mes= sc.nextInt();
    System.out.println ("Introduzca un d�a:");
    dia= sc.nextInt();
    if (comprobarAnyo (anyo) == true) 
      System.out.println ("A�o correcto");
    else 
      System.out.println ("A�o incorrecto");
    if (comprobarMes (mes) == true) 
      System.out.println ("Mes correcto");
    else
      System.out.println ("Mes incorrecto");
    if (comprobarDia (dia) == true) 
      System.out.println ("D�a correcto");
    else
      System.out.println ("D�a incorrecto");
    if (esBisiesto (anyo) == true) 
      System.out.println ("Mes bisiesto");
    else
      System.out.println ("Mes NO bisiesto");
  }
}
                       

               
                     




    

        
      

    