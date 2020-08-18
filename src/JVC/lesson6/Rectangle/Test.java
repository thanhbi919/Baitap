package JVC.lesson6.Rectangle;

import java.util.Scanner;

public class Test {
    public void Test() {
        System.out.print("Enter the width: ");
        Scanner scanner = new Scanner(System.in);
        float width = scanner.nextFloat();
        System.out.print("Enter the height: ");
        float height = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Premeter: " + rectangle.getPermeter());
        System.out.println("Area: " + rectangle.getArea());
        if (rectangle.isSquare()==true) System.out.println("This is a Square.");
        else System.out.println("This is not a Square.");
    }
}
