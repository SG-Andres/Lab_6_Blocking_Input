import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double gallon = 0;
    double mpg = 0;
    double price = 0;


    do {
        System.out.print("Enter the number of gallons of gas in the tank: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        gallon = scanner.nextDouble();
        if (gallon <= 0) {
            System.out.println("The number of gallons must be greater than zero.");
        }
    } while (gallon <= 0);

    do {
        System.out.print("Enter fuel efficiency in miles per gallon: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input, please enter a valid number: ");
            scanner.next();
        }
        mpg = scanner.nextDouble();
        if (mpg <= 0) {
            System.out.print("Invalid input, please enter a positive number: ");
        }
    } while (mpg <= 0);

    do {
        System.out.print("Enter price per gallon: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input, please enter a valid number: ");
            scanner.next();
        }
        price = scanner.nextDouble();
        if (price <= 0) {
            System.out.print("Invalid input, please enter a positive number: ");
        }
    } while (price <= 0);

    double cost100 = (100/mpg) * price;

    System.out.println("The cost per 100 miles is $" + cost100);

    double range = gallon * mpg;

    System.out.println("With the current amoung of gas in the take the range is: " + range);

}
