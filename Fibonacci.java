// Using java, write a program that prints out the numbers in the Fibonacci series
// between 1 and 50 i.e.
// The first ten Fibonacci numbers are:
// ```
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// ```
// The logic behind is that each subsequent number is the sum of the previous two i.e
// 0,1 are the first two, then 1,1 are the next then 1,2 follows e.t.c

//define a Fibonacci class
public class Fibonacci
{
    //lets define our main method
    public static void main(String[] args)
    {
        //declare our variables
        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;
        System.out.println(f0+""+f1+""+f2);
    }
}