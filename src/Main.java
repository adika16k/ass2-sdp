import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = new SimpleCoffee();

        System.out.println("Cost of Simple Coffee: 5$");


        System.out.println("Cost of Coffee with Milk: 7$");


        System.out.println("Cost of Coffee with Sugar: 10$");


        System.out.println("Cost of Coffee with Vanilla: 13$");

        System.out.println("What you want to add to your coffee: (milk/sugar/vanilla/none)?");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("milk")) {
            coffee = new MilkDecorator(coffee);
            System.out.println("That'll be " + coffee.cost() + "$ " + " for today.");
        } else if (choice.equals("sugar")) {
            coffee = new SugarDecorator(coffee);
            System.out.println("That'll be " + coffee.cost() + "$ " + " for today.");
        } else if (choice.equals("vanilla")) {
            coffee = new VanillaDecorator(coffee);
            System.out.println("That'll be " + coffee.cost() + "$ " + " for today.");
        } else {
            System.out.println("That'll be 5$ for today.");
        }

        System.out.println("Enjoy your coffee!");

        scanner.close();


    }
}