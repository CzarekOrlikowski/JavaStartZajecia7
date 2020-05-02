package zadanie2;

import java.util.Scanner;

public class Grade {
    private String groupName;
    private Student student;
    private Double grade;

    public Grade(String groupName, Student student, Double grade) {
        this.groupName = groupName;
        this.student = student;
        this.grade = grade;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public static Grade[] GradeTableBuilder(Group group) {
        Scanner scan = new Scanner(System.in);
        Grade[] grades = new Grade[group.getStudent().length];
        for (int i = 0; i <= group.getStudent().length - 1; i++) {
            System.out.print("Ocena dla " +
                    group.getStudent()[i].getFirstName() + " " +
                    group.getStudent()[i].getLastName() + ": ");
            Double grade = scan.nextDouble();
            grades[i] = new Grade(group.getGroupName(), group.getStudent()[i], grade);
        }
        return grades;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "groupName='" + groupName + '\'' +
                ", student=" + student +
                ", grade=" + grade +
                '}';
    }
}
