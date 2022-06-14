//Realizar una función que devuelva los días de diferencia entre dos fechas pasadas como parámetro (6 parámetros; día, mes y año de cada fecha)
import java.util.Scanner;
  public class EJECICIO_I {
  public static int Fecha (int dia, int mes, int año, int dia2, int mes2, int año2) {
    Scanner sc=new Scanner (System.in);
    int n, año3, año4;
   switch (mes) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      n=31;
      break;
      case 4:
      case 6:
      case 9:
      case 11:
      n=30;
      break;
      case 2:
      System.out.println ("Introduzca un año");
      año3= sc.nextInt ();
        if (año%4 != 0 || año%100 != 0 ||
           ((año%100 == 0 && año%4 == 0) && !(año%400 == 0))) {
          n=28; }
        else {
          n=29; }
      break;
      default: System.out.println ("El numero introducido no es valido");
      break;
      //ESPACIO
      switch (mes2) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      n=31;
      break;
      case 4:
      case 6:
      case 9:
      case 11:
      n=30;
      break;
      case 2:
      System.out.println ("Introduzca un año");
      año4= sc.nextInt ();
        if (año%4 != 0 || año%100 != 0 ||
           ((año%100 == 0 && año%4 == 0) && !(año%400 == 0))) {
          n=28; }
        else {
          n=29; }
      break;
      default: System.out.println ("El numero introducido no es valido");
      break;
      
    int res;
    res= ((año-año2)*12-(mes-mes2)*n)-(dia-dia2);
      if (res >= 0)
      res= res;
    else
      res= -res;
      return res;
  }
   }
  }
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int dia, mes, dia2, mes2, año, año2;
    dia= sc.nextInt();
    mes= sc.nextInt();
    dia2= sc.nextInt();
    mes2= sc.nextInt();
    int res= Fecha (dia, mes, año, dia2, mes2, año2);
    System.out.println (+res);
  }
  }
