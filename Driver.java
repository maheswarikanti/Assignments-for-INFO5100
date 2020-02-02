public class Driver{
    public static void main(String[] args){
        Moody happyMood = new Happy();
        Moody SadMood = new Sad();
        Psychiatrist psyc = new Psychiatrist();

        psyc.examine(happyMood);
        psyc.observe(happyMood);

        psyc.examine(SadMood);
        psyc.observe(SadMood);
    }
}
