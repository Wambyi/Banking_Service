/*
    CHECKING ACCOUNT
/
 */

public class CheckingAccount extends BankingService {

    //constructors


    public CheckingAccount() {
    }

    public CheckingAccount(double startBalance) {
        super(startBalance);
    }

    //methods
    public void makeWithdrawal(double withdraw){
        double serviceCharge = 15.0;  //service charge for negative account\
        currentBalance = startBalance;
        if (withdraw > currentBalance)    //check if the withdrawal amount is more than the current balance
        {
            System.out.println("Sorry, insufficient funds!");
        }
        else {
            super.makeWithdrawal(withdraw);
            if (currentBalance < 0){
                double balanceAfterCharges = currentBalance - serviceCharge;
                //if transaction is still successful
                //cx owes amount withdrawn + service charge (-ve amount)
            }
        }
    }


    public void monthlyReport(){

        double monthlyFee = 5.0;
        double chargePerWithdrawal = 0.10;

        double balanceAfterCharges = (chargePerWithdrawal * numberOfWithdrawals) + monthlyFee;

        super.monthlyReport(balanceAfterCharges);
    }



}
