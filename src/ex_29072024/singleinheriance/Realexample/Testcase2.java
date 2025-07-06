package ex_29072024.singleinheriance.Realexample;

public class Testcase2 extends BaseTest{
    void testCase2(){
        startBrowser();// BaseTest
        getDataFromSQL(); // GrandBaseTest
        System.out.println(gold); // GrandBaseTest
        // Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        new Testcase2().testCase2();
    }
}
