package extraSources.java.return_exit;

public class ReturnVsExit {
    public static void main(String[] args) {

        System.out.println("Test Started");

        methodA();

        System.out.println("Test Completed");

    }
    public static void methodA(){
        System.out.println("method A is being executed");
        return;
        //System.exit(0);
    }
}
