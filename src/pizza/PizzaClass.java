/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:13 PM
 */


package pizza;

/**
 * Pizza Class is for the structure and the variables use for the services provided by the chatBot
 */

public class PizzaClass {
    String pizzaList; //list of pizza order by the user
    int quantity;  //number of pizza order by the user
    char size; // size selected by the user (S,L,M)
    int payment;  //amount payed by the user

    /**
     * PizzaClass is a constructor
     * @param pizzaList list of pizza order by the user
     * @param quantity number of pizza order by the user
     * @param size size selected by the user (S,L,M)
     * @param payment amount payed by the user
     * */
    public PizzaClass(String pizzaList, int quantity, char size, int payment) {
        this.pizzaList = pizzaList;
        this.quantity = quantity;
        this.size = size;
        this.payment = payment;
    }

    /**
     *Getter and Setter
     * */
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public PizzaClass() {
    }

    @Override
    public String toString() {
        return "pizzaList=" + pizzaList +
                "\nquantity=" + quantity +
                "\nsize=" + size +
                "\nPayment=" + payment;
    }

    public String getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(String pizzaList) {
        this.pizzaList = pizzaList;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
