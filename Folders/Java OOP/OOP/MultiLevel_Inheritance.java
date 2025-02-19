class shape{
      void printS()
      {
        System.out.println("Display area");
      }
} 
class Triangle extends shape{
     void printT(int n)
     {
        System.out.print("Triangle"); 
        
     }
} 
class Etriangle extends Triangle{
    void printE()
    {
       System.out.println("Etriangle"); 
    }                                      
}                                          
public class MultiLevel_Inheritance {
     public static void main(String[] args) {
          
      Etriangle s1=new Etriangle();
      s1.printS(); 
      s1.printE(); 
      s1.printT(3);
}
}   
        
