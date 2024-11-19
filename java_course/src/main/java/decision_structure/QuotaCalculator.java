package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("What's your sales number?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congratulations, you made at least 10 sales!");
        } else {
            int salesShort = quota - sales;
            System.out.println("Sorry, you're short by " + salesShort + " number of sales");
        }

    }
}
