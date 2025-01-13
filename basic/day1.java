// class day1{

//  public static void main(String[] args) {
//     System.out.println("hlo tannu baby");
//  }

// }



// class day1{
//    public static void even(){
//       for(int i=1;i<=100;i++){
//          if(i%2==0){
//             System.out.println(i);
//          }
//       }
//    }
//    public static void main(String[] args) {
//       even();

//    }
// }

// class day1{
//    public static void ap(int a,int d,int n){
//       int ap=0;
//       for(int i=1;i<=n;i++){
//          ap= a+(i-1)*d;
//       System.out.println(ap);
//       }
//    }
      
//    public static void main(String[] args) {
//       ap(1,2,14);
//    }
// }

// class day1{

//    public static void gp(double a,double r,double n) {
//       double gp=0;
//       for(int i=1;i<n;i++){
//          double b=Math.pow(r,i-1);
//          gp= a*b;
//          System.out.println(gp);
//       }
//    }
//    public static void main(String[] args) {
//       gp(1,2,5);
//    }
// }



// class day1{

//    public static void composite(int n) {
//       int count=0;
//       for(int i=1;i<=n;i++){
//          if(n%i==0){
//             count++;
//          }
//       }

//       if(count>2){
//          System.out.println("composite");
//       }
//       else{
//          System.out.println("not a composite");
//       }
//    }
//    public static void main(String[] args) {
//       composite(6);
//    }
// }

class day1{

   public static void Prime(int n) {
      int count=0;
      for(int i=2;i<n;i++){
         if(n%i==0){
            count++;
         }
         
      }
      if(count==0){
         System.out.println("prime");
      }
      else{
         System.out.println("not a prime");
      }
   }
   public static void main(String[] args) {
      Prime(7);
   }
}