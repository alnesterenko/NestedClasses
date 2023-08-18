package practic.nested.classes;

import java.util.Calendar;

public class Group {
    public String GroupId;
    public Calendar[] sessions;
    public String[] students;
    public double[][] marks;

    public Group(String id, String[] names, Calendar[] dates) {
        GroupId = id;
        int rows = names.length;
        int cols = dates.length;
        students = new String[rows];
        for (int r = 0; r < rows; r++) {
            students[r] = names[r];
        }
        sessions = new Calendar[cols];
        for (int c = 0; c < cols; c++) {
            sessions[c] = dates[c];
        }
        marks = new double[rows][cols];
    }

    public void printReport() {
        System.out.print("          "); // 10 chars for a names
        for (int c = 0; c < sessions.length; c++) { // print dates
            System.out.printf("%02d/%02d/%4d ",
                    sessions[c].get(Calendar.DAY_OF_MONTH),
                    sessions[c].get(Calendar.MONTH),
                    sessions[c].get(Calendar.YEAR));
        }
        System.out.println();
        // Print names and marks
        for (int r = 0; r < students.length; r++) {
            System.out.printf("%-10s", students[r]);
            for (int c = 0; c < sessions.length; c++) {
                System.out.printf("%10.2f", marks[r][c]);
            }
            System.out.println();
        }
    }
}