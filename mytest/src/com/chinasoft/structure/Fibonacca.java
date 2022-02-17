package com.chinasoft.structure;

public class Fibonacca {

    public static int fac(int n) {
        if (n <= 2) {
            return 1;
        }
        return fac(n - 1) + fac(n - 2);
    }

    /**
     * 非递归
     * @param n
     * @return
     */
    public static int noFac(int n) {
        if (n <= 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    /**
     * 尾递归
     * @param n
     * @param a
     * @param b
     * @return
     */
    public static int facTail(int n, int a, int b) {
        if (n <= 2) {
            return b;
        }
        return facTail(n - 1, b, a + b);
    }

    public static void main(String[] args) {
     /*   for (int i = 1; i <= 45; i++) {
            long l = System.currentTimeMillis();
            System.out.println(i + ":"+fac(i)+ "  耗时:" + (System.currentTimeMillis() - l) + "ms" );
        }*/

        for (int i = 1; i <= 45; i++) {
            long l = System.currentTimeMillis();
            System.out.println(i + ":"+facTail(i,1,1)+ "  耗时:" + (System.currentTimeMillis() - l) + "ms" );
        }
    }
}
