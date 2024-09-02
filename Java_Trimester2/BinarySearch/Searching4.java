

public class Searching4 {
    //1Painter's partition problem.
    /*2 Given an array find the kth (A[k-1])in  a sorted array  min of the array */
    /*3.Given an array A[n] return the min INdex of specail number sum<15 */
    /* */
    //Brute force
    public static int minINdex(int A[],int l,int r) {
        for(int i=l;i<=r;i++) {
            int sum=0;
            while(A[i]>0) {
                sum += A[i]%10;
                A[i] /= 10;
            }
            if(sum<15) {
                return i;
            }
        }return -1;
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N=sc.nextInt();
    //     int A[]=new int[N];
    //     for(int i=0;i<A.length;i++) {
    //         A[i]=sc.nextInt();
    //     }
    //     int l=sc.nextInt();
    //     int r=sc.nextInt();
    //     int a=minINdex(A, l, r);
    //     System.out.println(a);
    // }
    public static int Binaryy(int C[],int A,int B) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<C.length;i++) {
            sum += C[i];
            if(C[i]>max) {
                max=C[i];
            }
        }
        int s=max;
        int e=sum;
        while(s<=e) {
            
        }
        return 0;
    }

    
}
