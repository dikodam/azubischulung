package de.dikodam.advancedprogramming.javabasics;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alter = scanner.nextLine();

        if (Integer.parseInt(alter) > 18) {
            System.out.println("volljährig");
        } else {
            System.out.println("minderjährig");
        }
    }
}
