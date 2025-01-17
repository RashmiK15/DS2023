
public class ThreadSyncTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101,"Suresh",40000);
        System.out.println("sa : "+sa);

        Teller teller1 = new Teller("Jane",sa,10000);
        Teller teller2 = new Teller("\tReeta",sa,20000);
        Teller teller3 = new Teller("\t\tSmita",sa,30000);

        teller2.start();
        teller1.start();
        teller3.start();

        try {
            teller1.join(); //waiting for this thread to die
            teller2.join();//waiting for this thread to die
            teller3.join();//waiting for this thread to die
        }
        catch(InterruptedException e) {
            System.out.println("problem : "+e);
        }
        
        System.out.println("sa : "+sa);
    }
}
class Teller extends Thread { //1st - extends 
    SavingsAccount ref; //hasA - current value is null
    double amountToDeposit; //hasA  - current value is zero
    String tellerName;

    Teller(String tn, SavingsAccount x, double y) { //but the ctor will set it
        tellerName = tn;
        ref = x;
        amountToDeposit = y;
    }
    public void depositCash() {
        ref.deposit(tellerName,amountToDeposit);
    }
    public void run() { // 2. override the run
        depositCash();
    }
}
class SavingsAccount {
    int accountNumber;
    String accountHolder;
    double accountBalance;

    public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }
    private void setBalance(String tn,double amountToSet) { //assuming database set - update query
        System.out.println(tn+" Setting the Balance..."+amountToSet);
        accountBalance  = amountToSet; //UPDATE QUERY OF THE DB
    }
    private double getBalance(String tn) { //assuming database get - select query
        System.out.println(tn+" Getting the Balance..."+accountBalance);
        return accountBalance; //SELECT QUERY OF THE DB
    }

    //only one thread is allowed to enter in this method
    public /*synchronized*/ void deposit(String tellerName, double amountToDeposit) {
        System.out.println(tellerName+ " checking her whatsapp");
        System.out.println(tellerName+ " checking her instagram");

        System.out.println(tellerName+ " checking her facebook");
        System.out.println(tellerName+ " checking her SMSs");

        System.out.println(tellerName+" Depositing : "+amountToDeposit);
        double currentBalance = getBalance(tellerName); // find from the database
        double calculatedBalance = currentBalance + amountToDeposit;
        setBalance(tellerName, calculatedBalance); // set it to the database

    }
    
    
    
    

}