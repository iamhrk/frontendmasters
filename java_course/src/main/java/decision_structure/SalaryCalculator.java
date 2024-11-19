package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("What's your sales number?");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();
        scanner.close();
        if(sales > quota){
            salary = salary + bonus;
        }
        System.out.println("Your salary is " + salary);
    }
}
