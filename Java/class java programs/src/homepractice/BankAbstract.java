
package homepractice;
 abstract class Bank{
    void credit(){
        System.out.println("Credit total=7777");
    }
    void debit(){
        System.out.println("Debit total=7777");
    }
     abstract void transaction();
    
}
class Sbi extends Bank{

    @Override
    void transaction() {
       System.out.println("Transaction of SBI total=77");
    }
    
}
class Icici extends  Bank{

    @Override
    void transaction() {
               System.out.println("Transaction of ICICI total=888");

    }

}

public class BankAbstract {
    public static void main(String[] args) {
        // creating object referce
   Bank ref;
   ref= new  Sbi();
   ref.credit();
   ref.debit();
   ref.transaction();
    Bank rf;
   rf= new  Icici();
   rf.credit();
   rf.debit();
   rf.transaction();
    }
 
   
    
}
