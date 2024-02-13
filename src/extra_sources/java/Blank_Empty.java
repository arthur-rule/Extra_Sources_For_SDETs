package extra_sources.java;

public class Blank_Empty {
    public static void main(String[] args) {
        String str1 = "  "; // contains only spaces
        String str2 = "";   // empty string
        String str3 = null; // null string

        System.out.println("str1.isBlank() = " + str1.isBlank());
        System.out.println("str2.isBlank() = " + str2.isBlank());
        //System.out.println("str3.isBlank() = " + str3.isBlank());  //NullPointerException

        System.out.println("str1.isEmpty() = " + str1.isEmpty());
        System.out.println("str2.isEmpty() = " + str2.isEmpty());
        //System.out.println("str3.isEmpty() = " + str3.isEmpty()); //NullPointerException
    }
}
