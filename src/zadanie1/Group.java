package zadanie1;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;


public class Group {

    public static final String NAME_GERMAN = "niemiecki";
    public static final String NAME_ENGLISH = "angielski";
    public static final String NAME_FRENCH = "francuski";

    private String groupName;
    private Trainer trainer;
    private Student[] student;

    public Group(String groupName, Trainer trainer, Student[] student) {
        this.groupName = groupName;
        this.trainer = trainer;
        this.student = student;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }


    public static Group newGroupBuilder() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kreator grup zajęciowych");
        System.out.print("Rodzaj grupy ("
                + Group.NAME_ENGLISH + ", "
                + Group.NAME_FRENCH + ", "
                + Group.NAME_GERMAN + "): ");
        String groupName = scan.nextLine();

        System.out.println("Podaj dane trenera");
        Trainer trainer = Trainer.newTrainerBuilder();

        System.out.print("Podaj ilość uczestników: ");
        int studentsNumber = scan.nextInt();
        Student[] list = new Student[studentsNumber];
        for (int i = 0; i <= list.length - 1; i++) {
            list[i] = Student.newStudentBuilder();
        }
        return new Group(groupName, trainer, list);
    }

    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", trainer=" + trainer +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}


