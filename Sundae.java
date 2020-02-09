public class Sundae extends IceCream {
    private double icost, tcost;
    protected String tname;

    public Sundae(String iname, double icost, String tname, double tcost) {
        this.tcost = tcost;
        this.icost = icost;
        this.name = iname + " " + tname;
        //this.tname = ;
    }

    public double getCost() {
        return icost + tcost;
    }
}