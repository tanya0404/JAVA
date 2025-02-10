package neocolab;
import java.util.Scanner;
// public class ques {


                                                    // multiply all odd digits of a number

    
    // public static void main(String[] args){
    //     Scanner s=new Scanner(System.in);
    //     int num=s.nextInt();
        
    //     int multi=1;
    //     while(num!=0){
    //         int digit=num%10;
    //         if(digit%2!=0){
    //             multi=digit*multi;
    //         }
            
    //         num=num/10;
    //     }
    //     if(multi==1){
    //         System.out.println("No odd digits found");
    //     }
    //     else
    //     System.out.println(multi);
        
    // }


                                                        // multiply of all non zero digits of a number


    // public static void main(String[] args){
    //     Scanner s=new Scanner(System.in);
    //     int num=s.nextInt();
    //     int multi=1;
    //     while(num!=0){
    //         int digit=num%10;
    //         if(digit!=0){
    //            multi=multi*digit; 
    //         }
    //         num=num/10;
    //     }
    //     System.out.print(multi);
    // }


                                                    // multiply all odd index elements of an array

    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     int multi=1;
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=s.nextInt();
    //         if(i%2==0){
    //             multi=multi*arr[i];
    //         }
    //     }
        
    //     System.out.println(multi);
    // }


                                            // rotate an array by k elements



//  public static void swap(int[] originalArray,int l,int h) {
//      while(l<h){
//         int temp=originalArray[l];
//         originalArray[l]=originalArray[h];
//         originalArray[h]=temp;
//         l++;
//         h--;
//      }
       
//     }

//     public static void printRotatedArray(int[] originalArray, int p) {
//         swap(originalArray,0,originalArray.length-1);
//         swap(originalArray,0,p-1);
//         swap(originalArray,p,originalArray.length-1);
        
//         for(int i=0;i<originalArray.length;i++){
//             System.out.print(originalArray[i]+" ");
//         }
        
//     }

//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         int arr[]=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=s.nextInt();
//         }
        
//         int t=s.nextInt();
//         printRotatedArray(arr,t);
        
//     }

// }

                                    // sum and difference and chrch both are prime or not


// class PrimeDecider {
//     int a;
//     int b;
    
//     public PrimeDecider(int a,int b){
//         this.a=a;
//         this.b=b;
//     }
    
//     public boolean isprime(int num){
//         if(num<=1){
//             return false;
//         }
//         for(int i=2;i<=Math.sqrt(num);i++){
//             if(num%i==0) return false;
//         }
        
//         return true;
//     }
    
//     public void decide(){
//         int sum=a+b;
//         int dif=Math.abs(b-a);
//         System.out.print("Sum: "+sum+", ");
//         System.out.println("Difference: "+dif);
        
//         if(isprime(sum)){
//             System.out.println(sum+" is prime");
//         }
//         else{
//             System.out.println(sum+" is not prime");
//         }
        
//         if(isprime(dif)){
//             System.out.println(dif+" is prime");
//         }
//         else{
//             System.out.println(dif+" is not prime");
//         }
        
        
//         }
    
// }
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         PrimeDecider primeDecider = new PrimeDecider(a, b);
//         primeDecider.decide();

//         scanner.close();
//     }
// }



                                    // check if a number is palindrome or not       


                                    
// class PalindromeChecker{
//     int n;
//     public PalindromeChecker(int n){
//         this.n=n;
//     }
    
//     public boolean isp(){
//         int og=n;
//         int reversed=0;
//         int num=n;
//         while(num!=0){
//             int digit=num%10;
//             reversed=reversed*10+digit;
//             num=num/10;
//         }
//         return og==reversed;
//     }
//     public void displayPalindromeCheckResult(){
//         if(isp()){
//             System.out.println(n+" is a Palindrome");
//         }
//         else{
//             System.out.println(n+" is not a Palindrome");
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int inputNumber = scanner.nextInt();

//         PalindromeChecker palindromeChecker = new PalindromeChecker(inputNumber);

//         palindromeChecker.displayPalindromeCheckResult();

//         scanner.close();
//     }
// }








// class StringManipulation {
    
//     public static String insertSubstring(String og, String sb,int p){
//         String ans=og.substring(0,p)+sb+og.substring(p);
//         return ans;
//     }
// }


// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String originalString = scanner.nextLine();
//         String substringToInsert = scanner.nextLine();
//         int insertionPosition = scanner.nextInt();
//         String result = StringManipulation.insertSubstring(originalString, substringToInsert, insertionPosition);
//         System.out.println(result);

//         scanner.close();
//     }
// }




class SimpleUniqueStringMerge {
    public static String mergeUniqueStrings(String f, String s) {
        String ans=f+s;
        String result=" ";

        for(int i=0;i<ans.length();i++){
            char ch=ans.charAt(i);

            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String result = SimpleUniqueStringMerge.mergeUniqueStrings(firstString, secondString);
        System.out.println(result);

        scanner.close();
    }
}

