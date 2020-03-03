public class DriverMreview {
    public static  void main(String[] args) {
        Mreview review = new Mreview("Kill Bill");
        review.addRating(3);
        review.addRating(4);
        review.addRating(3);
        System.out.println(review.toString());
    }
}
