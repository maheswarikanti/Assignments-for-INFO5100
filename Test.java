public class Test{
    public static void main(String[] args){
        boolean canRegister = true;
        int i =0;
        Student[] students = new Student[11];
        students[0] = new Student("Name1", 1001);
        students[1] = new Student("Name2", 1002);
        students[2] = new Student("Name3", 1003);
        students[3] = new Student("Name4", 1004);
        students[4] = new Student("Name5", 1005);
        students[5] = new Student("Name6", 1006);
        students[6] = new Student("Name7", 1007);
        students[7] = new Student("Name8", 1008);
        students[8] = new Student("Name9", 1009);
        students[9] = new Student("Name410", 1010);
        students[10] = new Student("Name11", 1011);
        Course course = new Course();
        while(canRegister == true)
        {
            canRegister = course.registerStudent(students[i]);

            if(canRegister == true)
            {
                System.out.println("Student Enrolled to Course: " + course.getTitle() + " Name:" +  students[i].getName());
                i++;
            }
            else
            {
                System.out.println("Student unable to enroll as course is full Course: " + course.getTitle() + " Name:" +  students[i].getName());
            }
        }
    }
}