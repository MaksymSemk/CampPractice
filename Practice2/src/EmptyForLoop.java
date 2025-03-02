public class EmptyForLoop {
    public static void main(String[] args) {

        for(int i=5;i<5;i++){
            System.out.println(i);
        }
        //the result will not be displayed because
        // first i is checked to see if it satisfies the condition.
        // Second, the result is false and the program continues to execute the code that is written after the for loop

        System.out.println("Fin");
    }
}
