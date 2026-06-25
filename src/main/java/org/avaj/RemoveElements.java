package org.avaj;

public class RemoveElements {

    public static int remove(int[] nums, int val) {
        int k = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3};

        int k = remove(nums, 2);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}