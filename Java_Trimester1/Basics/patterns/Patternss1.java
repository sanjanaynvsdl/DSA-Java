package Basics.patterns;
import java.util.*;

public class Patternss1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();



    //1.
    /*for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



        
    //2.
    /*for(int i=0;i<N;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



    //3
    /*for(int i=N-1;i>=0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



    //4
    /*for(int i=0;i<N;i++) {
        for(int j=0;j<N-i;j++) {
            System.out.print("*");

        }
        System.out.println();
    }*/


    //5
    /*for(int i=1;i<=N;i++) {
        for(int j=1;j<=i;j++) {
            if(j%2!=0){
                System.out.print("*");
            }
            else {
                System.out.print(j);
            }
        }
        System.out.println();
    }*/

    //6
    /*for(int i=1;i<=N;i++) {
        for(int j=1;j<=N-i+1;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=0;i<N;i++) {
        for(int j=0;j<N-i;j++) {
            System.out.print("*");
        }
        System.out.println();
    }*/



    //6
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N-i+1;j++) {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //7(33.05)
    /*for(int i=0;i<2*N;i++) {
        int c = 2*N-i-1;
        for(int j=0;j<c;j++) {
            if(i>N) {
                c = 
            }
        }
        System.out.println();
    }*/

    //8.(triangle)
    /*for(int i=1;i<=N;i++) {
        for(int j=1;j<=N-i+1;j++) {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++) {
            System.out.print("*");
        }
        for(int j=1;j<i;j++) {
            System.out.print("*");
        }
        System.out.println();
    }*/



    //9.(rev Triangle)
    /*for(int i=1;i<=N;i++) {
        for(int j=1;j<=i;j++) {
            System.out.print(" ");
        }
        for(int j=1;j<=N-i+1;j++) {
            System.out.print("*");
        }
        for(int j=1;j<N-i+1;j++) {
            System.out.print("*");
        }
        System.out.println();
    }*/

//10.(diamond)
    /*for(int i=1;i<=N;i++) {
        for(int j=1;j<=N-i+1;j++) {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++) {
            System.out.print("*");
        }
        for(int j=1;j<i;j++) {
            System.out.print("*");
        }
         System.out.println();
    }
       for(int i=2;i<=N;i++) { //(to start lower triangle from 2)
        for(int j=1;j<=i;j++) {
            System.out.print(" ");
        }
        for(int j=1;j<=N-i+1;j++) {
            System.out.print("*");
        }
        for(int j=1;j<N-i+1;j++) {
            System.out.print("*");
        }
         System.out.println();
         
      
    
    }

        //11.(diamond in space) (half)
        /*for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i+1;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //12.(diamond in space (another half))
        /*for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<N-i+1;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        */
        //12.(diamond in space)
        /*for(int i=1;i<=N;i++) {
            for(int j=1;j<=N-i+1;j++) {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
    }
    for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            for(int j=1;j<N-i+1;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=N-i+1;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
}*/
    }
}
