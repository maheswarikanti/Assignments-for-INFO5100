public class AccountDriver {
    public static void main(String[] args)
    {
        CheckingAccount ck = new CheckingAccount("Tom ", "Cruise", 1000);
        ck.CreditTransaction(600);
        ck.DebitTransaction(1200);
        System.out.println(ck.toString());
    }
}
