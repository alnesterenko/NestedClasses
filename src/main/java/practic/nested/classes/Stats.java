package practic.nested.classes;

// Класс для подсчёта статистики
public class Stats {
    private Group aGroup;

    public Stats(Group grp) {
        aGroup = grp;
    }

    public double avgMark() {
        double result = 0.0;
        for (int r = 0; r < aGroup.students.length; r++) {
            for (int c = 0; c < aGroup.sessions.length; c++) {
                result += aGroup.marks[r][c];
            }
        }
        return result / (aGroup.students.length * aGroup.sessions.length);
    }

    public String bestStudent() {
        // analysis
        return "";
    }

    public String[] studentsAtRisk() {
        // analysis
        return null;
    }
}
