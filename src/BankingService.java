import java.util.Scanner;

public class BankingService {

    protected double startBalance = 0;
    protected double currentBalance;
    protected double totalDeposits;
    protected double totalWithdrawals;
    protected static int numberOfDeposits = 0;
    protected static int numberOfWithdrawals = 0;
    protected double annualInterestRate;
    protected double monthlyServiceCharge = 15.00;
    protected boolean accountStatus;

    //main constructor


    public BankingService() {
    }

    public BankingService(double startBalance) {
        this.startBalance = startBalance;
    }

    public void makeDeposit(double deposit){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount to be deposited: ");
        deposit = sc.nextDouble();
        //account balance = deposit + current balance --- make adjustment, to startBalance
        currentBalance = startBalance + deposit;  //update account balance
        ++numberOfDeposits;   //increment number of deposit
        totalDeposits = numberOfDeposits;
    }


    public void makeWithdrawal(double withdraw){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount to be withdrawn: ");
        withdraw = sc.nextDouble();
        currentBalance = currentBalance - withdraw;
        ++numberOfWithdrawals;
        totalWithdrawals = numberOfWithdrawals;
    }

    public double calculateInterest(double balance){

        double monthlyInterestRate = annualInterestRate/12;
        double monthlyInterest = currentBalance * monthlyInterestRate;
        balance = currentBalance + monthlyInterest;
        currentBalance = balance;
        return currentBalance;  //return the current balance
    }

    public void monthlyReport(double balance){

        //calculate monthly service charges from the balance,

        balance = currentBalance - monthlyServiceCharge;
        calculateInterest(balance);
        numberOfWithdrawals = 0; //reset number of withdrawals, deposits and monthly service charge
        numberOfDeposits = 0;
        monthlyServiceCharge = 0;
    }
}
