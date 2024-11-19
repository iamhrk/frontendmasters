package loops;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;
        for(int i=1; i<=quantity; i++){
            System.out.println("Enter the cost of item number" + (i));
            total = total + scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Your total is " + total);
    }
}
