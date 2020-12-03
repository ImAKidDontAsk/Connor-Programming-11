public class Student {

//Intellij told me these could be final so ok
    private final String firstName;
    private final String lastName;
    private final int grade;


//Student number getter and initialization
    private final int studentnum;
    public int getStudentnum() {
        return studentnum;
    }
// The constructor :O
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        //Basically Unique student number, it's a very low chance you get duplicates.
        this.studentnum = (int) (10 + Math.random() * 100000);
    }

// generated getters below, along with 2 forms.
    //The form without the student number
    public String getStudentInfo(Student student) {
        return "Name: "+ student.getFirstName() + " " + student.getLastName() + " \n Grade: " + student.getGrade();
    }
    //The form with the student number
    public String getMoreStudentInfo(Student student) {
        return " Name: "+ student.getFirstName() + " " + student.getLastName() + " \n Grade: " + student.getGrade() + "\n Student Number: " + student.getStudentnum();
    }
    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getGrade() {
        return grade;
    }}




