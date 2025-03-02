import java.util.Scanner;

public class Stairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the number of stairs");
            int numbOfStairs = sc.nextInt();

            System.out.println("Number of ways: "+countNumberOfWays(numbOfStairs));
        }

    }

    private static int countNumberOfWays(int numbOfStairs) {
        if(numbOfStairs <0) return 0;
        else if(numbOfStairs < 2) return 1;
        else return countNumberOfWays(numbOfStairs - 1)+countNumberOfWays(numbOfStairs - 2);
    }
}
