package extraSources.java.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(4));

    }

    public static int fibonacci(int n) {

  /*recursion in Java refers to the process in which a method calls itself either
  directly or indirectly to solve a problem. In a recursive method, the solution
  to a problem is expressed in terms of simpler instances of the same problem.
  The base case(s) defines the condition under which the recursion stops, preventing
  an infinite loop.*/

        if(n==0 ) return 0;
        if( n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);

    }

}
