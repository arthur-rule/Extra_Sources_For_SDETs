package extraSources.java.Method;

public class MathRoundMethod {
    public static void main(String[] args) {
        /*In Java, the Math.round method is used to round a floating-point number to the nearest integer. The method takes a single argument, which is the floating-point number that you want to round. The result is a double ora long or an int, depending on the data type of the argument.*/

//Here's a simple example:
        double monthlyPayment = 3496.07;
        double roundedMonthlyPayment = Math.round(monthlyPayment);

        System.out.println("roundedMonthlyPayment = " + roundedMonthlyPayment);

    }
}
