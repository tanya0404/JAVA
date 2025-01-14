package pattern.array;

import java.util.*;
public class array {

//     public static void Sum(int [] num){
//         int sum=0;
//         for(int i=0;i<num.length;i++){
//             sum=sum+num[i];
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Sum(arr);
//      sc.close();   
//     }






// public static void find(int [] num,int t){
//             int sum=0;
//             for(int i=0;i<num.length;i++){
//                 sum=sum+num[i];
//             }
//             System.out.println(sum);

//             for(int i=0;i<num.length;i++){
//                 if(t==num[i]){
//                     System.out.println("element found");
//                 }
//             }
//         }
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int n= sc.nextInt();
//             int[] arr=new int[n];
//             for(int i=0;i<n;i++){
//                 arr[i]=sc.nextInt();
//             }
//             int t=sc.nextInt();

//             find(arr,t);
//         }





public static void cal(int[] num,int t) {
    for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            if(num[i]+num[j]==t){
                System.out.println(num[i]+" + "+num[j]);
            }
        }
    }
}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int t=sc.nextInt();

    cal(arr,t);
}
}
