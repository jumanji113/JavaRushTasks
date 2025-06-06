package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList(){
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        Node node = new Node(value);
        Node previusNode = last.prev;
        previusNode.next = node;
        node.prev = previusNode;
        node.next = last;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public Node() {
            // Конструктор для создания фиктивных узлов (без значения)
            this.value = null;
            this.prev = null;
            this.next = null;
        }
    }
}
