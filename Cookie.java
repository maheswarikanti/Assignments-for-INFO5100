public class Cookie extends DessertItem {
    double perdozen;
    Integer count;

    public Cookie(String name, Integer count, double perdozen) {
        this.count = count;
        this.perdozen = perdozen;
        this.name = name;
    }

    public double getCost() {
        return (count*perdozen)/12;
    }
}