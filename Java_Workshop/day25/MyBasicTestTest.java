package day25;

import org.junit.*;

public class MyBasicTestTest {
    
    MyBasicTest mbt;
    public MyBasicTestTest() {
    }

    @Before
    public void setUp() {
        mbt = new MyBasicTest();
    }

    @AfterEach
    public void tearDown() {
        mbt=null;
    }

    @Test
    public void testAdd() {
        int a = 10,b=10,c;
        c = mbt.add(a, b);
        Assert.assertEquals(20, c);
        Assert.assertEquals(0, c);
        Assert.assertTrue(c==0);
        Assert.assertNotEquals(0, c); // this will fail
    }
}
