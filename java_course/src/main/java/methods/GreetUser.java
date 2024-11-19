package methods;

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        String userName = getUserName();
        greetUser(userName);
    }
    public static String getUserName(){
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }

    public static void greetUser(String userName){
        System.out.println("Hi there " + userName);
    }
}
