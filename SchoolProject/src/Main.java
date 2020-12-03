
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {


//The Main menu ---------------------
            Scanner answer = new Scanner(System.in);
            System.out.println("---------- \n What would you like to do? \n a: Add a student to list \n b: Remove a student from list \n c: Show all students " +
                    "\n d: Add a teacher to list \n e: Remove a teacher from list \n f: Show all teachers \n u: Run Demo \n q: Quit \n---------------------");
            String Answer = answer.nextLine();
//----------------------------------------------------------------


// I'm a bit confused as to why we need a courses/subjects ArrayList but I made one and populated it...---------------------------
            School.courses.add("Math");
            School.courses.add("English");
            School.courses.add("Science");
            School.courses.add("History");
            School.courses.add("Business");
            School.courses.add("Economics");
            School.courses.add("French");
            School.courses.add("Computers");
            //--------------------------------------------------------------------------

            //Processing the answer gotten from the main menu
            switch (Answer) {
                case "a":
                    School.addStudent();
                    break;
                case "b": try {
                    School.delStudent(0);

                    break;
                } catch(Exception ignored){}
                case "c": {
                    School.getstudentinfo(0);
                    break;
                }
                case "d": {
                    School.addTeacher();
                    break;
                }
                case "e": {
                    School.delTeacher(0);
                    break;
                }
                case "f": {
                    School.getTeachers(0);
                    break;
                }
                case "q": {
                    System.exit(1337);
                    break;
                }
                default:{
                    System.out.println("Invalid Selection, Please try again.");
                    break;
                }
                // My beautiful demo, following the instructions from the assignment. I actually spent a bunch of time making it interactive and customizable until realising
                // how simple the assignment really was.
                    //A real big brain move.
                case "u":{
                    System.out.println("LISTING 10 STUDENTS AND 3 TEACHERS");
                    School.addStudentManual("Jacob", "Burna", 5);
                    School.addStudentManual("Daryl", "Smith", 6);
                    School.addStudentManual("Anthony", "Davis", 3);
                    School.addStudentManual("Marquis", "De'quavis", 11);
                    School.addStudentManual("John", "Cena", 10);
                    School.addStudentManual("Jotaro", "Kujo", 6);
                    School.addStudentManual("Brendan", "Trevino", 9);
                    School.addStudentManual("Justin", "Fan", 8);
                    School.addStudentManual("Michael", "Hunter", 4);
                    School.addStudentManual("Kristy", "Olson", 8);
                    School.addStudentManual("Karen", "IWantToSpeakToYourManager", 12);
                    School.addTeacherManual("Johnathan", "Cena", "English");
                    School.addTeacherManual("Mary", "Teeth", "Math");
                    School.addTeacherManual("Logan", "Cupla", "Social Studies");
                    School.getstudentinfo(0);
                    School.getTeachers(0);
                    System.out.println("10 STUDENTS AND 3 TEACHERS LISTED ABOVE");
                    School.delStudentManual(3);
                    School.delStudentManual(4);
                    School.delTeacherManual(2);
                    System.out.println("DELETED 2 STUDENTS AND 1 TEACHER JUST NOW");
                    System.out.println("LISTING 8 STUDENTS AND 2 TEACHERS");
                    School.getstudentinfo(0);
                    School.getTeachers(0);
                    System.out.println("FINAL LIST ABOVE");
                                    }
            }
//This couldve been optimized, yes. But this was all I could do after spending most of my time on the interactive part of this. Huge oversight.

        }

    }


}