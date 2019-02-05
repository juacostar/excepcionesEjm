/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;

/**
 *
 * @author Estudiante
 */
public class Errores {

    
    public Errores(){
        try{
            dividircero();
        }catch(IllegalArgumentException e){
            System.out.println("Division por cero");
        }
        
    }
    
    
    
    public int dividircero(){
        int c=0;
        try{
            String x=null;
            System.out.println("Punto control 1");
            System.out.println(x.length());
         
        }catch(NullPointerException e){
            throw new IllegalArgumentException();
        }
        
        try{
            c=5/0;
        }catch(ArithmeticException e){
            System.out.println("Division por cero");
            
        }
       
        System.out.println("Punto de control 2");
        return c;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Errores e=new Errores();
    }
    
}
