public class BankAccountQue {
     public static void main(String[] args) {
         BankAccount acc1 = new BankAccount(324343,"sudesh",500); 

         System.out.println("Account Holder: "+acc1.getname());
         System.out.println("Initial balance "+acc1.getaccbal());
         System.out.println("Account number "+acc1.getaccno()); 

         acc1.deposit(1000);
         acc1.withdraw(200);
     }
}
class BankAccount{
   private int accno;
   private int accbal;
   private String name;  
      
   BankAccount(int accno,String name,int accbal){
        this.accbal=accbal;
        this.accno=accno;
        this.name=name;
   } 
   int getaccno(){
    return  this.accno;
   }
   int getaccbal(){
    return  this.accbal;
   }
   String getname(){
    return  this.name;
   }

   void setaccno(int accno)
   {
    this.accno=accno;
   } 
   void setaccname(String accname)
   {
      this.name=accname;
   } 
   void setaccbal(int accbal)
   {
    if(accbal>=0)
    {
        this.accbal = accbal;
    } 
    else {
        System.out.println("Balance can not negative ");
    }
   } 
   void deposit(int amt)
   {
    if(amt>0){
        this.accbal+=amt; 
        System.out.println(amt+" Deposited. New balance: "+accbal);
    } 
    else 
    {
        System.out.println("Balance can not negative ");
    }
   } 
   void withdraw(int amt)
   {
    if(amt>0 && amt<=accbal){
        this.accbal-=amt; 
        System.out.println(amt+" Withdrawn. New Balance is "+accbal);
    } 
    else 
    {
        System.out.println("Insufficient balance or invalid amount. ");
    }
   }
  
}