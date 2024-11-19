package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
     Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean isEligible = creditCheck(salary, creditScore);
        if(isEligible){
            System.out.println("You passed the credit check!");
        }
        else {
            System.out.println("You failed the credit check.");
        }
        Scanner myScanner = new InstantCreditCheck().scanner;
        myScanner.close();
    }

    public static double getSalary(){
        System.out.println("Enter your salary: ");
        Scanner myScanner = new InstantCreditCheck().scanner;
        return myScanner.nextDouble();

    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        Scanner myScanner = new InstantCreditCheck().scanner;
        return myScanner.nextInt();

    }

    public static boolean creditCheck(double salary, int creditScore){
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

}
