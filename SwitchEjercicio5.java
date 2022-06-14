import java.util.Scanner;
public class SwitchEjercicio5 {
  public static void main (String [] args) {
    Scanner sc=new Scanner (System.in);
    int x, y, z;
    x= sc.nextInt ();
    y= sc.nextInt ();
    z= sc.nextInt ();
    if ((x>y) && (y>z) && (z<y)) 
      System.out.println (x+" > "+y+" > "+z); 
    else if ((x>y) && (y<z) && (z<y)) 
      System.out.println (x+" > "+y+" < "+z); 
    else if ((x<y) && (y>z) && (z<y)) 
      System.out.println (x+" < "+y+" > "+z); 
    else if ((x<y) && (y<z) && (z<y)) 
      System.out.println (x+" < "+y+" < "+z); 
    else if ((x>y) && (y>z) && (z<y)) 
      System.out.println (x+" > "+y+" > "+z); 
    else if ((x>y) && (y<z) && (z<y)) 
      System.out.println (x+" > "+y+" < "+z); 
    else if ((x<y) && (y>z) && (z<y)) 
      System.out.println (x+" < "+y+" > "+z); 
    else if ((x<y) && (y<z) && (z<y)) 
      System.out.println (x+" < "+y+" < "+z); 
    }
}

    
        
    