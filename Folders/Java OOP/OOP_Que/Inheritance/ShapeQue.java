public class ShapeQue {
    public static void main(String[] args) {
        circle obj1 = new circle(20.0);
        square obj2 = new square(20); 
        obj1.area();
        obj2.area(); 

        Shape obj = new Shape();
        obj.area();
    }
} 
class Shape {
    void area(){
        System.out.println("Calculating area");
    } 
} 
class circle extends Shape{
     double radius; 
     circle(double radius){
        this.radius=radius;
     }  

     void area(){
        System.out.println("Area of circle is "+(3.14*radius*radius));
     }
} 
class square extends Shape{
    int side ; 
    square(int side){
       this.side=side;
    } 
    void area(){
        System.out.println("Area of Square is "+(side*side));
     }
}
