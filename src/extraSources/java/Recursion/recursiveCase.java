package Java.Extra_Sources.Java.Recursion;

public class recursiveCase {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int sum = arraySum(nums, 0);
        System.out.println("Sum: " + sum);
    }

    public static int arraySum(int[] nums, int index) {
        // Base case: If the index is equal to the array length, return 0.
        if (index == nums.length) {
            return 0;
        }

        // Recursive case: Add the current element to the sum of the rest of the elements.
        return nums[index] + arraySum(nums, index + 1);
    }
}
