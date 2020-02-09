public class DessertShoppe {
    static String shopName = "M & M Dessert Shoppe";
    static double inDollar, taxRate = 9;

    public DessertShoppe() {
    }

    public static String centsTodollarAndCents(double amount) {
        inDollar = amount / 100;
        return inDollar+"";
    }
}