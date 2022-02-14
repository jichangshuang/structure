package com.chinasoft.structure;

public class MyLinkedList {

    private ListNode head;

    private int size;

    public void insertHead(int data) {  // 插入链表的头部  data是插入的数据
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertNth(int data, int position) {  //  插入链表的中间
        if (position == 0) {
            insertHead(data);
        }
        ListNode node = head;
        for (int i = 0; i < position; i++) {
            node = node.next;
        }
        ListNode newNode = new ListNode(data);
        newNode.next = node.next.next;
        node.next = newNode;
    }

    public void deleteHead() {

    }

    public void deleteNth() {

    }

    public void print() {

    }


}

class ListNode {
    int value;  // 值
    ListNode next; // 下一个的指针

    public ListNode(int value) {
        this.value = value;

    }
}
