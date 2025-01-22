package BINARYSCH;

import java.util.Scanner;

public class binary {
    
static void bs(int[] num,int k){
    int l=0;int h=num.length-1;
    while(l<=h){
        int mid =(l+h)/2;
        if(k==mid){
            System.out.println(k);
            break;
        }
        else if(k>mid){
            l=mid+1;
            
        }
        else if(k<mid){
            h=mid-1;
            
        }
        }
}
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }

    int k=s.nextInt();
    bs(arr,k);
}


























}
