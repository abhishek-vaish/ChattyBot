/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:13 PM
 */


package pizza;

public class PizzaClass {
    String pizzaList;
    int quantity;
    char size;
    int payment;

    public PizzaClass(String pizzaList, int quantity, char size, int payment) {
        this.pizzaList = pizzaList;
        this.quantity = quantity;
        this.size = size;
        this.payment = payment;
    }

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
