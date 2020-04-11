package chatOperation;

public interface ChatADT<Pizza> {
    /**
     * For order the pizza from the list
     *
     * @param pizzaName            list of pizza order by the user
     * @param quantity             number of pizza order by the user
     * @param size                 size selected by the user (S,L,M)
     * @param amountPayedByTheUser amount payed by the user
     */
    boolean order(String pizzaName, int quantity, char size, int amountPayedByTheUser);

    /**
     * For the Pizza payment if the given amount is equal to pizza prize then only the pizza is order
     *
     * @param pizzaPrice amount that user gives to order the pizza
     */
    boolean payment(int pizzaPrice);

}
