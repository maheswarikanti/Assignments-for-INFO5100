import java.text.ParseException;

public interface Boardable {
    void setBoardStart(Integer month, Integer day, Integer year) throws ParseException;
    void setBoardEnd(Integer month, Integer day, Integer year) throws ParseException;
    boolean boarding(Integer month, Integer day, Integer year) throws ParseException;
}
