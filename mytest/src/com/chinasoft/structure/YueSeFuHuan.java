package com.chinasoft.structure;

public class YueSeFuHuan {

    public static void process(int n) {
        if (n <3) {
            return;
        }
        ListNode head = new ListNode(1);
        ListNode cur = head;
        ListNode newNode;
        for (int i =2; i<=n; i++) {
            newNode = new ListNode(i);
            cur.next = newNode;
            cur = newNode;
        }
        // 将链表收尾连接起来
        cur.next = head;
        ListNode p = head;
        while(p !=null) {
            if (p.next.value == p.value || p.next.next == null) {
                break;
            }
            for (int i=1;i<2;i++) {
                p= p.next;
            }
            System.out.print("淘汰了" + p.next.value + "=>");
            p.next = p.next.next;
            p = p.next;

        }
        System.out.println(p.value);

    }

    public static void main(String[] args) {
        process(41);
    }
}
