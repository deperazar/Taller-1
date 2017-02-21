

package ejerciciopoo;

import ch.aplu.turtle.Turtle;
import java.util.*;

/**
 *
 * @author Equipo
 */
public class Scene {
   private  Turtle joe;
   
   public Scene(){
     this.joe =  new Turtle(); 
   }
   
   
   public void Triangle(double length0){
       
       joe.setPos(-180, 0);
       joe.right(150);
       joe.forward(length0);
       joe.left(120);
       joe.forward(length0);
       joe.left(120);
       joe.forward(length0);
       joe.right(180);
      
   }
   public void Square(double length0,double length1){
       joe.setPos(-180+20+length0, 0);
       for(int i=0;i<4;i++){
           joe.forward(length1);
           joe.right(90);
           
       }
       
       
   }
   
   public void Pentagon(double length0,double length1,double length2 ){
       joe.setPos(-180+60+length1+length0, 0);
       joe.forward(length2);
       joe.right(72);
       joe.forward(length2);
       joe.right(72);
       joe.forward(length2);
       joe.right(72);
       joe.forward(length2);
       joe.right(72);
       joe.forward(length2);
       
   }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double a,b,c;
       Scanner lec= new Scanner (System.in);
       System.out.println("Introduce triangle side length");
       a= lec.nextDouble();
       System.out.println("Introduce square side length");
       b= lec.nextDouble();
       System.out.println("Introduce pentagon side length");
       c= lec.nextDouble();
       Scene e = new Scene();
       e.Triangle(a);
       e.Square(a,b);
       e.Pentagon(a,b,c);
    }
    
}
