import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter values format: byte, int, double \n" +
                    "Enter \"exit\" to end program");

            String valuesFormat = sc.nextLine();

            switch (valuesFormat) {
                case "byte":
                    readAndCalcExpr( "byte", sc);
                    break;
                case "int":
                    readAndCalcExpr( "int", sc);
                    break;
                case "double":
                    readAndCalcExpr( "double",sc);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid format \n");
            }
        }
    }

    private static void readAndCalcExpr(String valuesFormat, Scanner sc) {
        System.out.println("Enter x : ");
        String xString= sc.nextLine();

        System.out.println("Enter y : ");
        String yString= sc.nextLine();

        System.out.print("Result: ");
        switch (valuesFormat) {
            case "byte":
               byte xByte= Byte.parseByte(xString);
               byte yByte= Byte.parseByte(yString);

               System.out.println(ThreeOverloads3xdiv5y.calcExpr(xByte,yByte));
                break;
            case "int":
                int xInt= Byte.parseByte(xString);
                int yInt= Byte.parseByte(yString);

                System.out.println(ThreeOverloads3xdiv5y.calcExpr(xInt,yInt));
                break;
            case "double":
                double xDouble= Byte.parseByte(xString);
                double yDouble= Byte.parseByte(yString);

                System.out.println(ThreeOverloads3xdiv5y.calcExpr(xDouble,yDouble));
                break;
        }

    }
}