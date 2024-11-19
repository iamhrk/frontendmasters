package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean isContinue = false;
        String continueOrNot;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter first number");
            int number1 = scanner.nextInt();
            System.out.println("Enter second number");
            int number2 = scanner.nextInt();
            int sum = number1 + number2;
            System.out.println("Your sum is " + sum);
            System.out.println("Do you want to continue Y/N");
            boolean isInputSet = false;
            do {
                continueOrNot = scanner.next().toLowerCase();
                if(continueOrNot.equals("y") || continueOrNot.equals("yes")){
                    isContinue = true;
                    isInputSet = true;
                }else if (continueOrNot.equals("n") || continueOrNot.equals("no")){
                    isContinue = false;
                    isInputSet = true;
                } else {
                    System.out.println("Enter a valid response, Do you want to continue Y/N?");
                }

            }while(!isInputSet);
        }while(isContinue);
        scanner.close();
    }
}
