package Array.array;

import java.util.Scanner;

public class practice {
    

    // public static void binarysearch(int[] num,int k){
    //     int l=0;int h=num.length-1;

    //     while(l<=h){
    //         int mid=(l+h)/2;

    //         if(k==num[mid]){
    //             System.out.println(num[mid]);
    //             break;
    //         }
    //         else if(k>num[mid]){
    //             l=mid+1;
    //         }
    //         else if(k<num[mid]){
    //             h=mid-1;
    //         }
    //         else{
    //             System.out.println("not found");
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();

    //     int arr[]=new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     int t=s.nextInt();
    //     binarysearch(arr, t);
        
    // }



    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     double price=s.nextDouble();
    //     s.nextLine();
    //     String dis=s.nextLine();
    //     double val=s.nextDouble();
    //     if(dis.equals("F")){
    //         System.out.println("Discount Amount: "+val);
    //         double dv=price-val;
    //         System.out.println("Final Price: "+dv);
    //     }
    //     else if(dis.equals("P")){
    //         System.out.println("Discount Percentage: "+val);
    //         double per=(val*price)/100;
    //         double fv=price-per;
    //         System.out.println("Final Price: "+fv);
    //     }
    //     else{
    //         System.out.println("Invalid discount type");
    //     }
        
    // }



    // public static void max_min(int[] num){
    //     int max=num[0];
    //     int min=num[0];

    //     for(int i=0;i<num.length;i++){
    //         if(num[i]>max){
    //             max=num[i];
    //         }
    //     }
    //     System.out.println(max);
    //     for(int i=0;i<num.length;i++){
    //         if(num[i]<min){
    //             min=num[i];
    //         }
    //     }
    //     System.out.println(min);
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     int[] arr=new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     max_min(arr);
    // }




    // public static void nth(int[] num, int k){
    //     int n=num.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(num[j]>num[j+1]){
    //                 int temp= num[j];
    //                 num[j]=num[j+1];
    //                 num[j+1]=temp;

    //             }
    //         }
    //     }
    //     for(int i=0;i<num.length;i++){
    //         System.out.print(num[i]+" ");
    //     }
    //    System.out.println();
    //     System.out.println(num[n-k]+" ");
    //     System.out.println(num[k-1]);
        
    // }


    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     int[] arr=new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     int k=s.nextInt();
    //     nth(arr,k);
    // }









}
