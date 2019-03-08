/*
    SAVINGS ACCOUNT
/
 */

import java.util.Scanner;

public class SavingsAccount extends BankingService {

    //verify if account is active or not

    //constructors
    public SavingsAccount() {
    }

    public SavingsAccount(double startBalance) {
        super(startBalance);
    }

    //methods
    public void makeWithdrawal(double withdraw){
        //check account status
        currentBalance = startBalance;
        if (currentBalance > 25){
            accountStatus = true;
            super.makeWithdrawal(withdraw);
        }
        else {
            accountStatus = false;
            System.out.println("This account is inactive and cannot be withdrawn from!");
        }
    }

    public void makeDeposit(double deposit){
        //check account status
        super.makeDeposit(100);

        if (currentBalance > 25){
            accountStatus = true;
        }
        else {
            accountStatus = false;
        }
        // main code starts
//        if (accountStatus){
//            super.makeDeposit(deposit);
//        }
//        else {
//            if ((accountStatus = false) && (currentBalance > 25.0)){  //$25 above deposit can make the account active again
//                super.makeDeposit(deposit);
//                accountStatus = true;
//            }
//        }
    }

    public void monthlyReport(){
        // condition when the number of withdrawals exceed 4
        if (numberOfWithdrawals > 4){
            double extraCharge = 1.0;
            currentBalance = extraCharge * numberOfWithdrawals;
            super.monthlyReport(currentBalance);
        }
        else
        {
            super.monthlyReport(currentBalance);
        }
    }


}
