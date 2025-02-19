class shape {
    void printS()
    {
        System.out.println("Display area");
    }
} 
class Triangle extends shape {
    void printT()
    {
        System.out.println("Triangle");
    }
} 
class Circle extends shape 
{
    void printC()
    {
        System.out.println("Circle");
    }
}

public class HierarchialInheritance {
      public static void main(String[] args) {
        
        shape s1=new shape(); 
        s1.printS();
        
         System.out.println();

        Triangle s2=new Triangle (); 
        s2.printS();
        s2.printT(); 
 
        System.out.println();
        
        Circle s3=new Circle(); 
        s3.printS(); 
        s3.printC();

      }
}
