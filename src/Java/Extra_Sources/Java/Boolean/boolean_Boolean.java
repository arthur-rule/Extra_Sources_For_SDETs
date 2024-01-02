package Java.Extra_Sources.Java.Boolean;

public class boolean_Boolean {
    public static void main(String[] args) {
        /*In Java, there is no difference between "Boolean" and "boolean" in terms of functionality, but there is a difference in their usage.

boolean (primitive type): It is a primitive data type in Java, representing a simple true/false value. It is not an object and doesn't have any methods. You can use it for basic conditional checks and logical operations.*/

        boolean match1 = true;
/*Boolean (wrapper class): It is a class in Java that wraps the primitive type boolean in an object. This allows you to treat boolean values as objects and provides additional utility methods. It can be useful in situations where you need to work with collections that require objects.*/

        Boolean match2 = Boolean.TRUE;

        /*In summary, "boolean" is the primitive data type, while "Boolean" is the corresponding wrapper class. The choice between them depends on your specific needs in a given situation. If you just need a simple true/false value, use the primitive type "boolean." If you need to use boolean values in a more object-oriented context, or if you need to represent null values, you might use the "Boolean" wrapper class.*/

        System.out.println("match1 = " + match1);
        System.out.println("match2 = " + match2);
    }
}
