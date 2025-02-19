public class ShapeQue {
    public static void main(String[] args) {
           circle circle1 = new circle(30);
           reactangle  r1  = new reactangle(22, 34);

           System.out.println("Circle Area is "+circle1.calculateArea());
           System.out.println("Reactanle area is "+r1.calculateArea());
    }
} 
 abstract class Shape{
        
     abstract double calculateArea();
} 
class circle extends Shape{
       
    double r;
    circle(double r)
    {
          this.r=r;
    } 

    double calculateArea()
    {
        return (3.14*r*r);
    }
}
class reactangle extends Shape{
     double b;
     double l;
     reactangle(double l,double b)
     {
        this.l = l; 
        this.b = b;
     } 
     double calculateArea(){
         return l*b;
     }
}
