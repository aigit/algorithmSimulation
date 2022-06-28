package org.study.array;

public class FindSumBrokersIndex {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,23,24,26,56,57,58,88};

        int sum = 61;

        int i=0,j = arr.length-1;
        while (i<j){
            int tmp = arr[i]+arr[j];
            if(tmp<sum){
                i++;
            }
            if(tmp>sum){
                j--;
            }
            if(tmp==sum){
                break;
            }
        }

        System.out.println("index i:"+arr[i]+",index j:"+arr[j]);
    }

}
