import org.junit.*;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {

    @Before
    public void beforeClass() {
        System.out.println("Before class");
    }

    @After
    public void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void test1() {
        System.out.println("1");
        Assert.assertEquals("AW","AW");
    }

    @Test
    public void test2() {
        System.out.println("2");
        Assert.assertEquals("AW","A@W");
    }

    @Test
    public void test3() {
        System.out.println("3");
        Assert.assertSame(3, 3);
    }

    @Test
    public void main() {
        open("https://demoqa.com/automation-practice-form");
    }



}