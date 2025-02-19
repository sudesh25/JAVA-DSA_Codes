public class PersonQue {
     public static void main(String[] args) {
         Graduate obj = new Graduate();
         obj.degree = "Bcom"; 
         obj.grade = 'C';
         obj.name = "Sudesh"; 
         obj.graduate();
     }
} 
class Person{
     
    String name ;
    
    void print(){
        System.out.println("Name is "+name);
    }
}
class Student extends Person{
     char grade; 

     void student (){
        System.out.println("Name is "+name+" and Grade is "+grade);
     }
} 
class Graduate extends Student{
    String degree ; 

    void graduate(){
        System.out.println("Name is "+name+" and Grade is "+grade+" and Degree is "+degree);   
    }
}
 