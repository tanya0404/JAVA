package Array.array;

import java.util.Scanner;

public class Arraylogics {
    


                                            // BINARY SEARCH


    // public static void binarysearch(int[] num,int t){
    //     int l=0;
    //     int h=num.length-1;

    //     while(l<=h){
    //         int mid=(l+h)/2;

    //         if(num[mid]==t){
    //             System.out.println(mid);
    //             break;
    //         }
    //         else if(t<num[mid]){
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

    //     binarysearch(arr, t);
    // }




                                                // REVERSE
                                       


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




  

                                                    // SORTING





//     public static void sort(int[] num){
//         for(int i=0;i<num.length;i++){
//             for(int j=0;j<num.length-i-1;j++){
//                 if(num[j]>num[j+1]){
//                     int temp=num[j];
//                     num[j]=num[j+1];
//                     num[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<num.length;i++){
//         System.out.print(num[i]+" ");
//     }
// }

//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n= s.nextInt();
//         int[] arr= new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=s.nextInt();
//         }

//         sort(arr);

//     }





                                                        // REVERSE





// public static void reverse(int[] num,int l,int h){
//     while(l<=h){
//         int temp=num[l];
//         num[l]=num[h];
//         num[h]=temp;
//         l++;
//         h--;
//     }
// }

// public static void reversebykey(int[] num,int k){
//     reverse(num, 0, num.length-1);
//     reverse(num, 0, k-1);
//     reverse(num, k, num.length-1);

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
//     int key=s.nextInt();
//     reversebykey(arr, key);


// }





// public static void sort(int[] num){
//     for(int i=0;i<num.length;i++){
//         for(int j=0;j<num.length-i-1;j++){
//             if(num[j]>num[j+1]){
//             int temp=num[j];
//             num[j]=num[j+1];
//             num[j+1]=temp;
//             }
//         }
//     }
//     for(int i=0;i<num.length;i++){
//         System.out.print(num[i]+" ");
//     }
// }

// public static void main(String[] args) {
//             Scanner s=new Scanner(System.in);
//             int n= s.nextInt();
//             int[] arr= new int[n];
    
//             for(int i=0;i<n;i++){
//                 arr[i]=s.nextInt();
//             }
    
//             sort(arr);
    
//         }





                                                // MERGE TWO SORTED ARRAY




// METHOD 1

// public static void sort()
// public static void merge(int[] num1,int[] num2){
//     int[] sum=new int[num1.length+num2.length];
//     int n =num1.length;
//     int m =num2.length;
//     for(int i=0;i<n;i++){
//         sum[i]=num1[i];
        
//     }
//     for(int i=0;i<m;i++){
//         sum[i+n]=num2[i];
        
//     }

//     for(int i=0;i<sum.length;i++){
//         System.out.print(sum[i]+" ");
//     }
// }
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n =s.nextInt();
    
    
//     int[] arr1=new int[n];
//     for(int i=0;i<n;i++){
//         arr1[i]=s.nextInt();
//     }
//     int m =s.nextInt();
//     int[] arr2=new int[m];
//     for(int i=0;i<m;i++){
//         arr2[i]=s.nextInt();
//     }

//     merge(arr1,arr2);
// }




// METHOD 2


// public static void merge(int[] num1,int[] num2){
//     int n=num1.length;
//     int m=num2.length;

//     int[] merge=new int[n+m];

//     int i=0;
//     int j=0;
//     int k=0;
//     while(i<n && j<m){
//         if(num1[i]>num2[j]){
//             merge[k]=num2[j];
//             j++;
//             k++;
//         }
//         else{
//             merge[k]=num1[i];
//             i++;
//             k++;
//         }
//     }

//     if(i==n){
//         while(j<m){
//             merge[k]=num2[j];
//             j++;
//             k++;
//         }
//     }
//     if(j==m){
//         while(i<n){
//             merge[k]=num1[i];
//             i++;
//             k++;
//         }
//     }

//     for(int l=0;l<merge.length;l++){
//         System.out.print(merge[l]+" ");
//     }
// }
// public static void main(String[] args) {
//     Scanner s= new Scanner(System.in);
//     int n=s.nextInt();
    

//     int[] arr1=new int[n];
//     for(int i=0;i<n;i++){
//         arr1[i]=s.nextInt();
//     }

//     int m=s.nextInt();
//     int[] arr2=new int[m];
//     for(int i=0;i<m;i++){
//         arr2[i]=s.nextInt();
//     }

//     merge(arr1, arr2);
// }




                                            // MEARGE ARRAY


//     public static void merge(int[] num1,int[] num2){
//         int n=num1.length;
//         int m=num2.length;
        
//         int[] merge=new int[n+m];

//         int i=n-1;
//         int j=m-1;
//         int k=merge.length-1;

//         while(i>-1 && j>-1){
//             if(num1[i]>num2[j]){
//                 merge[k]=num1[i];
//                 i--;
//                 k--;
//             }
//             else{
//                 merge[k]=num2[j];
//                 j--;
//                 k--;
//             }
//         }

       
//             while(j>=0){
//                 merge[k]=num2[j];
//                 j--;
//                 k--;
//             }
     
        
//             while(i>=0){
//                 merge[k]=num1[i];
//                 i--;
//                 k--;
//             }
      

//         for(int l=0;l<merge.length;l++){
//             System.out.print(merge[l]+" ");
//         }
//     }                                      
//     public static void main(String[] args) {
//     Scanner s= new Scanner(System.in);
//     int n=s.nextInt();
    

//     int[] arr1=new int[n];
//     for(int i=0;i<n;i++){
//         arr1[i]=s.nextInt();
//     }

//     int m=s.nextInt();
//     int[] arr2=new int[m];
//     for(int i=0;i<m;i++){
//         arr2[i]=s.nextInt();
//     }

//     merge(arr1, arr2);
// }                 


        
    
    

                                                        // QUESTIONS



// public static int find(int[] num,int t){
//     int l=0;
//     int h=num.length-1;
//     int c=0;


//     while(l<=h){
//         int mid=(l+h)/2;
        
//             if(t==num[mid]){
//                 return num[mid];
//             }
//             else if(t>num[mid]){
//                 l=mid+1;
//                 c=l;
                
//             }
//             else {
//                 h=mid-1;
//                 c=l;
//             }
            
            
//         }
    
//         return num[c];
    

// }
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();

//     int[] arr=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//     }
//     int t=s.nextInt();
//     int ans=find(arr, t);
//     System.out.println(ans);
// }







// public static char find(char[] num,char t){
//     int l=0;
//     int h=num.length-1;
//     int c=0;

//     while(l<=h){
//         int mid =(l+h)/2;
//         if(t==num[mid]){
//             return num[mid];
//         }
//         else if(t<num[mid]){
//             h=mid-1;
//             c=l;
//         }
//         else{
//             l=mid+1;
//             c=l;
//         }
//     }
//     return num[c-1];
// }
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     char[] arr=new char[n];

//     for(int i=0;i<n;i++){
//         arr[i]=s.next().charAt(0);
//     }
//     char t=s.next().charAt(0);
//     char ans=find(arr,t);
//     System.out.println(ans);

// }



// public static void place(int[] num,int t){
//     int l=0;
//     int h=num.length;
//     int a=num[0];
//     int b=0;
//     for(int i=0;i<h;i++){
//         for(int j=0;j<h-i;j++){
//             if(t==num[i]){
//                b=i;
//                i++;
//             }
//         }
//     }
//     System.out.println(b);
// }
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();

//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//     }
//     int t=s.nextInt();

//     place(arr, t);
// }






}







