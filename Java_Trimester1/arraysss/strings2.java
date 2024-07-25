package arraysss;
// import java.util.*;
public class strings2 {

 /*    //30-08-2023
    public static String sortString(String S) {
        String sortedString = "";
        return sortedString;
    }
    public static void main(String [] args) {
        String s = "asdfaasbbcc";
        System.out.println(sortString(s));
    }*/


    
public static int[] getcoordintes(int [][]A,int target) {
    int C []=new int[2];
    C[0]=-1;
    C[1]=-1;
    for(int i=0;i<A.length;i++) {
        for(int j=0;j<A.length;j++) {
            if(A[i][j]==target) {
                C[0]=i;
                C[1]=j;
               
            }
        }
    } return C;
}
   

}
