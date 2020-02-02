public class Student{
    private String name;
    private int id;

    public Student(String Name, int Id)
    {
        name = Name;
        id = Id;
    }

    // accessor methods - getters
    public String getName()
    {
        return name;
    }

    /** getName()  @return id */
    public int getId()
    {
        return id;
    }
}
