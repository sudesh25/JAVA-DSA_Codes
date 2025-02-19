class Student
{
    String name;
    static String school;
} 
public class Static {
    public static void main(String[] args) {
        Student.school="GSES";
        System.out.println(Student.school);               //We can directly access then static item without making obj
    }
}
