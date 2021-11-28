package lesson27.homeworkTask1;

public class GetSquareInfo {
    public void testSqure(double a, double b, IShape iShape){
        double sqr= iShape.getSquare(a,b);
        System.out.println("Square is " +sqr);
    }
}
