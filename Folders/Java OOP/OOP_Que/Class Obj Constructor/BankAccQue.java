public class BankAccQue{
      public static void main(String[] args) {
           BankAcc acc1 = new BankAcc(1);
           BankAcc acc2 = new BankAcc(2); 

           acc1.deposit(100);
           acc2.deposit(500);

           acc1.withdraw(50);
           acc2.withdraw(100); 
           
         //  acc1.print();
           acc2.print(); 

           BankAcc.all();
      }
} 
class BankAcc{
      static int  bankbal = 0;
      int balance = 0 ; 
    static  int NoAcc=0; 
    int num;

      BankAcc(int num)
      {
           NoAcc++; 
           this.num=num;
      } 

      
       void deposit(int amt)
       { 
           this.balance+=amt; 
           bankbal+=amt;
       } 
       void withdraw(int amt)
       { 
           this.balance= this.balance - amt; 
            bankbal-=amt;
       }  

       void print()
       {
        System.out.println(num+" has bank Bal "+balance);
       } 
       static void all()
       {
        System.out.println("Number of acct is "+NoAcc+" Bank Balane is "+bankbal);
       }

}