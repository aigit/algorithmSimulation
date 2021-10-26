package org.study.common;

public class CompareUtil {

    public static boolean less(Comparable m,Comparable n){
        return m.compareTo(n)<=0;
    }

    public static boolean bigger(Comparable m,Comparable n){
        return m.compareTo(n)>=0;
    }

    public static void exchange(Comparable[] arr,int m ,int n){
        Comparable tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

}
