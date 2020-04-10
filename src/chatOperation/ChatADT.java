package chatOperation;

public interface ChatADT<Pizza> {
    /**
     * For order the pizza from the list
     *
     * @param index choose the pizza number from the list and give it to order method as a parameter
     */
    void order(int index);

    /**
     * If the customer mood change and reorder the pizza and cancel the old one
     *
     * @param index choose the pizza number from the list and give it to order method as a parameter
     */
    void reorder(int index);

    /**
     * For the Pizza payment if the given amount is equal to pizza prize then only the pizza is order
     *
     * @param pizzaPrice amount that user gives to order the pizza
     */
    boolean payment(int pizzaPrice);

}
