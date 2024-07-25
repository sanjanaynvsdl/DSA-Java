package Basics;


public class basics {
    //compiler converts code in machine understandable language.
    //MEmory consists of transistors ==>0,1
    //0-->low 1-->high.

    /*
     * IDE - is a tool used for software editing/building/testing..etc
     * ex-  eclipse VS.code Intellij
     * syso()-->output in sameline
     * sysoln()-->prints output and moves to nextline.
     * Java is case-sensitive.(System)(system(X)).
     * [(to print)," ",{},;,//comments used in java]
     * 
     * 
     * 
     * Based on the order of operators answers changed.
     * Rank 1: ()
     * Rank 2 : * , / (same prio)
     * Rank 3 : +,-    (same prio)
     * With same priority operators whichever comes first from
       leftto right will be evaluated first. According to the presidence chart th code will be evaluated
       6*7/6
       -->==42/6


       With operator if one of the operands is text then we concatenate both operands
                                                           -attach the operands.
                                                           "3"+ "2"= 32
                                                            3 + 2= 5
        int x; //intialization
        x = 20; //declaration                                             
     */

    // Data types
    //we use diff data types because capacity/Range is different.
    //Integer
    //int ==> -2^31 to 2^31-1 ~
    //Approx= -2*10^9 to 2 * 10^9-1
   // == -2147483648 to 2147483648

    //long ==>     -2^63    to     2^63-1
    //Approx = -9*10^18   to    9*10^18-1
    

    //Type Casting!!

    //Implicity
    /*Implicit type conversion, also known as widening conversion, occurs automatically when
     a smaller data type is converted to a larger data type. This conversion is performed by 
//      Java compiler itself without any need for special syntax. For example, converting an int to a double: */
//     //("lower storage too higher")
//     int-->long

//     //Explicity 
//     /*a larger data type to a smaller data type. This is because narrowing conversion may
//      result in loss of data or precision. To perform explicit type conversion, 
//     you use casting. For example, converting a double to an int: */
 
//     //(loss of data high to low)


// /*Data types:
// //NUmbers -->1.NOn-Decimals ,Decimals
// //1.int ,long 2.ex-float double.
// /*By default anydecimal number will be considered as double
// 2 float X 3.14 //gives error because 3.14 is double
// 3 float X 3.14f // now 3.14 is considered as float
// 4 float can have upto 6 7 digits after decimal point
// 5 double can have upto 15 to 16 digits after decimal point
// 6 decimal is more precise than float
// 7. System.out.print("30"+10+10); // output == 301010*/

 

// //Type casting rules:
// //No loss of data --> implicity/widening.
// //Loss of data --> explicity/Narrowing.

// //Taking input
// Scanner sc = new Scanner(System.in);
//   int A = sc.nextInt();
//   float B = sc.nextFloat();
//   double C = sc.nextDouble();
//   String D = sc.nextLine();
//   boolean y = sc.nextBoolean();*/
// //Boolean (T/F)

//


}
