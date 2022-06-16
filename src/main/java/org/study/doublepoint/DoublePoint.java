package org.study.doublepoint;


public class DoublePoint {

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int target = 13;


        for (int i=0;i<=arr.length-2;i++){
            int j=i+1;
            while (j<arr.length){
                if((arr[i]+arr[j])==target){
                    System.out.println("===i="+i+",j="+j);
                    return;
                }
                j++;
            }
        }
    }

}
