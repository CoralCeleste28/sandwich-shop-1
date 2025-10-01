import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

       // Declare Variables
        String customerName = "Coral";
        int age = 0;
        char regularSize = 1;
        char largeSize = 2;
        double regularPrice = 5.49;
        double largePrice = 8.49;
        double sandwichPrice = 0;
        Scanner scanner = new Scanner(System.in); // makes a scanner that reads the next line

        System.out.println("Enter 1 for Regular or 2 for Large");
        System.out.print("Size: ");
        int size = Integer.parseInt(scanner.nextLine()); // read the user input in the next line and turn it into an int

        if (size == 1) { // if user input is exactly 1
            sandwichPrice = regularPrice; // sandwich price is the regularPrice

        } else if (size == 2) {     // if user input is exactly 2
            sandwichPrice = largePrice; // then sandwich price is now the largePrice
        }   else { // if user input is anything other than 1 or 2
            System.out.println("Invalid Input"); // if user
        }

        System.out.print("Enter Age: ");
        age = Integer.parseInt(scanner.nextLine());
        if (age >= 65) { // if age is larger than or equal to 65
            sandwichPrice = sandwichPrice * .80; // sandwich price receives a 20% discount
            System.out.printf("Price: $%.2f", sandwichPrice); // % is the placeholder   .2 is how many places  f is for float
        } else if (age <= 17) { // if age is less than or equal to 17
            sandwichPrice = sandwichPrice * .9; // sandwichPrice receives a 10% discount
            System.out.printf("Price: $%.2f", sandwichPrice); // % is the placeholder   .2 is how many places  f is for float
        } else if (age > 17 && age < 65) { // if age is more than 17 and less than 65
            System.out.println(sandwichPrice); // sandwichPrice stays the same
        } else { // is user input is anything else
            System.out.println("Invalid Input");
        }






    }
}
