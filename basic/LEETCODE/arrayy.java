package LEETCODE;

import java.util.*;

public class arrayy {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int i=0;

        while(l<=h){
            if(nums[l]+nums[i]==target){
                return l,i;
            }
        }
    }
        public static void main(){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
        }
    }