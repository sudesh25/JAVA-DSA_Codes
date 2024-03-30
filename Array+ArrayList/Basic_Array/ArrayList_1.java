import java.util.*; 
public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(10); 
       list.add(2);
       list.add(5);
       list.add(4);
       list.add(7);
       list.add(4);
       list.add(3);
       
       System.out.println(list);  

       int element=list.get(0);
       System.out.println(element); 
       
       System.out.println(list);        
        
       list.set(2,77); 
       System.out.println(list);   
        
       list.remove(5);
       System.out.println(list);   
        
       int size=list.size();
       System.out.println(size);   

       Collections.sort(list); 
       System.out.println(list);   
    }
}
