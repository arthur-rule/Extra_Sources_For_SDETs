package extra_sources.java.loop;

public class ForLoop {
    public static void main(String[] args) {
        /*
        For loop is a control flow statement that allows you to repeatedly execute a block of code a certain number of times. It is particularly useful when you know the number of iterations you want to perform. The basic syntax of a for loop in Java is as follows:

        for (initialization; condition; iteration) {
            // code to be executed
        }
        Initialization: This part is executed once at the beginning of the loop. It is used to initialize the loop control variable.
        Condition: The loop continues to execute as long as this condition is true. If the condition evaluates to false, the loop terminates.
        Iteration: This part is executed after each iteration of the loop. It is typically used to update the loop control variable.
        */

        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration " + i);
        } //This loop will run ten times (0 to 9), printing the iteration number in each step.

        for (int i = 0; i < 10; i+=2) {   // increments the value of i by 2 after each iteration.
            System.out.println("Iteration " + i);
        }//This loop will run five times (0, 2, 4, 6, 8), printing the iteration number in each step. The loop stops when the condition i < 10 is no longer true after the update operation.

        for (int i = 10; i > 0; i--) {
            System.out.println("Iteration " + i);
        } //This loop will run ten times (10 to 1), printing the iteration number in each step.

        for (int i = 10; i > 0; i-=2) {
            System.out.println("Iteration " + i);
        }////This loop will run five times (10, 8, 6, 4, 2), printing the iteration number in each step. The loop stops when the condition i > 0 is no longer true after the update operation.
    }
}
