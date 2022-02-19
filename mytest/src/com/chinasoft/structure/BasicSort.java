package com.chinasoft.structure;

import java.util.Arrays;

/**
 * 常见排序算法
 */
public class BasicSort {

    /**
     * 插入排序算法
     *
     * @param arr
     */
    public static void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void chooseSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                arr[min] = arr[min] ^ arr[i];
                arr[i] = arr[min] ^ arr[i];
                arr[min] = arr[min] ^ arr[i];
            }
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
    }

    /**
     * 归并排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    /**
     * 归并
     *
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    public static void merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[arr.length];

        int point1 = left; // 表示左边的第一个数字
        int point2 = mid + 1; // 表示右边的第一个数字

        int loc = left; // 表示我们当前的位置
        while (point1 <= mid && point2 <= right) {

            if (arr[point1] <= arr[point2]) {
                temp[loc] = arr[point1];
                point1++;
                loc++;
            } else {
                temp[loc] = arr[point2];
                point2++;
                loc++;
            }
        }
        while (point1 <= mid) {
            temp[loc++] = arr[point1++];
        }

        while (point2 <= right) {
            temp[loc++] = arr[point2++];
        }

        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    /**
     * 快速排序
     *
     * @param data
     * @param left
     * @param right
     */
    public static void quickSort(int data[], int left, int right) {

        int base = data[left];// 基准数
        int ll = left; //表示是从左边找的位置
        int rr = right;// 表示是从右边找的位置

        while (ll < rr) {
            // 从后面找比基准数小的数字
            while (ll < rr && data[rr] >= base) {
                rr--;
            }
            if (ll < rr) {
                data[rr] = data[rr] ^ data[ll];
                data[ll] = data[rr] ^ data[ll];
                data[rr] = data[rr] ^ data[ll];
                ll++;
            }

            // 从前面找比基准数大的数字
            while (ll < rr && data[ll] <= base) {
                ll++;
            }
            if (ll < rr) {
                data[rr] = data[rr] ^ data[ll];
                data[ll] = data[rr] ^ data[ll];
                data[rr] = data[rr] ^ data[ll];
                rr--;
            }
        }

        if (left < ll) {
            quickSort(data, left, ll - 1);
        }
        if (right > ll) {
            quickSort(data, ll + 1, right);
        }
    }


    public static void main(String[] args) {
        int arr1[] = {7, 8, 9, 3, 0, 2, 1};
        insertSort(arr1);
        System.out.println("插入排序:" + Arrays.toString(arr1));

        int arr2[] = {7, 8, 9, 3, 0, 2, 1};
        chooseSort(arr2);
        System.out.println("选择排序:" + Arrays.toString(arr2));

        int arr3[] = {7, 8, 9, 3, 0, 2, 1};
        bubbleSort(arr3);
        System.out.println("冒泡排序:" + Arrays.toString(arr3));

        int arr4[] = {7, 8, 9, 3, 0, 2, 1};
        mergeSort(arr4, 0, arr4.length - 1);
        System.out.println("归并排序:" + Arrays.toString(arr4));

        int arr5[] = {7, 8, 9, 3, 0, 2, 1};
        quickSort(arr5, 0, arr5.length - 1);
        System.out.println("快速排序:" + Arrays.toString(arr5));
    }


}
