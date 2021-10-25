package org.study.sort;

import java.util.Arrays;

public class BubbleSort {


    public void test(){
        int[] arr = new int[]{6,3,4,5,1,2};
        sort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    /**
     * [6,3,4,5,1,2,5]
     * @param arr
     */
    private void sort(int[] arr){
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
