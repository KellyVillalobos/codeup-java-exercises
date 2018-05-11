package grades;


import java.util.ArrayList;
import java.util.HashMap;


public class Student extends HashMap<String, Student> {
    public static void main(String[] args) {


    }

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);

    }

    public double getGradeAverage() {
       double sum =0;
        for (Integer grade : grades) {
            sum += grade / grades.size();
        }

        return sum;

    }
}
