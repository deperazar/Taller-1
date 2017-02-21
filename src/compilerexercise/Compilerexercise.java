//Daniel Eduardo Peraza Rivera. Cod=25481252
package compilerexercise;

class TapeDeck{
    
    boolean canRecord= false;
    
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
}

public class Compilerexercise {

    public static void main(String[] args){
        t.canRecord=true;     
                                /*El programa no compila, 
                                ya que no se declara la variable t
                                como objeto de la clase TapeDeck, para
                                que el programa funcione correctamente,
                                se debe añadir la siguiente línea de código,
                                justo antes de la línea 20:
        
                                TapeDeck t= new TapeDeck(); */ 
        t.playTape();
        
        if(t.canRecord==true){
        t.recordTape();
    }   
    }
}
