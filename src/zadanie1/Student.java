package zadanie1;

import java.util.Scanner;

public class Student extends Person {
        String course;

    public Student(String course, Person person) {
        this.course = course;
        this.newPersonBuilder();
    }

    public static Student newStudentBuilder() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wybierz dostępny kurs ("
                + Group.NAME_ENGLISH + ", "
                + Group.NAME_FRENCH + ", "
                + Group.NAME_GERMAN + "): ");
        String course = scan.nextLine();
        return new Student(course, Person.newPersonBuilder());

    }

    public String toString() {
        return "Students{" +
                "course='" + course + '\'' +
                '}';
    }
}
