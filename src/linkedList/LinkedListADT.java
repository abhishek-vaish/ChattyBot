/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:20 PM
 */


package linkedList;

public interface LinkedListADT<Pizza> {

    /**
     * To add the pizza into the order list
     *
     * @param data add the Pizza type data to the list that user want to order
     */
    void add(Pizza data);

    /**
     * To delete the pizza from the list that user doesn't want to order
     *
     * @param index choose the pizza number from the order list for cancel the order
     * @return if the order is cancel successfully than return true else false
     */
    boolean delete(int index);

    /**
     * To display the list of pizza that user ordered
     */
    void display();

}
