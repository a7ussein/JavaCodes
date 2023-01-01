public class SavingsAccount {
    
    int balance; 

    public SavingsAccount(int intialBalance){
        balance = intialBalance;
    }

    // checkBalance method
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    // Deposit method
    public int deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
        return amountToDeposit;
    }
    // Withdraw method
    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        // Check balance:
        savings.checkBalance();

        // Withdrawing:
        savings.withdraw(300);

        // Check balance:
        savings.checkBalance();

        // Deposit:
       savings.deposit(600);

        // Check balance:
        savings.checkBalance();
        // Deposit:
        savings.deposit(600);
         // Check balance:
        savings.checkBalance();
    }
}
