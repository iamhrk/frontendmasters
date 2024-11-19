package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        switch(grade){
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Good Job";
                break;
            case "C":
                message = "Needs improvement";
                break;
            case "D":
                message = "Poor performance";
                break;
            case "F":
                message = "You're not eligible to continue";
                break;
            default:
                System.out.println("Enter a valid grade");
                message = "";
                break;
        }

        System.out.println(message);

    }
}
