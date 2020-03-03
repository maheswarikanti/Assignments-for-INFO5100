public class CheckingAccount extends Account{
    private double MinBalance =  500;
    private double Fine = 5;

    public CheckingAccount(String fname, String lname, double cb) {
        super(fname, lname, cb);
    }

    @Override
    public double DebitTransaction(double debitAmount){
        super.DebitTransaction(debitAmount);
        ChargeFee();
        return CurBalance;
    }

    @Override
    public double CreditTransaction(double creditAmount){
        super.CreditTransaction(creditAmount);
        ChargeFee();
        return CurBalance;
    }

    private void ChargeFee(){
        if (CurBalance < MinBalance)
            CurBalance = CurBalance - Fine;
    }
}
