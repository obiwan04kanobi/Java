package day25;

import org.junit.*;

public class MyBasicTestTest {
    
    MyBasicTest mbt; // object of MyBasicTest class
    public MyBasicTestTest() { // constructor
    }

    @Before
    public void setUp() { // this method will be called before each test method
        mbt = new MyBasicTest();
    }

    @AfterEach
    public void tearDown() { // this method will be called after each test method
        mbt=null;
    }

    @Test
    public void testAdd() { // test method
        int a = 10,b=10,c; // local variables
        c = mbt.add(a, b); 
        Assert.assertEquals(20, c); // this will pass
        //Assert.assertEquals(0, c); // this will fail
        //Assert.assertTrue(c==0); // this will fail
        //Assert.assertNotEquals(0, c); // this will fail
    }
}
