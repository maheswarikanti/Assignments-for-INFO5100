public class IceCream extends DessertItem {
    protected String iname;
    double value;
    public IceCream(){}

    public IceCream(String iname, double value) {
        this.value = value;
        this.name = iname;
    }

    public double getCost() {
        return value;
    }
}