/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:13 PM
 */


package pizza;

public class PizzaClass {
    String pizzaName;
    int prize;
    String flavour;
    boolean offer;

    public PizzaClass(String pizzaName, int prize, String flavour, boolean offer) {
        this.pizzaName = pizzaName;
        this.prize = prize;
        this.flavour = flavour;
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "Pizza Name=" + pizzaName + '\n' + "Prize=" + prize + "\n" + "Flavour='" + flavour + '\n' +
                "Offer=" + offer;
    }

    public PizzaClass() {
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public boolean isOffer() {
        return offer;
    }

    public void setOffer(boolean offer) {
        this.offer = offer;
    }


}
