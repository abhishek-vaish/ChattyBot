/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 09:14 PM
 */


package main;

import chatOperation.ChatOperation;
import linkedList.LinkedListDefination;
import menuCard.MenuCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedListDefination linkedListDefination = new LinkedListDefination();
        String message = scanner.next();
        while (true) {
            System.out.println("Welcome to PizzaBot.com");
            System.out.println("Order Your Pizza.");
            System.out.println("Menu Card");
            System.out.println("Exit.");
            System.out.print("Please Enter your Choice : ");
            String choice = scanner.next();
            if (choice.compareTo("Order") == 0) {
                instruction();
                while (true) {
                    System.out.print("Do you want to order more pizza ? (Yes/No)");
                    String response = scanner.next();
                    if (response.compareTo("Yes") == 0) {
                        instruction();
                        break;
                    } else if (response.compareTo("No") == 0) {
                        break;
                    } else {
                        System.out.println("Please insert correct input");
                    }
                }
            } else if (choice.compareTo("Menu") == 0) {
                MenuCard menuCard = new MenuCard();
                menuCard.menuList();
            } else if (choice.compareTo("Exit") == 0) {
                break;
            } else {
                System.out.println("Please enter correct input");
            }
        }
    }

    private static void instruction() {
        String pizzaName;
        int quantity;
        char size;
        int amountPayedByTheUser;
        Scanner scanner = new Scanner(System.in);
        ChatOperation chatOperation = new ChatOperation();
        System.out.println("Hey Pizza lover!!! What pizza do you want to order ?");
        pizzaName = scanner.next();
        System.out.print("Pizza Size : ");
        size = scanner.next().charAt(0);
        System.out.print("Quantity : ");
        quantity = scanner.nextInt();
        System.out.print("Payment : ");
        amountPayedByTheUser = scanner.nextInt();
        if (chatOperation.order(pizzaName, quantity, size, amountPayedByTheUser)) {
            System.out.println("Your order is placed successfully.");
        } else {
            System.out.println("Some network issue make your order fail !!!");
        }
    }
}
