import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class School {

    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<String> courses = new ArrayList<String>();


//The interactive add student function. The console asks you questions and your inputs are taken and put into a new student which is added onto the arraylist.
        public static void addStudent () {


            ArrayList<String> studentinfo = new ArrayList<>();
            Scanner firstname = new Scanner(System.in);
            System.out.println("Starting student creation... \n Begin by typing their first name.");
            String FirstName = firstname.nextLine();
            studentinfo.add(FirstName);
            Scanner lastname = new Scanner(System.in);
            System.out.println("Now type in their last name");
            String LastName = lastname.nextLine();
            studentinfo.add(LastName);
            Scanner grade = new Scanner(System.in);
            System.out.println("Finally, please type in their grade");
            int Ggrade = parseInt(grade.nextLine());
            studentinfo.add(String.valueOf(Ggrade));
            System.out.println("Your student has been created!");
            School.students.add(new Student(studentinfo.get(0), studentinfo.get(1), parseInt(studentinfo.get(2))));
        }
        //The much more simple MANUAL add student, where you type in the name and grade without the console asking you questions. I could've just did this but I was being dumb
    //and didn't read the bottom part of the assignment.
    public static void addStudentManual (String firstname, String lastname, int Grade) {


        School.students.add(new Student(firstname, lastname, Grade));
    }

    //The loop to list all the students in the format shown in the assignment.
        public static void getstudentinfo(int i){
            for (i = 0; i < students.size(); i++) {
                System.out.println("--------- \n" + students.get(i).getStudentInfo(students.get(i)) + "\n---------");
            }
        }
        //-------

    //The delete student function, this one is also an interactive version
        public static void delStudent(int i){
            Scanner todel = new Scanner(System.in);
            for (i = 0; i < students.size(); i++) {
                System.out.println(" -------------- \n Student at position " + i + ": \n " + students.get(i).getStudentInfo(students.get(i)) + " \n -------------");
            }
            System.out.print("\n Enter the position number of the student you want to remove. \n");
            int toddel = parseInt(todel.nextLine());
            System.out.println("Student " + students.get(toddel).getFirstName() + " Removed!");
            students.remove(toddel);
        }

        //The very simple MANUAL delete student function.
    public static void delStudentManual(int i){
        students.remove(i);
    }
    // The interactive add teacher function. Asks questions and the user answers them. Works the same way as the student one.
    public static void addTeacher(){
        ArrayList<String> teacherinfo = new ArrayList<>();
        Scanner firstname = new Scanner(System.in);
        System.out.println("Starting teacher creation... \n Begin by typing their first name.");
        String FirstName = firstname.nextLine();
        teacherinfo.add(FirstName);
        Scanner lastname = new Scanner(System.in);
        System.out.println("Now type in their last name");
        String LastName = lastname.nextLine();
        teacherinfo.add(LastName);
        Scanner subject = new Scanner(System.in);
        System.out.println("Finally, please type in their subject");
        String Ssubject = subject.nextLine();
        teacherinfo.add(String.valueOf(Ssubject));
        System.out.println("Your student has been created!");
        School.teachers.add(new Teacher(teacherinfo.get(0), teacherinfo.get(1), teacherinfo.get(2)));
    }
    // Manual add teacher, the same as add student, just different variables
    public static void addTeacherManual(String firstname, String lastname, String subject){

        School.teachers.add(new Teacher(firstname, lastname, subject));

    }
    // Interactive delete teacher, the same as student, just different variables
    public static void delTeacher(int i){
        Scanner todel = new Scanner(System.in);
        for (i = 0; i < teachers.size(); i++) {
            System.out.println(" -------------- \n Teacher at position " + i + ": \n " + teachers.get(i).getTeacherInfo(teachers.get(i)) + " \n -------------");
        }
        System.out.print("\n Enter the position number of the teacher you want to remove. \n");
        int toddel = parseInt(todel.nextLine());
        System.out.println("Teacher " + teachers.get(toddel).getFirstName() + " Removed!");
        teachers.remove(toddel);
    }
    //MANUAL delete teacher, much more simple, same as manual student delete, just with different variables
    public static void delTeacherManual(int i){
        teachers.remove(i);
    }
    //Same command as getstudentinfo but with different name and variables
    public static void getTeachers(int i){
        for (i = 0; i < teachers.size(); i++) {
            System.out.println("--------- \n" + teachers.get(i).getTeacherInfo(teachers.get(i)) + "\n---------");
        }
    }
    }

// WHY DID I MAKE MYSELF DO SO MUCH MORE THAN NECESSARY AAAAAAAAAAAAAAAAAAAAAA