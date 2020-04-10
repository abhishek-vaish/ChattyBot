/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 09:14 PM
 */


package main;

import chatOperation.ChatOperation;
import pizza.PizzaClass;
import plainOlCheese.PlainOlCheese;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatOperation<PizzaClass> chatOperation = new ChatOperation<>();
        String pizzaName;
        int prize;
        String flavour;
        boolean offer;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to PizzaBot.com");
            System.out.println("1. Order Your Pizza.");
            System.out.println("2. Reorder Your Pizza.");
            System.out.println("3. Exit.");
            System.out.print("Please Enter your Choice : ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Hey Pizza lover!!! Please select Flaour");
                System.out.println("1. Plain Ol’ Cheese.\n" +
                        "2. Pepperoni.\n" +
                        "3. Double cheese pizza.\n");
                System.out.print("Please select your flavour category : ");
                int flavourCategory = scanner.nextInt();
                switch (flavourCategory) {
                    case 1:
                        System.out.println("We have following pizza in your selected Flavour");
                        PlainOlCheese plainOlCheese = new PlainOlCheese();
                        System.out.println("\n" + "1. " + plainOlCheese.theBigPepperoni());
                        System.out.println("======================================");
                        System.out.println("2. " + plainOlCheese.theBigPepperoniAndMashroom());
                        int pizzaChoose = scanner.nextInt();
                        if (pizzaChoose == 1)
                            chatOperation.order(1);
                        else if (pizzaChoose == 2)
                            chatOperation.order(2);
                        else
                            System.out.println("Please enter correct choice.");
                }
            } else if (choice == 2) {
                System.out.println("Please Delete your ordered Pizza : ");
                int index = scanner.nextInt();
                chatOperation.reorder(index - 1);
            } else {
                break;
            }
        }

    }
}
