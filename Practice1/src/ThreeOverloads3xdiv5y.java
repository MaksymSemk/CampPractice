public class ThreeOverloads3xdiv5y {

    public static double calcExpr(int x, int y){
        if(y==0) return 0;
        return (double) (3 * x) /5*y;
    }

    public static double calcExpr(double x, double y){
        if(y==0) return 0;
        return 3*x/5*y;
    }
    public static double calcExpr(byte x, byte y){
        if(y==0) return 0;
        return (double) (3 * x) /5*y;
    }

}
