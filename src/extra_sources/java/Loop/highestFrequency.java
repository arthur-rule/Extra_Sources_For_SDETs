package Java.Extra_Sources.Java.Loop;

public class highestFrequency {
    public static void main(String[] args) {
        String str = "vvvmmmmlkj";

        int highestFrequency = 0;

//        for (int i = 0; i < str.length(); i++) {         //outer loop taking each letters one by one
//            char ch = str.charAt(i);
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {    //inner loop comparing each letters with the remaining letters
//                if (ch == str.charAt(j)) {
//                    count++;
//                }
//            }
//            if (count > highestFrequency) {
//                highestFrequency = count;
//            }
//        }
//
//        System.out.println(highestFrequency);
//
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (ch == str.charAt(j)) {
//                    count++;
//                }
//            }
//
//            if (count == highestFrequency && !result.contains(ch + "")) {
//                result += ch;
//            }
//        }
//       System.out.println(result);

    String result = "";

    for (int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        int count =0;

            for(int j=0; j< str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }
            if(count> highestFrequency){
                highestFrequency=count;
                result= ch + "";                // we add this line
            }

    }

        System.out.println(highestFrequency);
        System.out.println(result);  // we add this line

    }
}

