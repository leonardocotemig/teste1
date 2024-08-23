/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x=1;
        System.out.println("O valor e "+x);
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        int e = 0;
         a += -1;
         b += 1;
         c += 1;
         
        
         System.out.println("Valor de a = " + a);
         System.out.println("Valor de b = " + b);
         System.out.println("Valor de c = " + c);
         for(int n=0; n<100; n++) System.out.println("O valor e "+n);
        
         long Fibonacci[] = {1,1,2,3,5,8,13,34,55,89,144};

        
         int op = 2;
    System.out.print("valor de op eh: "+op);
    switch(op) {
      case 1:
         System.out.println("case 1: op="+op);
         break;
      case 2:
         System.out.println("case 2: op="+op);
         break;
      case 3:
         System.out.println("case 3"+op);
         break;
      default:
         System.out.println("default: op nao esta no limite 1..3");
    }
    
    
    
    
    
    
    
    
    
    
    }
    
}
