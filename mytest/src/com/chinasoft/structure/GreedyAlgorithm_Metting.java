package com.chinasoft.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreedyAlgorithm_Metting implements Comparable<GreedyAlgorithm_Metting> {

    int meNunm;
    int startTime;
    int endTime;

    public GreedyAlgorithm_Metting(int meNunm, int startTime, int endTime) {
        super();
        this.meNunm = meNunm;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(GreedyAlgorithm_Metting o) {
        if (this.endTime > o.endTime) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "GreedyAlgorithm_Metting{" +
                "meNunm=" + meNunm +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static void main(String[] args) {
        List<GreedyAlgorithm_Metting> mettings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            GreedyAlgorithm_Metting gam = new GreedyAlgorithm_Metting(i + 1, start, end);
            mettings.add(gam);
        }
        mettings.sort(null);
        int curTime = 0;
        for (int i = 0; i < n; i++) {
            GreedyAlgorithm_Metting metting = mettings.get(i);
            if (metting.startTime >= curTime) { // 会议开始时间比我们开始时间大，表示可以开
                System.out.println(metting.toString());
                curTime = metting.endTime;
            }
        }
    }
}
