import java.util.ArrayList;

public class Mreview {

    private String title;
    private ArrayList<Integer> ratings;

    public Mreview(){
        title = "";
        ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl){
        title = ttl;
        ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl, int firstRating){
        title = ttl;
        ratings = new ArrayList<Integer>(firstRating);
    }

    public String getTitle()
    {
        return title;
    }

    public void addRating(int r)
    {
        ratings.add(r);
    }

    public double aveRating()
    {
        int sum = 0;
        for (int i=0; i< ratings.size(); i++) {
            sum += ratings.get(i);
        }
        return sum / ratings.size();
    }

    public int numRatings()
    {
        return ratings.size();
    }

    public String toString()
    {
        return getTitle() +" , average "+ aveRating() +" out of "+ numRatings() +" ratings";
    }

    /*public boolean equals(Object obj)
    {
        if(obj.title = getTitle())
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/
}