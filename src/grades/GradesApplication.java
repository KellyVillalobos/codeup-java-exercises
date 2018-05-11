package grades;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import util.Input;

import static java.lang.String.valueOf;

public class GradesApplication {
    public static Input userInput = new Input();

    public static void main(String[] args) {


        Student student1 = new Student("Kelly");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(95);
        Student student2 = new Student("Lance");
        student2.addGrade(65);
        student2.addGrade(70);
        student2.addGrade(78);
        Student student3 = new Student("Nestor");
        student3.addGrade(89);
        student3.addGrade(80);
        student3.addGrade(85);
        Student student4 = new Student("Jen");
        student4.addGrade(65);
        student4.addGrade(70);
        student4.addGrade(79);


        HashMap<String, Student> students = new HashMap<>();
        students.put("GitWolf", student1);
        students.put("LanceCrowder", student2);
        students.put("chrishughallen", student3);
        students.put("DataQueen16", student4);


        System.out.println("");
        System.out.println("                                   Welcome!");

        System.out.println("                  ____ ____ ____ ____ ____ ____ ____ ____ ____ \n" +
                "                 ||g |||e |||t |||G |||r |||a |||d |||e |||s ||\n" +
                "                 ||__|||__|||__|||__|||__|||__|||__|||__|||__||\n" +
                "                 |/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|/__\\|\n");


        System.out.println("Here are the github usernames of our students: \n\n");



            handleChoice(students);


    }

    public static void handleChoice(HashMap<String, Student> students) {


        do {

            for (String student : students.keySet()) {
            System.out.printf(" |%2s|", student);
        }
            String choice = userInput.getString("\n\nWhat student would you like to see more information on? ");
            if (students.containsKey(choice)) {
                System.out.println("Current grade average: " + students.get(choice).getGradeAverage());
                System.out.println("Name: " + students.get(choice).getName() + " Github username: " + choice);

            } else
                System.out.println("Choice not found");
        } while (userInput.yesNo("Would you like to continue?"));
    }


}






