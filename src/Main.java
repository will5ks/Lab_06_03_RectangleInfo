import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarations
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double area;
        double diagonal;

        //User Prompt 1
        System.out.print("Enter the length of the rectangle: ");

        //User Input and Verification 1
        if (in.hasNextDouble()) {
            length = in.nextDouble();
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //User Prompt 2
        System.out.print("Enter the width of the rectangle: ");

        //User Input and Verification 2
        if (in.hasNextDouble()) {
            width = in.nextDouble();
        } else {
            System.out.println("Not a valid input, please re-run the program to try again.");
            System.exit(0);
        }

        //Calculations
        area = length * width;
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        //Output to User
        System.out.println("The area of the rectangle is " + area + " square units.");
        System.out.println("The length of the rectangle's diagonal is " + diagonal + " units.");
    }
}