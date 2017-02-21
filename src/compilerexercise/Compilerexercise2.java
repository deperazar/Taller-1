
package compilerexercise;

class DVDPlayer{
    
    boolean canRecord=false;
    
    void recordDVD(){
        System.out.println("DVD recording");
    }
}
public class Compilerexercise2 {
    public static void main(String[] args){
        DVDPlayer d=new DVDPlayer();
        d.canRecord=true;
        d.playDVD();
        
        
        /* El programa no compila ya que el método "playDVD()"
           no existe en la clase DVDPlayer, de la cual d, es un objeto.
           Para que el programa funcione se necesita eliminar la fila 16
        
        */
        
        if(d.canRecord==true){
            d.recordDVD();
        }
        
    }    
}
