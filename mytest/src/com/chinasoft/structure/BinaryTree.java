package com.chinasoft.structure;

public class BinaryTree {

    public static void main(String[] args) {

    }

    public void pre(MyTreeNode root) {
        if (root == null) {
            return;
        }

        if (root.getLeft() != null) {
            pre(root.getLeft());
        }

        if (root.getRight() != null) {
            pre(root.getRight());
        }

    }

    public void mid(MyTreeNode root) {
        if (root == null) {
            return;
        }
        if (root.getLeft() != null) {
            pre(root.getLeft());
        }
        System.out.print(root.getData());
        if (root.getRight() != null) {
            pre(root.getRight());
        }
    }

    public void after(MyTreeNode root) {
        if (root == null) {
            return;
        }

        if (root.getLeft() != null) {
            pre(root.getLeft());
        }

        if (root.getRight() != null) {
            pre(root.getRight());
        }
        System.out.print(root.getData());
    }
}
