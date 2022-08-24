import java.util.Scanner;
public class ProgramStructure {
    public static final double PI = 3.14;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах");
        int radius = scanner.nextInt();

        double circleLength = calculaterCircleLength(radius);
        double circleArea = calculateCircleArea(radius);
        System.out.println("Площадь круга: " + circleArea+  " см.кв.");
        System.out.println("Длина окружности: " + circleLength +  " см.");


    }


    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculaterCircleLength(int radius) {
        return 2 * PI * radius;
    }








}
