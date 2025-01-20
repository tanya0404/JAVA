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



    // static void swap(int[] num,int i,int j){
        
    //     int temp=num[i];
    //     num[i]=num[j];
    //     num[j]=temp;
    //         }
        
    

    // static void sort(int[] num){
    //     int l=num[0];
    //     int h=num.length-1;
    //     int it=num[0];

    //     while(it<=h){
    //         if(num[it]==0){
    //             swap(num,it,l);
    //             it++;
    //             l++;
    //         }
    //         else if(num[it]==1){
    //             it++;
    //         }
    //         else{
    //             swap(num,it,h);
    //             h--;
    //         }
    //     }
    //     for(int i=0;i<num.length;i++){
    //         System.out.print(num[i]+" ");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     int[] arr=new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
       
    //     sort(arr);
    // }






    // static void swap(int[] num,int i,int j){
        
    //     int temp=num[i];
    //     num[i]=num[j];
    //     num[j]=temp;
    //         }

    // static void shift(int[] num){
    //     int l=0;
    //     int h=num.length-1;
    //     int it=0;

    //     while(it<=h){
    //         if(num[it]<0){
    //             swap(num, it, l);
    //             l++;
    //             it++;
    //         }
    //         else if(num[it]>=0){
    //             swap(num,it,h);
    //             h--;
    //         }
    //     }
    //     for(int i=0;i<num.length;i++){
    //         System.out.print(num[i]+" ");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();

    //     int[] arr=new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }

    //     shift(arr);
    // }






    // static void set(int[] num1,int[] num2){
    //     int n=num1.length;
    //     int m=num2.length;
        
    //     int[] u=new int[n+m];
    //     int i=0;
    //     int j=0;
    //     int k=0;
    //     while(i<n && j<m){
    //         if(num1[i]<num2[j]){
    //             u[k]=num1[i];
    //             k++;
    //             i++;
    //         }
    //         else if(num1[i]>num2[j]){
    //             u[k]=num2[j];
    //             k++;
    //             j++;
    //         }
    //         else if(num1[i]==num2[j]){
    //             u[k]=num1[i];
    //             i++;
    //             j++;
    //             k++;
    //         }
    //     }

    //     while(i<n){
    //         u[k]=num1[i];
    //         k++;
    //         i++;
    //     }
        
    //     while(j<m){
    //         u[k]=num2[j];
    //         k++;
    //         j++;
    //     }

    //     for(int a=0;a<u.length;a++){
    //         System.out.print(u[a]+" ");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     int m=s.nextInt();

    //     int[] arr1=new int[n];
        

    //     for(int i=0;i<n;i++){
    //         arr1[i]=s.nextInt();
    //     }
    //     int[] arr2=new int[m];
    //     for(int i=0;i<m;i++){
    //         arr2[i]=s.nextInt();
    //     }

    //     set(arr1,arr2);
    // }



                                                // ROTATE ARRAY BY K 


    // static void swap(int[] num,int i,int j){
    //     while(i<=j){
    //     int temp=num[i];
    //     num[i]=num[j];
    //     num[j]=temp;
    //     i++;
    //     j--;
    //     }
        
    //         }
    // static void cyl(int[] num,int k){
    //     int l=0;
    //     int h=num.length-1;

    //     swap(num,l,h);
    //     swap(num, 0, k-1);
    //     swap(num,k,h);

    //     for(int i=0;i<num.length;i++){
    //         System.out.print(num[i]+" ");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();

    //     int[] arr=new int[n];

    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //     }
    //     int k=s.nextInt();
    //     cyl(arr,k);
    // }




                                            // LARGEST SUM IN ARRAY

    static void fun(int[] num){
        int sum=0;
        int maxi=num[0];

        for(int i=0;i<num.length;i++){
            sum=sum+num[i];

            maxi= Math.max(sum, maxi);

            if(sum<0){
                sum=0;
            }
        }
        

        System.out.println(maxi);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        fun(arr);
    }






}
