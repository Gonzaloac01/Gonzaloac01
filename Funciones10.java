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
    System.out.println ("Introduzca un año:");
    anyo= sc.nextInt();
    System.out.println ("Introduzca el número de un mes:");
    mes= sc.nextInt();
    System.out.println ("Introduzca un día:");
    dia= sc.nextInt();
    if (comprobarAnyo (anyo) == true) 
      System.out.println ("Año correcto");
    else 
      System.out.println ("Año incorrecto");
    if (comprobarMes (mes) == true) 
      System.out.println ("Mes correcto");
    else
      System.out.println ("Mes incorrecto");
    if (comprobarDia (dia) == true) 
      System.out.println ("Día correcto");
    else
      System.out.println ("Día incorrecto");
    if (esBisiesto (anyo) == true) 
      System.out.println ("Mes bisiesto");
    else
      System.out.println ("Mes NO bisiesto");
  }
}
                       

               
                     




    

        
      

    