public class recursion {
    //Q1
    public static void iloveRecursion(int N) {
        if(N==0) {
            return;
        } 
        //  iloveRecursion(N-1); //1 to 10
        System.out.println("I love Recursion"+N);
        iloveRecursion(N-1); //10 to 1
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=10;
        iloveRecursion(N);
    }
    //2,3 codeforces
    //why do we trust our funciton works
    //from 12th mathematical induction
    
}
