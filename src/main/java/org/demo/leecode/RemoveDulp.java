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
    public static void removeDuplicates(int[] nums){
        int low,high,size= nums.length,flag=0;
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
