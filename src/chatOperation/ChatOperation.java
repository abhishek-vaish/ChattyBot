/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:10 PM
 */


package chatOperation;

import linkedList.LinkedListDefination;
import plainOlCheese.PlainOlCheese;

public class ChatOperation<Pizza> implements ChatADT<Pizza> {
    LinkedListDefination<Pizza> linkedListDefination = new LinkedListDefination<>();
    PlainOlCheese plainOlCheese = new PlainOlCheese();

    /**
     * For order the pizza from the list
     *
     * @param index choose the pizza number from the list and give it to order method as a parameter
     */
    @Override
    public void order(int index) {
        if (index == 1)           // If the user choose the first pizza than theBigPepperoni is selected
            linkedListDefination.add((Pizza) plainOlCheese.theBigPepperoni());
        else if (index == 2)           // If the user choose the first pizza than theBigPepperoniAndMashroom is selected
            linkedListDefination.add((Pizza) plainOlCheese.theBigPepperoniAndMashroom());
        linkedListDefination.display();
    }

    /**
     * If the customer mood change and reorder the pizza and cancel the old one
     *
     * @param index choose the pizza number from the list and give it to order method as a parameter
     */
    @Override
    public void reorder(int index) {
        linkedListDefination.display(); //display the list of pizza that user have order
        linkedListDefination.delete(index); //delete the oder that user doesn't want.
    }

    /**
     * For the Pizza payment if the given amount is equal to pizza prize then only the pizza is order
     *
     * @param pizzaPrice amount that user gives to order the pizza
     */
    @Override
    public boolean payment(int pizzaPrice) {
        return false;
    }
}
