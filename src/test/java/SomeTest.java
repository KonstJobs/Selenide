
import com.social.selenide.pojo.TestData;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

public class SomeTest {

    TestData testData;

    public SomeTest(TestData testData) {
        this.testData = testData;
    }

    @Test
    public void firstTest() {
        System.out.println("Test #1 with data: " + testData.getName());
        assertTrue(true);
    }

    @Test
    public void secondTest() {
        System.out.println("Test #2 with data: " + testData.getName());
        assertTrue(true);
    }

    @Test
    public void thirdTest() {
        System.out.println("Test #3 with data: " + testData.getName());
        assertTrue(true);
    }

}
