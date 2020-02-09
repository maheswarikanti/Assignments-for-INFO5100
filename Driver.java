public class Driver {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));

        System.out.println("\nTotal number of Items : " + checkout.numberofItems());
        System.out.println("\nTotal cost : " + (long) Math.round(checkout.totalCost()));
        System.out.println("\nTotal Tax : " + (long) Math.round((checkout.totalTax())));
        System.out.println("\nGrand Total : " + (long) Math.round((checkout.totalTax() + checkout.totalCost())));
        checkout.printItem();
        checkout.clear();

        //Uncomment below code to execute second receipt
        /**checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));

        System.out.println("\nTotal number of Items : " + checkout.numberofItems());
        System.out.println("\nTotal cost : " + (long) Math.round(checkout.totalCost()));
        System.out.println("\nTotal Tax : " + (long) Math.round((checkout.totalTax())));
        System.out.println("\nGrand Total : " + (long) Math.round((checkout.totalTax() + checkout.totalCost())));
        checkout.printItem();

        checkout.clear();**/
    }
}