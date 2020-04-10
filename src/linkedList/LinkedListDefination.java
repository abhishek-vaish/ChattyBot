/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 09-04-2020
 *   Time: 08:20 PM
 */


package linkedList;

public class LinkedListDefination<Pizza> implements LinkedListADT<Pizza> {
    private int size = 0;
    private Node<Pizza> head = null;

    private Node<Pizza> getNode(int index) {
        Node<Pizza> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(Pizza data) {
        if (head == null) {
            head = new Node(data, null);
            size++;
        }
    }

    @Override
    public void add(Pizza data) {

    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public void display() {

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
