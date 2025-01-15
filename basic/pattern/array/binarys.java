package pattern.array;

import java.util.Scanner;

public class binarys {
    
    // public static void bs(int[] num,int t){
    //     int l=0;
    //     int h=num.length-1;

    //     while(l<=h){
    //         int mid=(l+h)/2;

    //         if(num[mid]==t){
    //             System.out.println(mid);
    //             break;
    //         }
    //         else if(num[mid]>t){
    //             h=mid-1;
    //         }
    //         else{
    //             l=mid+1;
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
        
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     int t=s.nextInt();
    //     bs(arr,t);
    // }





    public static void swap(int[] num,int l,int h){
        int temp=num[l];
        num[l]=num[h];
        num[h]=temp;
    }

    public static void reverse(int[] num){
        int l=0;
        int h=num.length-1;

        while (l<=h) {
            swap(num,l,h);
            l++;
            h--;
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr);
       
    }
}





