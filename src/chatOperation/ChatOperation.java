/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:10 PM
 */


package chatOperation;

import linkedList.LinkedListDefination;

public class ChatOperation<Pizza> implements ChatADT<Pizza> {
    LinkedListDefination<Pizza> linkedListDefination = new LinkedListDefination<>();

    @Override
    public void order(int index) {

    }

    @Override
    public void reorder(int index) {

    }

    @Override
    public boolean payment(int pizzaPrice) {
        return false;
    }
}
