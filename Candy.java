public class Candy extends DessertItem {
    double value, weight;

    public Candy(String name, double value, double weight) {
        this.value = value;
        this.weight = weight;
        this.name = name;
    }

    public double getCost() {
        return (value * weight);
    }
}