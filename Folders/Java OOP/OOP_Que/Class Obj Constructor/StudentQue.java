public class StudentQue {
     public static void main(String[] args) {
         student st1 =new student();
         student st2 =new student();
         student st3 =new student(); 

         st1.name ="sudesh";
         st2.name ="om";
         st3.name ="sudesh";
         
         st1.display();
     }
} 
class student{
    static int totalStudents = 0; 
    String name ; 
    student()
    {
        totalStudents++;
    } 
    void display()
    {
        System.out.println("Name is "+name+" Total Student is "+totalStudents);
    }
}
