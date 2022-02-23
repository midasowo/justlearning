package eu.emidas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name);

        if (!name.isEmpty() && !name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba")) {
            System.out.println("Jesteś mężczyzną");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("Jesteś kobietą");
        } else {
            System.out.println("Podaj imię, imię nie może być puste.");
        }

    }
}
