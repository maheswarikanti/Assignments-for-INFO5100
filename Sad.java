public class Sad extends Moody{
    protected String getMood() {
        return "Sad";
    }

    public void expressFeelings() {
        System.out.println("'wah''boo hoo''weep''sob''weep'");
    }

    public String toString() {
        return "Subject cries a lot";
    }
}
