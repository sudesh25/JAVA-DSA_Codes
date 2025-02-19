interface Vehicle{
     void start();
     void stop();
}
class bike implements Vehicle{
     public void start(){
          System.out.println("Bike is starting ");
     } 
     public void stop(){
          System.out.println("Bike is Stop ");
     }   
}
class car implements Vehicle{
     public void start(){
          System.out.println("Car is starting ");
     } 
     public void stop(){
          System.out.println("Car is Stop ");
     }
}
public class VehicleQue {
     public static void main(String[] args) {
         bike bike1 = new bike(); 
         car car1 = new car();

         bike1.start();
         bike1.stop();
         car1.start();
         car1.stop();
     }
}
