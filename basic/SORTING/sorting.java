package SORTING;

import java.util.Scanner;

public class sorting {

 
    


// public static void check(int[] num){
//     int l=0;
//     int i=0;
//     int h=num.length-1;
//     int ans=0;
//     while(i<=h){
//         if(num[l]>num[i]){
//             ans=1;
            
//             break;
//         }i++;
//     }

//         if(ans==0) System.out.println("true");
//         else System.out.println("false");

// }    
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//     }
//     check(arr);

// }



//                                                          BUBBLE SORT (adjecent element swaping)


// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     int[] arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//     }
//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j]>arr[j+1]){int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//             }
//         }
//     }
//     for(int i=0;i<n;i++){
//     System.out.println(arr[i]);
//     }

// }


//                                                             SELECTION SORT


// static void sort(int[] num){
    
//    int n=num.length;
//    for(int i=0;i<n;i++){
//     int min=Integer.MAX_VALUE;
//     int idx=-1;
//     for(int j=i;j<n;j++){
//         if(num[j]<min){
//             min=num[j];
//             idx=j;
//         }
//     }
//     int temp=num[i];
//     num[i]=num[idx];
//     num[idx]=temp;
//    }

//    for(int i=0;i<n;i++){
//     System.out.print(num[i]+" ");
//    }

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



                                                // INSERTION SORT


// public static void sort(int[] num){
//     int n=num.length;
//     for(int i=1;i<n;i++){
//         for(int j=i;j>=1;j--){
//             if(num[j]<num[j-1]){
//                 int temp=num[j];
//                 num[j]=num[j-1];
//                 num[j-1]=temp;
//             }
    // else{
        // break;
    // }
//         }
//     }
//     for(int i=0;i<n;i++){
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



                                            // MODE(N/2)


// public static void majority(int[] num){
    
//     int l=0;
//     int n=num.length;
//     int h=num.length-1;
//     for(int i=1;i<n;i++){
//         for(int j=i;j>=1;j--){
//             if(num[j]<num[j-1]){
//                 int temp=num[j];
//                 num[j]=num[j-1];
//                 num[j-1]=temp;
//             }
//         }
//     }
    
//         int mid=l+(h-l)/2;
//         System.out.println(num[mid]);
    
// }                                           
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     int[] arr=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//     }
//     majority(arr);
// }


                                        // TRANSFORM ARRAY


// public static void majority(int[] num){

//        int n=num.length;
//         int x=0;
//     for(int i=0;i<n;i++){
//         int min=Integer.MAX_VALUE;
//         int id=-1;
//         for(int j=0;j<n;j++){
//             if(num[j]<min && num[j]>0){
//                 min=num[j];
//                 id=j;
//             }
//     }
//                 num[id]=x;
//                 x--;
// }
//    for(int i=0;i<num.length;i++){
//         System.out.print((-1)*num[i]+" ");
//    }
   
    
// }                                           
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     int[] arr=new int[n];

//     for(int i=0;i<n;i++){
//         arr[i]=s.nextInt();
//     }
//     majority(arr);
// }










    






}
