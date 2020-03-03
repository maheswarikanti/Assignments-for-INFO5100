import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet implements Boardable{
    private String hairLength;
    String pattern = "MM-dd-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Date StartDate;
    Date EndDate;



    public Cat(String PetName, String OwnerName, String Color, String HairLength) {
        super(PetName, OwnerName, Color);
        hairLength = HairLength;
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

    public String getHairLength()
    {
        return hairLength;
    }

    public String toString()
    {
        return getPetName() + "  owned by " + getOwnerName() + "\nColor : " + getColor() + "\nSex : " + getSex() + "\nHair : " + getHairLength();
    }
}
