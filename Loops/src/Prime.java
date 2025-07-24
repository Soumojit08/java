class Solution{
 int num;
 boolean isPrime = false;
 Solution(int n){
     this.num = n;
 }

 boolean primeOrNot(){
     if(this.num <= 1){
         return isPrime=false;
     }
     int c = 2;
     while (c*c <= this.num){
         if (this.num%2 == 0){
             return isPrime=false;
         }
         c++;
     }
     return isPrime=true;
 }
}

public class Prime {
    public static void main(String[] args) {
        Solution sl = new Solution(3);
        sl.primeOrNot();
    }
}
