package Java.Extra_Sources.Java;

public class mathAbsMethod {
    public static void main(String[] args) {
//         Math.abs() returns the absolute (Positive) value of an int value.
//         This method gives the absolute value of the argument.
//         The argument can be int, double, long and float.
//         Absolute value refers to the positive value corresponding to the number
//         passed as in arguments. No matter what be it positive or
//         negative number been passed for computation,
//         the computation will occur over the positive corresponding number in both cases.
//         So in order to compute the absolute value for any number we do have a specified
//         method in Java referred to as abs() present inside Math class present
//         inside java.lang package. The java.lang.Math.abs() returns the absolute
//         value of a given argument:
//             If the argument is not negative, the argument is returned.
//             If the argument is negative, the negation of the argument is returned.

//        In Java, there is no specific math.abs method. However, there is a Math.abs()
//        method provided by the java.lang.Math class. This method is used to find the
//        absolute value of a given number. The syntax is as follows:

        int someNumber = -4;
        double absoluteValue = Math.abs(someNumber);

//        Here, someNumber is the numeric value for which you want to find the absolute
//        value, and absoluteValue will store the result.

        double number = -10.5;
        double absoluteValue2 = Math.abs(number);
        System.out.println("Absolute value: " + absoluteValue2);

//        In this case, the output would be: Absolute value: 10.5
//        The Math.abs() method is commonly used when you want to ensure that
//        a value is non-negative, regardless of its original sign.







    }
}
