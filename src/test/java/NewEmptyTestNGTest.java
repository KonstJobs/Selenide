
import com.social.selenide.pojo.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewEmptyTestNGTest {

    @Test(dataProvider = "mydata")
    public void test(TestData testData) {
        System.out.println("RESULT: " + testData.getName());
    }

    @Test(dataProvider = "mydata")
    public void testa(TestData testData) {
        System.out.println("RESULT: " + testData.getName());
    }

    @DataProvider(name = "mydata", indices = 9)
    public Object[][] createData() {

        Object[][] objects = new Object[10][1];

        for (int i = 0; i < 10; i++) {

            TestData data = new TestData();
            data.setAge("asdfdf");
            data.setName("name " + i);

            objects[i][0] = data;
        }

        return objects;
    }

}
