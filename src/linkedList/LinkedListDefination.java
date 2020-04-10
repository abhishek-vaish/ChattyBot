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

    private boolean deleteAfter(Node<Pizza> node) {
        boolean response = false;
        Node<Pizza> temp = node.getNext();
        if (temp != null) {
            size--;
            response = true;
        }
        return response;
    }

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
