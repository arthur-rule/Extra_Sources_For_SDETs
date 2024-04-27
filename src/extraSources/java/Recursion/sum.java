package Java.Extra_Sources.Java.Recursion;

public class sum {

    /*
    Recursion
    In Java, a nested method usually refers to a method that is defined within another method. However, it's important to note that Java does not support true nested methods like some other programming languages (such as Python). In Java, you can declare a method within another method, but it won't be truly nested in the sense of having local scope limited to the outer method.

    But If you want to pass a method itself as a parameter to the same method, that is possible:
     */



    public static void main(String[] args) {
        System.out.println(sum(1, sum(0, 1)));
    }

    public static int sum (int a, int b){
        if(a+b>1)
        return 0;
        System.out.println(a+b);

        return a+b;
      }
}

/*
In this example we are passing sum method  as a parameter to the same method itself(sum)
 */
