package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(45);
        list.insertFirst(56);
        list.insertFirst(78);
        list.insertFirst(23);
        list.insertMiddle(67, 3);
        list.display();
    }

}
