package com.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {

        this.size = 0;
    }

    //insertion  at first place
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void lastInsert(int value){
        if(tail == null){
            insertFirst(value);
        }
        Node node = new Node(value);
        node.next = null;
        tail.next = node;
        tail = node;

    }
    public void insertMiddle(int value, int index){
        if(index == 0){
            insertFirst(value);
        }
        if(index == size){
            lastInsert(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;

    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondlast = get(size-2);
        int value = tail.value;
        tail = secondlast;
        tail.next = null;
        return value;
    }





    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {

            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
