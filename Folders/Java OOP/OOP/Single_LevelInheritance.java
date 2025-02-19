class shape {               // Base class or Parent class 
    String color; 
    void print (){
        System.out.println(color);
    } 
} 

class Triangle extends shape {       // Sub class or child class

}

public class Single_LevelInheritance {
      public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.color="Red"; 
        t1.print(); 
    }
      }

  