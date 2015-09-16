// Using java, write a program that prints out the numbers in the Fibonacci series
// between 1 and 50 i.e.
// The first ten Fibonacci numbers are:
// ```
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// ```
// The logic behind is that each subsequent number is the sum of the previous two i.e
// 0,1 are the first two, then 1,1 are the next then 1,2 follows e.t.c

import java.io.*;
import java.util.*;
//define a Fibonacci class
public class Fibonacci
{
    //lets define our main method
    public static void main(String[] args)
    {
        //declare our 3 integer variables
        int f0, f1, f2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to start with: ");
        f0 = scan.nextInt();
        //make the two numbers same
        f1 = f0;
        //the for statement will start with the second number in the sequence
        System.out.println(f0);
        //lets define a for loop to iterate through the recursive formula
        for(int x = 1; x <= 49; x++){
            f2 = f1 + f0; //f2 = 1 + 1
            System.out.println(f2);
            //f0 will equal f1 due to the fact the Fib Seq adds the previous number with the current
            f0 = f1;
            //f1 will equal the new fib number so it can be repeated
            f1 = f2;
        }
    }
}