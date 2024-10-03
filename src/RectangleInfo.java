import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        double inputLength = 0;
        double inputWidth = 0;
        boolean check = false;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;

        //checks for valid input for the length
        do {
            System.out.println("What is the rectangle's length?");
            if (scan.hasNextDouble()) {
                inputLength = scan.nextDouble();
                if (inputLength > 0) {
                    check = true; //breaks the loop
                } else {
                    System.out.println("Your value cannot be negative or a zero, please try again.");
                }
            } else {
                System.out.println("You have entered the wrong data type, please try again.");
            }
            scan.nextLine();
        } while (!check);

        //resets the check value for the width to be checked
        check = false;
        //checks for valid input for the width
        do {
            System.out.println("What is the rectangle's width?");
            if (scan.hasNextDouble()) {
                inputWidth = scan.nextDouble();
                if (inputWidth > 0) {
                    check = true; //breaks the loop
                } else {
                    System.out.println("Your value cannot be negative or a zero, please try again.");
                }
            } else {
                System.out.println("You have entered the wrong data type, please try again.");
            }
            scan.nextLine();
        } while (!check);

        //calculations and output
        if (check) {
            area = inputLength * inputWidth;
            perimeter = 2 * inputLength + 2 * inputWidth;
            diagonal = Math.sqrt(Math.pow(inputLength, 2) + Math.pow(inputWidth, 2));
            System.out.printf("%-10s %6.2f", "length:", inputLength);
            System.out.printf("\n%-10s %6.2f", "Width:", inputWidth);
            System.out.printf("\n%-10s %6.2f", "Area:", area);
            System.out.printf("\n%-10s %6.2f", "Perimeter:", perimeter);
            System.out.printf("\n%-10s %6.2f", "diagonal:", diagonal);
        }
    }
}