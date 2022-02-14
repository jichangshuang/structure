package com.chinasoft.structure;

/**
 * 双向链表
 */
public class DoubleLinkedList {

    public DNode head; // 链表头

    public DNode tail; // 链表尾

    public void insertHead(int data) {  // 插入链表的头部  data是插入的数据
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
           head.pre = newNode;
           newNode.next = head;
           head = newNode;
        }
    }

    public void insertNth(int data, int position) {  //  插入链表的中间
        if (position == 0) {
            insertHead(data);
        } else {
            DNode cur = head;
            for (int i = 1; i < position; i++) {
                cur = cur.next;
            }
            DNode newNode = new DNode(data);
            newNode.next = cur.next;
            cur.next.pre = newNode;
            newNode.pre = cur;
        }
    }

    public void deleteHead() {
        head = head.next;
    }

    public void deleteNth(int position) {

    }

    public void find(int data) {
        
    }
}

class DNode {
    int value;  // 值
    DNode next; // 下一个的指针
    DNode pre; // 指向前一个指针

    public DNode(int value) {
        this.value = value;
        this.next = null;
        this.pre = null;
    }
}
