public class Checkout {
    Integer totalItems = 0;
    double  cost, tax;
    DessertItem[] dItems = new DessertItem[20];


    public Checkout(){}

    public int numberofItems() {
        return totalItems;
    }

    public void enterItem(DessertItem item) {
        dItems[totalItems] = item;
        cost = cost + item.getCost();
        totalItems++;
    }

    public void clear() {
        dItems = new DessertItem[20];
        totalItems = 0;
    }

    public double totalCost() {
        return cost;
    }

    public double totalTax() {
        return (DessertShoppe.taxRate*cost)/ 100;
    }

    public void printItem() {
        System.out.println("\n        " + DessertShoppe.shopName);
        System.out.println("   " + "-------------------------------");
        for(int i=0; i < totalItems; i++)
        {
            System.out.println(dItems[i].getName() + "            " + (double) Math.round((dItems[i].getCost()/100) * 100) / 100);
        }
        System.out.println("\nTax  @"+DessertShoppe.taxRate+"              " + (double) Math.round((totalTax()/100) * 100) / 100);
        System.out.println("Total Cost            " + (double) Math.round((totalCost()/100) * 100) / 100);
    }

}