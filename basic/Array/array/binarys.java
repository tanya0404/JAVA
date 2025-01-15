package Array.array;

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





    // public static void swap(int[] num,int l,int h){
    //     int temp=num[l];
    //     num[l]=num[h];
    //     num[h]=temp;
    // }

    // public static void reverse(int[] num){
    //     int l=0;
    //     int h=num.length-1;

    //     while (l<=h) {
    //         swap(num,l,h);
    //         l++;
    //         h--;
    //     }
    //     for(int i=0;i<num.length;i++){
    //         System.out.println(num[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
        
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     reverse(arr);
       
    // }







    // public static void swap(int[] num,int l,int h){
    //     int temp=num[l];
    //     num[l]=num[h];
    //     num[h]=temp;
    // }

    // public static void rotate(int[] num,int k){
        
    //     int l=0;
    //     int h=num.length-1;
    //     while(l<=h){
    //         swap(num,l,h);
    //         l++;
    //         h--;

    //     }


    //         for(int i=0;i<k-1;i++){
    //             swap(num,l,h);
    //         }
    //         for(int i=k;i<num.length-1;i++){
    //             swap(num,l,h);
    //         }
    //         for(int i=0;i<num.length;i++){
    //             System.out.print(" "+num[i]);
    //         }
    // }

    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
        
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     int k=s.nextInt();
    //    rotate(arr,k);
    // }






    public static void reverse(int[] num,int l,int h){
        

        while(l<=h){
            int temp=num[l];
            num[l]=num[h];
            num[h]=temp;
            l++;
            h--;
        }

        

    }
    public static void rs(int[] arr,int t){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,t-1);
        reverse(arr,t,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int t=s.nextInt();

        rs(arr,t);

    }
}





