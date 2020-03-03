import java.text.ParseException;

public class PetDriver {
    public static void main(String[] args) throws ParseException {
        Dog dog = new Dog("Rambo", "Tom", "Brown", "Big");
        dog.setBoardStart(01,01,2000);
        dog.setBoardEnd(12,31,2019);
        dog.setSex(2);
        System.out.println(dog.toString());
        System.out.println(dog.boarding(01,01,2020));
        System.out.println("*---------------------------------------------------------------*");
        Cat cat = new Cat("Kitty", "Bob", "White", "Short");
        cat.setBoardStart(01,01,2000);
        cat.setBoardEnd(12,31,2019);
        cat.setSex(1);
        System.out.println(cat.toString());
        System.out.println(cat.boarding(01,01,2010));

    }
}
