/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:20 PM
 */


package linkedList;

public class LinkedListDefination<Pizza> implements LinkedListADT<Pizza> {
    private int size = 0; //size of the pizza list
    private Node<Pizza> head = null; //first pizza in the list

    /**
     * To convert the pizza number into the Node type
     *
     * @param index pizza number that user choose
     * @return node type of the pizza choose by the user
     */
    private Node<Pizza> getNode(int index) {
        Node<Pizza> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    /**
     * Helping method for adding the pizza at the first place
     *
     * @param data pizza that have to be added at first place
     */
    private void addFirst(Pizza data) {
        if (head == null) {
            head = new Node(data, null);
            size++;
        }
    }

    /**
     * Helping method for adding the pizza at the other than the first place
     *
     * @param data pizza that have to be added in the list
     * @param node reference of the next pizza node that is inserted in the list
     */
    private void addAfter(Pizza data, Node<Pizza> node) {
        node.next = new Node<>(data, node.next);
        size++;
    }

    /**
     * Helping overloaded method for adding the pizza int the list
     *
     * @param data  pizza that have to be added in the list
     * @param index index number of the pizza that user choose
     */
    private void add(Pizza data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node temp = getNode(index);
            addAfter(data, temp);
        }
    }

    /**
     * To add the pizza into the order list
     *
     * @param data add the Pizza type data to the list that user want to order
     */
    @Override
    public void add(Pizza data) {
        add(data, size);
    }

    /**
     * Helping method for deleting the pizza at the first place
     *
     * @return delete the pizza from the first place in the list
     */
    private boolean deleteFirst() {
        boolean response = false;
        Node<Pizza> temp = head;
        if (head != null) {
            temp = head.getNext();
        }
        if (temp != null) {
            size--;
            response = true;
        }
        return response;
    }

    /**
     * Helping method for adding the pizza at the other than the first place
     *
     * @param node reference of the next pizza node that is deleted in the list
     * @return delete the pizza from the first place in the list
     */
    private boolean deleteAfter(Node<Pizza> node) {
        boolean response = false;
        Node<Pizza> temp = node.getNext();
        if (temp != null) {
            size--;
            response = true;
        }
        return response;
    }

    /**
     * To delete the pizza from the list that user doesn't want to order
     *
     * @param index choose the pizza number from the order list for cancel the order
     * @return if the order is cancel successfully than return true else false
     */
    @Override
    public boolean delete(int index) {
        boolean response = false;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            deleteFirst();
        } else {
            Node<Pizza> temp = getNode(index);
            deleteAfter(temp);
            response = true;
        }
        return response;
    }


    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            Pizza data = getNode(i).getData();
            System.out.print(data);
        }
    }

    private class Node<Pizza> {
        private Pizza data;
        private Node<Pizza> next;

        public Node(Pizza data, Node<Pizza> next) {
            this.data = data;
            this.next = next;
        }

        private Node(Pizza data) {
            this.data = data;
        }

        private Pizza getData() {
            return data;
        }

        private Node<Pizza> getNext() {
            return next;
        }
    }
}
