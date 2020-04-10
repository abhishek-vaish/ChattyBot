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

    @Override
    public void order(int index) {
        if (index == 1)
            linkedListDefination.add((Pizza) plainOlCheese.theBigPepperoni());
        else if (index == 2)
            linkedListDefination.add((Pizza) plainOlCheese.theBigPepperoniAndMashroom());
        linkedListDefination.display();
    }

    @Override
    public void reorder(int index) {
        linkedListDefination.display();
        linkedListDefination.delete(index);
    }


    @Override
    public boolean payment(int pizzaPrice) {
        return false;
    }
}
