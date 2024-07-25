package Class_Objects;
// import java.util.*;


//The classes are blue prints
class coordinates{
    //These are called attributes
    int row;
    int col;
    //creating different types of fubctions inside the class is called methods
    public coordinates(int i, int j) {
        row = i;
        col = j;
        }

        public void printCoord() {
        System.out.println(row + " " + col);
        }

        public boolean equals(coordinates c2) {
        if (this.row != c2.row)
        return false;
        if (this.col != c2.col)
        return false;
        return true;

        }
    }

class StringIntPair{
    String str;
    int i;
}



public class cls1 {
    public static coordinates getcCoordinates(int A[][], int target) {
        coordinates ans=new coordinates(-1,-1);
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                if(A[i][j]==target) {
                    ans.row=i;
                    ans.col=j;
                }
            }
        }return ans;

    }

/*Given an array of strings.
 * Return the string with highest frequency along with its frequency
 * ["abc", "qwe", "abc", "qekp", "abc"]
 * "abc" 3 */
    // public static StringIntPair getMostFreqString(String S) {
    //     StringIntPair ans=new StringIntPair();
    //     // for(int i=0;i<)
    // }


    public static void main(String[] args) {
        //create a new object by using this class
        // coordinates c1 = new coordinates();
        // c1.row=10;
        // c1.col=10;

        //student is already a existing class and we create object 
       
    }

}


