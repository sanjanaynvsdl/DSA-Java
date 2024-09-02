

public class Searching3 {
    //IN this class search space is explicitly not given first will find define nd apply binary search.
    //1 floor(ofroot(N)) 
    //2 Max no.of.stairs Amazon()
    //3 Magical number! Google , Amazon
    //4 Aggressive cows
    
    

    //1
    /*Given a number N return a floor of square root of N
     * Largest X where X*X <=N==> in this search space is [1,N]
     */
     //here we r multiplying int*int so typecast==> overflow
    public static  int sqrt(int A) {
        if(A==0 || A==1) {
            return A;
        }
        long s=1;
        long e=A;
        long ans=-1;
        while(s<=e) {
            long mid=s+(e-s)/2;
            if(mid*mid<=A) {
                ans=mid;
                s=mid+1;
                
            }
            else {
                e=mid-1;
            }
        }
        return (int)ans;
        
    }
    /*public static void main(String[] args) {
        int B=100;
        int a=sqrt(B);
        System.out.println(a); //output=10
     }*/


  
     //2
     /*Given  N no.of bricks count how many stairs we can create
      * In this case it doesn't look like searching
      but we can check if certain no. can == Stairs N=10 can check N stairs
      */

     //Time Complexity is O(sqrt(N))
     // you are subtracting consecutive integers until A becomes non-positive. The sum of the first k positive integers is given by (k * (k + 1)) / 2. Therefore, 
     //you can set this sum less than or equal to A and solve for k. The solution will be approximately sqrt(2 * A).
     //Bruteforce approach
     public static int NoStairs(int A) {
        int i=1; //Assuming that atleast one stair has 1 brick
        while(A>0) {
            i++;
            A=A-i;
             //i is no.of.stairs 
        }
        return i-1; 
        // since in while loop last line is executed brofre checking condition
        // we calc. i-1 to get no.of.stairs
     }
     //O(logN) By using Binary search
     // 1,2,3,4,5,,6,7,8,...,50,..,100
     // mid=50 
     //To make 50 steps we weed N(N+1)/2; bricks 
     // so we calculate 50(50+1)/2; is > given steps 
     public static int noStairs(int A) {
        long s=1;
        long  e=A;
        long ans=0;
        while(s<=e) {
            long mid=s+(e-s)/2;
            if(mid*(mid+1)/2<=A) {  // it may overflow store into long
                ans=mid;
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return (int)ans;
     }

     //Ath Magical NUmber!!






    
  
    
    
}



                                
    

