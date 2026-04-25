package org.avaj;

public class Demo {
    public static void main(String[] args){

        int num[]={12,23,34,56,78};
        int target = 12;

//        Demo obj = new Demo();

        int result=binarySearch(num,target);
        if(result != -1){
            System.out.println("Element Found index :"+result);
        }
        else
            System.out.println("Element Not Found");


    }
    public  static int linearSearch(int[] num, int target){
        for(int i=0; i < num.length; i++){
            if(num[i] == target)
                return i;
        }
        return -1;
    }
    public  static int binarySearch(int num[] , int target){
        int left=0;
        int right= num.length-1;

        while (left <= right){
            int mid = (left+right)/2;

            if(num[mid] == target){
                return mid;
            }
            else if (num[mid] < target){
                left =mid +1;
            }
            else
                right = mid -1;
        }
        return -1;
    }

}
