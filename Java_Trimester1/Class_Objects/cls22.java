package Class_Objects;


public class cls22 {
    class Rectangle{
            int L;
            int B;
        public Rectangle(int L,int B) {
            this.L=L;
            this.B=B;
        }
        int area () {
            return this.L*this.B;
        }
        boolean issquare() {
            return this.L==this.B;
        }
        boolean isareag (int k) {
            return this.area() > k;
        }
    }
    public int[] solve(int[] A, int[] B) {
        int C[] =new int[A.length];
        for(int i=0;i<A.length;i++) {
            //create ith rectangle
            Rectangle recii= new Rectangle(A[i],B[i]);
            //itreate over all reactangle  from left to ith
            int count=0;
        for(int j=0;j<i;j++) {
            Rectangle rectjj = new Rectangle (A[j],B[j]);
            if(rectjj.issquare() && rectjj.isareag(recii.area())) {
                count++;
            }
        }
        C[i]=count;

        }return C;
    }
    
}
