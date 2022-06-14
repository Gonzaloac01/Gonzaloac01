public class Ejercicio5Presentacion {
  public static void main (String [] args) {
    int C= 110;
    boolean positivo;
    boolean negativo;
    boolean par;
    boolean multiplo5;
    boolean multiplo10;
    boolean mayorque100;
    positivo= (C >= 0);
    negativo= (C < 0);
    par= (C%2 == 0);
    multiplo5= (C%5 == 0);
    multiplo10= (C%10 == 0);
    mayorque100= (C > 100);
    System.out.println ("C es positivo y par= "+ (positivo && par));  
    System.out.println ("C es negativo y multipo de 5= "+ (negativo && multiplo5));  
    System.out.println ("C es multiplo de 10 y mayor que 100= "+ (multiplo10 && mayorque100));  
    //debería haber puesto las variable de 2 en 2
  }
}
