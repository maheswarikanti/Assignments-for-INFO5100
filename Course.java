public class Course {
    private String title;
    private int numberOfStudents;

    public Course() {
        title = "Information_Science";
    }

    Student[] students = new Student[9];

    //Student student = new Student();

    public String getTitle() {
        return title;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumber() {
        return numberOfStudents;
    }

    public boolean isFull() {
        boolean value = false;
        Student[] courseStudent = getStudents();
        for (int i = 0; i < courseStudent.length ; i++)
        {
            if (courseStudent[i] == null)
            {
                value = false;
            }
            else
            {
                value = true;
            }
        }
        return value;
    }

        public boolean registerStudent(Student student){
            if (isFull() != true) {
                students[numberOfStudents + 1] = student;
                numberOfStudents++;
                return true;
            } else {
                return false;
            }
        }
    }

