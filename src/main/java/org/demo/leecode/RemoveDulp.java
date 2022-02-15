package org.demo.leecode;


import java.util.Vector;

public class RemoveDulp {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,5,8,13,21};
        removeDuplicates(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("--:"+arr[i]);
        }

    }
    //1 1 2 3 5 5 8
    //1   2 3 5 5 8
    public static void removeDuplicates(int[] nums){
        int low=0,high=1,size= nums.length,flag=0;

        while (true){
            if(high>nums.length-1){
                break;
            }
            if(nums[high]==nums[low]){
                nums[high+1] = 0;

                return;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            low= i;
            high=i+1;
            if(high==(size-flag)){
                return;
            }
            if(nums[low]== nums[high]){
                high=high+1;
                nums[low+1]=nums[high];
                flag++;
            }

        }
    }
}
