package Recursions;

public class RecTC {
    //Time Complexity!
    //1 hr 30,min


    //TC{sum(N)} = TC{sum(N-1)+O(1)}
    public static int sum(int N) {
        if(N==1) return 1; //Tc ===> O(1)
        return sum(N-1)+N;  //TC sum(N-1)==> TC of sum(N-2)+O(1)
        //in these way we create a recursive eq of Time complexitiy

 
        //Let's assume TC ofsum(N) is T(N)
        }

    
}
