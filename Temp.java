import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a temp in C: ");
        int c = reader.nextInt();
        double f = c * 9.0 / 5.0 + 32.0;
        System.out.println(f);
    }
}
