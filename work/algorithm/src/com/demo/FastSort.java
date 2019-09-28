package com.demo;

public class FastSort {

    public static void sort(int[] arrs,int left,int right){

        /**
         * 选取数组的最低位为中间数
         * 选取left，right两个指针
         * 循环直到两个指针相遇
         * 从右到左循环，当遇到比随机数小的退出循环，没有则left--
         * 从左到右循环，当遇到比随机数大的退出循环，没哟则right++；
         * 将右到左循环得到的数与左到右循环出来的数交换
         * 当left==right时，把数组最低位和中间数交换
         * 递归sort，left和right值为最低位到中间数-1
         * 递归sort，left和right值为中间数+1到最高位
         */

        if(left>=right) {
            return;
        }
        int key = arrs[left];
        int i = left;
        int j = right;
        while(i<j){
            while(i<j && key <= arrs[j]){
                j--;
            }
            while(i<j && key >= arrs[i]){
                i++;
            }
//            if(i<j) {
                int temp = arrs[i];
                arrs[i] = arrs[j];
                arrs[j] = temp;
//            }
        }
        arrs[left] = arrs[i];
        arrs[i] = key;
        sort(arrs,left,i-1);
        sort(arrs,i+1,right);
    }
    public static void main(String[] args) {
        int[] arrs = new int[]{6, 3, 8, 1, 0, 4};
        sort(arrs, 0, arrs.length-1);
        for (int a : arrs) {
            System.out.println(a + "\t");

        }
    }
}
