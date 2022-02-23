package com.chinasoft.structure;

public class Dp {

    public static void main(String[] args) {

        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 40};

        int w = 50;
        int n = 3;
        int dp[][] = new int[n + 1][w + 1]; // n表示物品，w表示重量，初始化全是0

        for (int i = 1; i <= n; i++) {  // 每次增加的物品
            for (int j = 1; j <= w; j++) { // 分割的背包
                if (j >= weight[i - 1]) {  // 表示这个物品可以装进去
                    dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
                } else {  // 表示这个物品不能装进去
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
