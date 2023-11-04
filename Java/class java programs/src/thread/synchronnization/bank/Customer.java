
package thread.synchronnization.bank;

import java.util.Scanner;


public class Customer implements Runnable{
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        synchronized(account){
        
        System.out.println("mr."+name+"Enter amount to withdraw");
        int amount=sc.nextInt();
        
        
        if(account.isSufficientBalance(amount))
        {
            System.out.println(this.name+"is going to withraw INR amount"+amount+" ");
          account.Withraw(amount);
        
        }
        else
        {
                    System.out.println("Insufficien fund balance");

        }
        }
        
    }
    
    
}
