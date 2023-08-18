package practic.nested.classes;

import java.util.Calendar;

// Этот класс только для тестирования
public class Tester {
    public static void main(String[] args) {
        String[] names = {"John", "Maria", "Jeorge"};
        Calendar[] days = new Calendar[2];
        days[0] = Calendar.getInstance();
        days[1] = Calendar.getInstance();
        days[0].set(2023, 1, 10);
        days[1].set(2023, 1, 17);
        Group grp = new Group("CPR101", names, days);
        grp.marks[0][0] = grp.marks[0][1] = 90.0;
        grp.marks[1][0] = grp.marks[1][1] = 85.0;
        grp.marks[2][0] = grp.marks[2][1] = 80.0;
        Group.Stats sts = grp.new Stats();
        grp.printReport();
        System.out.println("Average mark: " + sts.avgMark());
    }
}
