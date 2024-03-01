import java.util.Scanner;

public class Main {
    public static void displayFavoriteColor(String color) {
        System.out.println("Your favorite color is: " + color);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine();
        displayFavoriteColor(color);
        scanner.close();
    }
}
