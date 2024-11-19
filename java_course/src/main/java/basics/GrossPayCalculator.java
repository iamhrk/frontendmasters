package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What's your hourly rate?");
        double hourlyRate = scanner.nextDouble();
        scanner.close();
        double grossPay = hours * hourlyRate;
        System.out.println("Gross pay is " + grossPay);
    }
}
