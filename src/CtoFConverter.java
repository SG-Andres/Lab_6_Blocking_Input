import java.util.Scanner;
public class CtoFConverter {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            do {
                System.out.print("Enter temperature in Celsius: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();}

                        double c = scanner.nextDouble();
                        double f = (c * 9/5) + 32;



                System.out.println("Equivalent temperature in Fahrenheit: " + f);
            }while (scanner.hasNextDouble());




        }
    }