
import com.social.selenide.pojo.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class SampleFactory {

    @Factory(dataProvider = "dp")
    public Object[] createInstances(TestData testData) {
        return new Object[]{new SomeTest(testData)};
    }

    @DataProvider(name = "dp")
    public static Object[][] dataProvider() {
       Object[][] objects = new Object[10][1];

        for (int i = 0; i < 10; i++) {

            TestData data = new TestData();
            data.setAge("age " + i);
            data.setName("name " + i);

            objects[i][0] = data;
        }
        return objects;
    }

}
