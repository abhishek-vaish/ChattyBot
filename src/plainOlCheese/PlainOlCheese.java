/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 09:31 PM
 */


package plainOlCheese;

import pizza.PizzaClass;

public class PlainOlCheese {
    String pizzaName;
    int prize;
    String flavour;
    boolean offer;

    public String theBigPepperoni() {
        PizzaClass pizzaClass = new PizzaClass();
        pizzaName = "THE BIG PEPPERONI";
        prize = 400;
        flavour = "Plain OI' Cheese";
        offer = false;
        pizzaClass.setPizzaName(pizzaName);
        pizzaClass.setFlavour(flavour);
        pizzaClass.setOffer(offer);
        pizzaClass.setPrize(prize);
        return pizzaClass.toString();
    }

    public String theBigPepperoniAndMashroom() {
        PizzaClass pizzaClass = new PizzaClass();
        pizzaName = "THE BIG PEPPERONI AND MASHROOM";
        prize = 500;
        flavour = "Plain OI' Cheese";
        offer = false;
        pizzaClass.setPizzaName(pizzaName);
        pizzaClass.setFlavour(flavour);
        pizzaClass.setOffer(offer);
        pizzaClass.setPrize(prize);
        return pizzaClass.toString();
    }

}
