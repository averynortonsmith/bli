import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Fill in values for these variables
        System.out.println("current year: ");
        int currentYear = reader.nextInt();

        System.out.println("birth year: ");
        int birthYear = reader.nextInt();

        System.out.println("dog birth year: ");
        int dogBirthYear = reader.nextInt();

        // Write a formula to calculate your age from the currentYear and
        // your birthYear variables
        int age = currentYear - birthYear;

        // Write a formula to calculate your dog's age from the currentYear
        // and dogBirthYear variables
        int dogAge = currentYear - dogBirthYear;

        // Calculate the age of your dog in dogYears (7 times your dog's age
        // in human years)
        int dogYearsAge = 7 * dogAge;

        // Print out your age, your dog's age, and your dog's age in dog
        // years. Make sure you print out text too so that the user knows what
        // is being printed out.

        System.out.println("my age: " + age);
        System.out.println("dog age: " + dogAge);
        System.out.println("dog age (dog year): " + dogYearsAge);
   }
}
