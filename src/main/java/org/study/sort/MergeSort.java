package org.study.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort {

    private static Comparable[] assist;

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{43,2,2,1,7,8,5,34,90,567,89};

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        //Arrays.stream(arr).forEach(System.out::print);
    }

    public static void sort(Comparable[] list){
        assist = new Comparable[list.length];
        sort(list,0,list.length-1);
    }

    private static void sort(Comparable[] list,int low,int hi){
        if(hi<=low){
            return;
        }
        int mid = low+(hi-low)/2;
        sort(list,low,mid);
        sort(list,mid+1,hi);
        merge(list,low,mid,hi);

    }

    private static void merge(Comparable[] list,int low,int mid,int hi){
        int i = low;
        int p1= low;
        int p2 = mid+1;

        while (p1<=mid && p2<=hi){
            if(less(list[p1],list[p2])){
                assist[i++]=list[p1++];
            }else {
                assist[i++]=list[p2++];
            }
        }
        while (p1<=mid){
            assist[i++]=list[p1++];
        }
        while (p2<=hi){
            assist[i++]=list[p2++];
        }

        for (int index = low; index <= hi; index++) {
            list[index]=assist[index];
        }
    }

    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

}
