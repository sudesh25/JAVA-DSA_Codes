public class CarQue {
     public static void main(String[] args) {
           car car1 = new car("black","sports");
           car car2 = new car("red","lux"); 
           car1.print(); 
           car2.print(); 
           car.count();
     }
} 
class car{
     String color; 
     String model;
     static int totalCarSold = 0; 
     
     car(String color,String model){
        this.color=color;
        this.model=model;
        totalCarSold++;  
     } 
     public void print()
     {
          System.out.println("The car color is "+color +" and Model is "+model); 
          
     } 
   static   void count(){
          System.out.println(totalCarSold
          );
     }
}
