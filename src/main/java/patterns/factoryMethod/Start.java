package patterns.factoryMethod;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        PolygonFactory generator = new PolygonFactory();

        System.out.println("Welcome in polygons creator with \"Factory Method Design Pattern\"");
        System.out.print("please enter the number of sides, to generate Polygon: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Polygon myFirstShape = generator.getPolygon(number);

        System.out.println(myFirstShape.getType());

    }

}
