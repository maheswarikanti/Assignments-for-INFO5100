import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable{
    private String size;
    String pattern = "MM-dd-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date StartDate;
    Date EndDate;

    public Dog(String PetName, String OwnerName, String Color, String Size) {
        super(PetName, OwnerName, Color);
        size = Size;
    }

    @Override
    public void setBoardStart(Integer month, Integer day, Integer year) throws ParseException {
        StartDate = simpleDateFormat.parse(month + "-" + day + "-" + year);
    }

    @Override
    public void setBoardEnd(Integer month, Integer day, Integer year) throws ParseException {
        EndDate = simpleDateFormat.parse(month + "-" + day + "-" + year);
    }

    @Override
    public boolean boarding(Integer month, Integer day, Integer year) throws ParseException {
        Date GivenDate = simpleDateFormat.parse(month + "-" + day + "-" + year);
        return GivenDate.after(StartDate) && GivenDate.before(EndDate);
    }

    public String getSize()
    {
        return size;
    }

    public String toString()
    {
        return getPetName() + "  owned by " + getOwnerName() + "\nColor : " + getColor() + "\nSex : " + getSex() + "\nHair : " + getSize();
    }
}
