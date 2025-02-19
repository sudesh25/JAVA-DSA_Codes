    // Compile time polymorphism ............ Method overloading 

public class CalculatorQue{
      public static void main(String[] args) {
           calculator obj =new calculator(); 
           obj.calculateArea(30);
           obj.calculateArea(30.0);
           obj.calculateArea(30,30);
      }
}  
class calculator{
      void calculateArea(double radius)
      {
        System.out.println("Area of circle is "+3.14*radius*radius);
      } 
      void calculateArea(int length,int breadth)
      {
        System.out.println("Area of Reactangle "+length*breadth);
      } 
      void calculateArea(int side)
      {
        System.out.println("Area of square is "+side*side);
      } 
      
}