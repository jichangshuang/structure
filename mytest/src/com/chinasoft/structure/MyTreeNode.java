package com.chinasoft.structure;

public class MyTreeNode {

    private char data;

    private MyTreeNode left;

    private MyTreeNode right;

    public MyTreeNode(char data, MyTreeNode left, MyTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public MyTreeNode getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode left) {
        this.left = left;
    }

    public MyTreeNode getRight() {
        return right;
    }

    public void setRight(MyTreeNode right) {
        this.right = right;
    }
}

