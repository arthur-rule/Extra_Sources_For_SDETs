package Java.Extra_Sources.Java.If_Statements;

import java.util.Scanner;

public class nestedIf {


    /*Today, we'll explore the concept of nested if statements in Java. Nested if statements allow us to check multiple conditions within each other, creating a more complex decision-making structure.
    Let's take the example of a presidential election. To be eligible to vote, there are two main conditions. First, you need to be a human, and second, you need to be at least a certain age, typically 18 years old.
    Outer If Statement: The first check we'll perform is whether the person is a human. We use an 'if' statement for this. If the person is not a human, they are not eligible to vote. If they are a human, we proceed to the next condition.
    Inner If Statement: Now that we know the person is a human, we need to check their age. This is where the nested if statement comes in. Inside the outer 'if' block, we have another 'if' statement that checks if the person is at least 18 years old. If they are, they are eligible to vote. If they are not, we let them know they need to be at least 18 to participate in the election.
    So, in summary, we first check if the person is a human. If they are, we go inside and check if they meet the age requirement. This layered decision-making is what we call nested if statements, and it helps us handle more complex conditions in our programs.

    Let me demonstrate the code interactively, run the program and show how the different messages are displayed based on our inputs.
    Please experiment with different inputs to see how the program responds. This practical example helps you grasp the concept of nested if statements in a context.
    In this example:

        -The program first checks if the person is a human.
        -If the person is a human, it then asks for their age.
        -Inside the nested if statement, it checks if the person is at least 18 years old.
        -Depending on the conditions, the program prints messages indicating whether the person is eligible to vote in the presidential election or not.

     */   public static void main(String[] args) {
    boolean isHuman= true;
     if (isHuman) {
        System.out.println("Great! You are a human.");

        int age = 18;

        // Check if the person is at least a specified age
        if (age >= 18) {
            System.out.println("Congratulations! You are eligible to vote in the presidential election.");
        } else {
            System.out.println("Sorry, you are not eligible to vote. You need to be at least 18 years old.");
        }
    } else {
        System.out.println("Sorry, only humans are eligible to vote in the presidential election.");
    }






    /*


 //after learning scanner you can check this example:

            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for information
            System.out.println("Are you a human? (yes/no)");
            String isHuman = scanner.nextLine();

            // Check if the person is a human
            if (isHuman.equalsIgnoreCase("yes")) {
                System.out.println("Great! You are a human.");

                // Prompt the user for age
                System.out.println("How old are you?");
                int age = scanner.nextInt();

                // Check if the person is at least a specified age
                if (age >= 18) {
                    System.out.println("Congratulations! You are eligible to vote in the presidential election.");
                } else {
                    System.out.println("Sorry, you are not eligible to vote. You need to be at least 18 years old.");
                }
            } else {
                System.out.println("Sorry, only humans are eligible to vote in the presidential election.");
            }

            // Close the scanner to prevent resource leak
            scanner.close();



            */
        }
    }


