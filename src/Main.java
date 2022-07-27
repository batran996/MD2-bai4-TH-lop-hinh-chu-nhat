import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your Rectangle \n" + rectangle.display());
        System.out.println("your perimeter of the rectangle: "+ rectangle.getperimeter());
        System.out.println("Area of the rectangle: "+ rectangle.getArea());
    }
}