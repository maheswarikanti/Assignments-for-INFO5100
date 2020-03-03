public class Account {

    protected String FirstName;
    protected String LastName;
    protected double CurBalance;

    public Account(String fname, String lname, double curbalance) {
        CurBalance = curbalance;
        FirstName = fname;
        LastName = lname;
    }

    public String getAcctType() {
        return "Account";
    }
    public double DebitTransaction(double debitAmount) {
        CurBalance = CurBalance - debitAmount;
        return CurBalance;
    }

    public double CreditTransaction(double creditAmount){
        CurBalance = creditAmount + CurBalance;
        return CurBalance;
    }

    public String toString()
    {
        return "Account name : " + FirstName + LastName + "\nAccount Type : " + getAcctType()+ "\nBalance : " +CurBalance;
    }

}
