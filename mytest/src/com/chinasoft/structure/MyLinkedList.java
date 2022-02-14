package com.chinasoft.structure;

/**
 * 单链表常见操作
 *
 */
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
        } else {
            ListNode cur = head;
            for (int i = 1; i < position; i++) {
                cur = cur.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = cur.next;
            cur.next = newNode;
        }
    }

    public void deleteHead() {
        head = head.next;
    }

    public void deleteNth(int position) {
        if (position == 0) {
            deleteHead();
        } else {
            ListNode cur = head;
            for (int i = 1 ; i < position; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

    public void find (int data) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.value == data) {
                break;
            }
            cur = cur.next;
        }
    }

    public void print() {
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {

    }

}

class ListNode {
    int value;  // 值
    ListNode next; // 下一个的指针

    public ListNode(int value) {
        this.value = value;

    }
}
