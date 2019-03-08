public class bankingService_main {

    public static void main (String [] args){



        SavingsAccount s = new SavingsAccount(3500);
        s.makeDeposit(100);

        s.makeWithdrawal(500);


        CheckingAccount c = new CheckingAccount(0);
        c.makeDeposit(200);
        c.makeWithdrawal(500);



        int a = 0;



    }

}
