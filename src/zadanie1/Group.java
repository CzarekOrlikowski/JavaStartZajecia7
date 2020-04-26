package zadanie1;

import java.util.Arrays;


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

    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", trainer=" + trainer +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
