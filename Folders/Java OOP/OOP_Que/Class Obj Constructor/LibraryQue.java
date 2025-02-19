public class LibraryQue {
        public static void main(String[] args) {
              library branch1 = new library();
              library branch2 = new library(); 
             
              branch1.totalbook(20); 
              branch1.addBooksToBranch(10);

              branch2.totalbook(30); 
              branch2.addBooksToBranch(45); 

            branch1.display();
        }
}  
class library {
    static int  totalbook=0 ;    
   int  booksInBranch; 
   void totalbook(int count )
   {
    totalbook = totalbook +count ;
   } 
   void  addBooksToBranch(int count ){
        this.booksInBranch = count;
   } 
 void display()
 {
    System.out.println("Books in branch "+booksInBranch + " books in total "+totalbook);
 }
} 
