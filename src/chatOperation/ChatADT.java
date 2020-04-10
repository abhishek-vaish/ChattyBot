package chatOperation;

public interface ChatADT<Pizza> {
    void order(int index);

    void reorder(int index);

    boolean payment(int pizzaPrice);

}
