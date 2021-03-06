package languageTest.lesson10;

import junit.framework.*;


public class AllTests {
    
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(BigDecimalTest.class);
        suite.addTestSuite(NumericTest.class);
        suite.addTestSuite(MathTest.class);
        suite.addTestSuite(RandomTest.class);
        suite.addTestSuite(BitManipulationTest.class);
        return suite;
    }
}
