package org.example;
import java.util.ArrayList;
public class CU
{
    private String nameCU;
    private ArrayList<Mark> marks;
    private int totalStudents;
    public CU(String nameCU, int totalStudents)
    {
        this.nameCU = nameCU;
        this.totalStudents = totalStudents;
        this.marks = new ArrayList<>();
    }
    public void insertMarkCU(int numStudent, double mark)
    {
        marks.add(new Mark(numStudent, mark));
    }
    public double searchStudent(int numStudent)
    {
        for (Mark m : marks)
        {
            if (m.getNumStudent() == numStudent)
            {
                return m.getMark();
            }
        }
        return -1;
    }
    public double averageUC()
    {
        if (marks.isEmpty())
        {
            return 0;
        }
        double sum = 0;
        for (Mark m : marks) {
            sum += m.getMark();
        }
        return marks.size() > 0 ? sum / marks.size() : 0;
    }
    public boolean isApproved(int numStudent)
    {
        double mark = searchStudent(numStudent);
        return mark >= 9.5;
    }
    public String getNameCU()
    {
        return nameCU;
    }
}