public class bank {
    // instance field
    String accountName;
    int accountBalance;

    // constructor method
    public bank(String Name, int balance){
        accountName = Name;
        accountBalance = balance;
    }
    // main method
    public static void main(String[] args) {
        bank firstAccount = new bank ("Ahmed", 1000);
        bank secondAccount = new bank("Mohamed", 2000);

    System.out.println(firstAccount.accountName + " has a balance of " + firstAccount.accountBalance);
    System.out.println(secondAccount.accountName + " has a balance of " + secondAccount.accountBalance);
    }
    
}
