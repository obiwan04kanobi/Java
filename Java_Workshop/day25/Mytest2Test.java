package day25;

import org.junit.*;

public class Mytest2Test {

    Mytest2 mt; // object of Mytest2 class
    public Mytest2Test() {
    }

    @Before
    public void setUp() {
        mt = new Mytest2();
    }

    @AfterEach
    public void tearDown() {
        mt=null;
    }

    @Test
    public void testCheck() {
        int a = 59,c;
        c = mt.check(a);
        Assert.assertEquals('F', c); // this will pass
    }
}
