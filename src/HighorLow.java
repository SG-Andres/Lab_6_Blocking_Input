import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int randomNumber = (int)(Math.random() * 10);
    int guess = 0;


    do {
        System.out.println("Guess the number between 1 and 10");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }

        guess = scanner.nextInt();
        if (guess < 1 || guess > 10) {
            System.out.println("Invalid input. Please enter a number between 1 and 10");
            scanner.next();
        } else if (randomNumber == guess) {
            System.out.println("Right on the Money");
        } else if (randomNumber > guess) {
            System.out.println("Guess is too low");
        } else if (randomNumber < guess) {
            System.out.println("Guess is too high");
        }

        } while (guess != randomNumber);
    }