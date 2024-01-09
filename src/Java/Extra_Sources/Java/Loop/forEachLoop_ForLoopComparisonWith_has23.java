package Java.Extra_Sources.Java.Loop;

public class forEachLoop_ForLoopComparisonWith_has23 {

    //Create a method which is named has23. This method will accept an int array which has length of 2 and it will return true if it contains a2 or a3
    public static void main(String[] args) {

        System.out.println(has23(new int[]{1, 2}));
    }
    public static boolean has23(int[] nums) {

        //solution1
        // return nums[0]==2 || nums[0]==3 ||  nums[1]==2 || nums[1]==3;

        //Lets say  we do not know exact length of Array ==> For Each Loop

  /*				 For Each Loop
------------->What is the  for each loop in java?
For-each is another array traversing technique like for loop, while loop,
do-while loop introduced in Java5.


It starts with the keyword for like a normal for-loop.
Instead of declaring and initializing a loop counter variable, you
declare a variable that is the same type as the base type of the array,
followed by a colon, which is then followed by the array name.
In the loop body, you can use the loop variable you created rather than
using an indexed array element.

It’s commonly used to iterate over an array

------------->What is the limitations of for-each loop?

  1- For-each loops do not keep track of index. So we can not obtain array
     index using For-Each loop
  2- For-each loops only iterates forward over the array in single steps(--i)
  3- For-each loops cannot process two decision making statements at once
     (numbers[i] == arr[i]))
  4- For-each loop also has extra performance load compared to simple iteration
     (45ms to 15 ms)


------------->What is the difference between for loop and for each loop in java?

In Java, both the for loop and foreach loop are used for iteration, but they have
some differences in their syntax and use cases.

---->For Loop:
	The for loop is a general-purpose loop that allows you to specify the initialization,
	termination condition, and increment (or decrement) of a loop variable explicitly.
	It has the following syntax:

	for (initialization; termination_condition; increment/decrement) {
    // Code to be executed in each iteration
	}

	for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
	}

	In this example, the loop starts with i being initialized to 0, and
	the loop will continue as long as i is less than 5. After each iteration,
	the value of i is incremented by 1.


---->Foreach Loop (Enhanced for loop):
	The foreach loop, also known as the enhanced for loop, is a specialized loop
	for iterating over collections such as arrays, lists, or other Iterable objects.
	It simplifies the process of iterating through elements without needing
	to deal with explicit indices. The syntax of the foreach loop is as follows:

	for (element_type element : collection) {
    // Code to be executed for each element
	}

	int[] numbers = {1, 2, 3, 4, 5};

	for (int each : numbers) {
	    System.out.println("Number: " + each);
	}

	In this example, the foreach loop iterates over each element in
	the numbers array and assigns the value to the variable num.
	The loop continues until all elements in the array have been processed.


	In summary, the main difference between the for loop and the foreach loop
	is that the for loop provides more control and flexibility as it allows you
	to define the initialization, termination condition, and increment explicitly.
	On the other hand, the foreach loop is specialized for iterating over
	collections and simplifies the process of iterating through elements
	without the need for explicit indexing.   */




        // solution2
        // boolean check=false;
        // for(int each:nums){
        //   if (each==2 || each==3){
        //     check= true;
        //   }
        // }
        // return check;

        //partialSolution3(the problem:after finding true in first loop it checks again and
        //                convert false)
        // boolean check=false;
        // for(int each:nums){
        //   check= (each==2 || each==3);
        // }
        // return check;

        //solution4
        // boolean check=false;
        // for(int each:nums){
        //   check= (each==2 || each==3)? true : check;
        // }
        // return check;

        //solution5(with break statement)

        boolean check = false;
        for(int each : nums){
            check = (each ==2 || each==3);
            if (check) {
                break;
            }
        }
        return check;

    }

}
