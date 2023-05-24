package com.LinkedList;

import java.util.Scanner;

public class getDecimalvalue{
public static class ListNode {
    int value;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

    public static int solution(ListNode head){
        int num = 0;
        while(head != null){
            num = num * 2 + head.value;
            head = head.next;
        }
        return num;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        ListNode node1 = new ListNode(11);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        int getdecimal = solution(node1);
        System.out.println(getdecimal);

    }
}


