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

    private void addAfter(Pizza data, Node<Pizza> node) {
        node.next = new Node<>(data, node.next);
        size++;
    }

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

    @Override
    public void add(Pizza data) {
        add(data, size);
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
