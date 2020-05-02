package zadanie2;

import java.util.Arrays;

import static zadanie2.Grade.GradeTableBuilder;

public class TrainingCompany {
    public static void main(String[] args) {

        Group group1 = Group.newGroupBuilder();
        System.out.println(group1);

        Grade[] tableOfGrades = GradeTableBuilder(group1);
        System.out.println(tableOfGrades);
    }

}
