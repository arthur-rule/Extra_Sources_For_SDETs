package Java.Extra_Sources.Java.Method;

public class repeatMethod {
    public static void main(String[] args) {
          /*
  In Java, the repeat method is not a standard method provided by the Java language itself.
  However, you might be referring to the String.repeat(int count) method,
  which is available in Java starting from version 11.
  The String.repeat(int count) method returns a new string
  that is composed of a specified string repeated a certain number of times,
  as specified by the count parameter.

  Therefore, the repeat() method is not defined on CodingBat.
  If you want to use the repeat method there, you will receive a warning.

  But there is no obstacle to using it in IntelliJ.
  It can also be used there in the following way:
  */

        String str = "java";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result+=(""+str.charAt(i)).repeat(2);
          }
        System.out.println(result);
    }

}
