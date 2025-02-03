package Array.array;

import java.util.*;

enum colours
{
    RED, GREEN, BLUE;
}

public class ques {


                                                        // PRIME NUM


// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int num=s.nextInt();

//     boolean flag=true;

//     for(int i=2;i<Math.sqrt(num);i++){
//         if(num%i==0){
//             flag=false;
//             break;
//         }
//         else flag = true;
//     }

//     if(flag==true){
//         System.out.println("prime");
//     }
//     else System.out.println("not a prime");
// }



                                                        // PRIME NUM BETWEEN A AND B 


// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int a=s.nextInt();
//     int b=s.nextInt();

//     boolean f=true;

//     for(int i=a;i<=b;i++){
//         for(int j=2;j<Math.sqrt(i);j++){
//             if(i%j==0){
//                 f=false;
//                 break;
//             }
//             else f=true;;
//         }
//         if(f==true){
//             System.out.println(i);
//         }
//     }
   
// }


                                                // multiply all digits of a number


// public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int num=s.nextInt();
//         int multi=1;
//         while(num!=0){
//             int digit=num%10;
//             if(digit!=0){
//                multi=multi*digit; 
//             }
//             num=num/10;
//         }
//         System.out.print(multi);
//     }


                                                // multiply all digits in a number


// public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int num=s.nextInt();
        
//         int multi=1;
//         while(num!=0){
//             int digit=num%10;
//             if(digit%2!=0){
//                 multi=digit*multi;
//             }
            
//             num=num/10;
//         }
//         if(multi==1){
//             System.out.println("No odd digits found");
//         }
//         else
//         System.out.println(multi);
        
//     }


public static void main(String[] args) {
    colours c = colours.RED;
    System.out.println(c);
}















}


