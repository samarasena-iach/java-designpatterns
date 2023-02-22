package CreationalPatterns.DP01_Singleton;

public class Test {
    public static void main(String[] args) {
        // Below code won't work because of the private constructor
        // DateUtil dateUtil = new DateUtil();

        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = DateUtil.getInstance();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
