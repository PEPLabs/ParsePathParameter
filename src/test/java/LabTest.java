import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }

    /**
     * the path param in the url https://revature.com/user/1234 will be 1234
     */
    @Test
    public void paramTest1(){
        String url = "https://revature.com/user/1234";
        int expected = 1234;
        int actual = lab.parse(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * the path param in the url https://revature.com/user/9999999 will be 9999999
     */
    @Test
    public void paramTest2(){
        String url = "https://revature.com/user/9999999";
        int expected = 9999999;
        int actual = lab.parse(url);
        Assert.assertEquals(expected, actual);
    }
    /**
     * the path param in the url https://revature.com/user/1 will be 1
     */
    @Test
    public void paramTest3(){
        String url = "https://revature.com/user/1";
        int expected = 1;
        int actual = lab.parse(url);
        Assert.assertEquals(expected, actual);
    }
}
