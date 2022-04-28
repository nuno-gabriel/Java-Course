package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the season of the year");
        String season = scanner.next();

        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        System.out.println("Enter the adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " of cups of coffees a day.");
    }
}
