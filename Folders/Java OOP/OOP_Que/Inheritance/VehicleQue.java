public class VehicleQue {
     public static void main(String[] args) {
        car obj = new car();
        
        obj.make="fds";
        obj.numberOfDoors=3;
        obj.year=2012; 
        obj.display();
     }
} 
class Vehicle{
     String make;
     int year;
      Vehicle(){

      }
     Vehicle(String make,int year)
     { 
          this.make=make;
          this.year=year;
     } 
    
     void display()
     {
        System.out.println("Make of car is "+make+" Year is "+year);
     }
} 
class car extends Vehicle{

        int numberOfDoors ;
       
        void display()
        {
           System.out.println("Make of car is "+make+" Year is "+year+" and Number of door is "+numberOfDoors);
        }
}
