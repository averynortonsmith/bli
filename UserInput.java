import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = reader.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("Enter a number: ");
        double n = reader.nextDouble();
        System.out.println("1 / " + n + " = " + 1 / n);
    }
}
