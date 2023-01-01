public class SavaingsAccount{

// instances field
    int balance;
// constructor method
    public SavaingsAccount(int initialbalance){
        balance = initialbalance;
    }
 
// main method
public static void main(String[] args){
    SavaingsAccount savings = new SavaingsAccount(2000);
    
    // check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);
    // Withdrawing: 
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You Just Withdrew " + 300);

    // Check balance
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);

    // Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited " + 600);

    // Check balance:  
    System.out.print("Hello!");
    System.out.println("Your balance is " + savings.balance);

    // Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("Your just deposited " + 600);

    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);

 }
}