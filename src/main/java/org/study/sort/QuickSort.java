package org.study.sort;

import org.study.common.CompareUtil;

import java.util.Arrays;

public class QuickSort {

    public void test(){
        Integer[] arr = {5,6,3,5,8,9,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    private void sort(Comparable[] a,int low,int hi){
        if(hi<=low){
            return;
        }

        int partition = partition(a,low,hi);
        sort(a,low,partition-1);
        sort(a,partition+1,hi);

    }

    private int partition(Comparable[] a,int low,int hi){
        Comparable key = a[low];
        int patition = 0;
        int left = low;
        int right= hi+1;

        while (true){
            while (CompareUtil.bigger(a[--right],key)){
                if(right==low){
                    break;
                }
            }
            while (CompareUtil.less(a[++left],key)){
                if(left==hi){
                    break;
                }
            }
            if(left>=right){
                break;
            }else {
                CompareUtil.exchange(a,left,right);
            }
        }
        CompareUtil.exchange(a,right,low);
        return right;
    }

}
