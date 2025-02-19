import java.util.Scanner;

public class Domy {        //Run time polymorphism 
    public static void main(String[] args) {
         XYZ obj = new XYZ();
        obj.print(); 

        Scanner sc =new Scanner(System.in); 

        // int count = sc.nextInt();
        // double as = sc.nextDouble(); 
        // String str = sc.next();
       
        // Boolean bool = sc.nextBoolean();
        // float pi = sc.nextFloat(); 
        // char chr = sc.next().charAt(0); 
     //   sc.nextLine();
        String str = sc.nextLine();

        System.out.println(str);
    }
}
class Dom{
    void print(){
        System.out.println("Dom");
    } 
    Dom(){

    }
} 
class XYZ extends Dom{
    void print(){
        System.out.println("XYZ");
    } 
    XYZ(){

    }
}























































