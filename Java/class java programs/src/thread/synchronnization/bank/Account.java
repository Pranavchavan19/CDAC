package thread.synchronnization.bank;

public class Account {

    private int balance = 10000;

    public boolean isSufficientBalance(int amount) {

        if (balance < amount) {
            return false;
        } else {
            return true;
        }
    }

    public void Withraw(int amount) {
//       if(isSufficientBalance(amount))
//       {
//       balance=balance-amount;
//           System.out.println("Remainning balance is INR Balance");
//       }
//       else
//       {
//           System.out.println("Insufficient balance");
//       }

        balance = balance - amount;
        System.out.println("Remaining bal is INR " + balance + " ");
    }
}
