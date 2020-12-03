import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Teacher {
//Initialized the strings
    private String firstName;
    private String lastName;
    private String subject;


// the constructor :O
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;

    }
    // some generated getters below and the get teacher info function, which puts all the data together neatly
    public String getTeacherInfo(Teacher teacher) {
        return "Name: "+ teacher.getFirstName() + " " + teacher.getLastName() + " \n Subject: " + teacher.getSubject();
    }

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }


    public String getSubject() {
        return subject;
    }


}
