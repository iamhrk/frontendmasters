package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours || hoursWorked < 0){
            System.out.println("Invalid input. Please enter again...");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Your salary is " + (hoursWorked * rate));
    }
}
