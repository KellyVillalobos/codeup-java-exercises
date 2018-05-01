public class ControlFlowExercises {
    public static void main(String[] args) {
       long i = 2L;

        do{
            System.out.println(i);
            i = i * i;

        }while(i < Math.pow(10,6));
    }
}
