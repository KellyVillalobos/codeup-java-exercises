import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userChoice;
        do {
            System.out.println("Enter your grade here: ");
            short gradeNumber = input.nextShort();

            String letterGrade;
            if(gradeNumber >=90 && gradeNumber <=100){
                letterGrade = "A";
            } else if(gradeNumber >= 80) {
                letterGrade = "B";
            } else if(gradeNumber >= 70) {
                letterGrade= "C";
            }else if(gradeNumber >= 60) {
                letterGrade = "D";
            }else if(gradeNumber >=0 && gradeNumber <=59) {
                letterGrade = "F";
            } else {
                letterGrade ="This is not a valid grade. Please try again.";
            }

System.out.println("The calculated grade for " + gradeNumber + " is a grade of: " + letterGrade);
            System.out.println("Do you want to calculate another grade?");
            userChoice =input.next();
        }while(userChoice.equals("y") || userChoice.equalsIgnoreCase("yes"));





    }
}




