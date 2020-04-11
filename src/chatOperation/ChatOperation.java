/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:10 PM
 */


package chatOperation;

import linkedList.LinkedListDefination;
import pizza.PizzaClass;

public class ChatOperation<Pizza> implements ChatADT<Pizza> {
    int amountPaidByTheCustomer = 400;
    LinkedListDefination linkedListDefination = new LinkedListDefination();

    /**
     * For order the pizza from the list
     *
     * @param pizzaName            list of pizza order by the user
     * @param quantity             number of pizza order by the user
     * @param size                 size selected by the user (S,L,M)
     * @param amountPayedByTheUser amount payed by the user
     */
    @Override
    public boolean order(String pizzaName, int quantity, char size, int amountPayedByTheUser) {
        if (payment(amountPaidByTheCustomer)) {
            PizzaClass pizzaClass = new PizzaClass(pizzaName, quantity, size, amountPayedByTheUser);
            linkedListDefination.add(pizzaClass);
            linkedListDefination.display();
        }
        return true;
    }

    /**
     * For the Pizza payment if the given amount is equal to pizza prize then only the pizza is order
     *
     * @param pizzaPrice amount that user gives to order the pizza
     */
    @Override
    public boolean payment(int pizzaPrice) {
        boolean response = false;
        if (pizzaPrice == amountPaidByTheCustomer) {
            response = true;
        }
        return response;
    }
}
