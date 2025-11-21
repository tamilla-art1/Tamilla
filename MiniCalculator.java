import java.util.Scanner;

public class MiniCalculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci rəqəmi daxil et: ");
        double a = scanner.nextDouble();
        System.out.print("Ikinci rəqəmi daxil et: ");
        double b = scanner.nextDouble();
        calculate (a,b);

        }
    public static void calculate (double a, double b) {
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("b-a=" + (b - a));
        System.out.println("a:b=" + (a/b));
        System.out.println("b:a=" + (b/a));
        System.out.println("b*a=" + (b*a));
    }
}