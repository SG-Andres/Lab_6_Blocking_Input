import java.util.Scanner;
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double W = 0;
    double H = 0;

    do {
        System.out.print("Enter the width of the rectangle: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        W = scanner.nextDouble();
        if (W <= 0) {
            System.out.println("There cannot be a negative width.");
        }
    } while (W <= 0);

    do {
        System.out.print("Enter the Height of the rectangle: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        H = scanner.nextDouble();
        if (H <= 0) {
            System.out.println("There cannot be a negative width.");
        }
    } while (H <= 0);

    double area = W * H;
    double perimeter = (2 * W) + (2 * H);
    double pythagoras = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

    System.out.println("The area of the rectangle is " + area);
   System.out.println("The perimeter of the rectangle is: " + perimeter);
   System.out.println("The diagonal length of the rectangle is: " + pythagoras);



}