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


static void sort(int[] num){
    
    for(int i=0;i<num.length;i++){
        int min =num[i];
        int minindex=i;
        for(int j=i;j<num.length-1;j++){
            if(num[j]<min){
                min=Integer.MAX_VALUE;
                minindex=-1;
            }
        }
        int temp=num[i];
        num[i]=num[minindex];
        num[minindex]=temp;

    }
    for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
    }
}
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    sort(arr);
}













    






}
