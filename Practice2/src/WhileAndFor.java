public class WhileAndFor {

    public static void main(String[] args) {

        forUsingWhile();

        whileUsingFor();
    }

    public static void forUsingWhile() {

        System.out.println("\nFor using while \nFor cycle: ");

        for(int i = 0; i <= 10; i++) {
            System.out.println("For number: "+i);
        }

        System.out.println("While cycle: ");

        int counter=0;
        while(counter<=10){
            System.out.println("While number: "+(counter++));
        }

    }
    public static void whileUsingFor() {
        System.out.println("\nWhile using for \nWhile cycle: ");

        int number=1;
        while(number<=10){
            System.out.println("While number: "+number);
            number+=2;
        }

        System.out.println("For cycle: ");

        for(int i = 1; i <= 10; i+=2) {
            System.out.println("For number: "+i);
        }
    }
}