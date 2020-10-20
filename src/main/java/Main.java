import TestUtils.*;

public class Main {

    public static void main(String[] args)

    {
        String websiteToTest = "https://buyme.co.il/";
        System.out.println("DBG MSG: before class");
        TestConductor newTest = new TestConductor(websiteToTest);
        System.out.println("DBG MSG: Finished Setting up Property");
        newTest.PerformTests();
        System.out.println("DBG MSG: Finished Testing");
    }
}



