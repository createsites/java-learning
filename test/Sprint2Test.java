import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import sprint2.collections.ArrayIteratorViewer;
import sprint2.collections.interfaces.IViewer;
import sprint2.exceptions.ArrayTransform;
import sprint2.exceptions.MyArrayDataException;
import sprint2.exceptions.MySizeArrayException;
import sprint2.fireandice.Repository;
import sprint2.fireandice.models.Sample;

@RunWith(DataProviderRunner.class)
public class Sprint2Test {
    @Rule
    public TestName name = new TestName();

    // правильные массивы для теста 4х4
    @DataProvider
    public static Object[][] fourByfourArrayCorrectProvider() {

        return new Object[][] {
            {
                136, // sum
                new String[][]{
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                },
            },
            {
                440, // sum
                new String[][] {
                    {"11", "12", "13", "14"},
                    {"21", "22", "23", "24"},
                    {"31", "32", "33", "34"},
                    {"41", "42", "43", "44"}
                },
            },
        };
    }

    // массивы неправильного размера для теста 4х4
    @DataProvider
    public static Object[][] fourByfourArrayIncorrectSizeProvider() {

        return new Object[][] {
            {
                new String[][] {
                    {"11", "12", "13", "14"},
                    {"21", "22", "23", "24"},
                    {"31", "32", "33", "34"}
                }
            },
            {
                new String[][] {
                    {"11", "12", "13"},
                    {"21", "22", "23", "24"},
                    {"31", "32", "33", "34"},
                    {"41", "42", "43", "44"}
                },
            }
        };
    }

    // массивы с неправильными данными для теста 4х4
    @DataProvider
    public static Object[][] fourByfourArrayIncorrectDataProvider() {

        return new Object[][] {
            {
                new String[][] {
                    {"11", "string!", "13", "14"},
                    {"21", "22", "23", "24"},
                    {"31", "32", "33", "34"},
                    {"31", "32", "33", "34"}
                }
            },
            {
                new String[][] {
                    {"11", "12", "13", "14"},
                    {"21", "22", "23", "24"},
                    {"31", "32", "string!", "34"},
                    {"41", "42", "43", "44"}
                },
            }
        };
    }

    @Test
    @UseDataProvider("fourByfourArrayCorrectProvider")
    // TODO здесь throws писать надо ли?
    public void fourByfourArraySumTest(int sum, String[][] arrData) throws MyArrayDataException, MySizeArrayException {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        Assert.assertEquals(sum, new ArrayTransform().getSum(arrData));
    }

    @Test(expected = MySizeArrayException.class)
    @UseDataProvider("fourByfourArrayIncorrectSizeProvider")
    // TODO здесь throws писать надо ли?
    public void fourByfourArraySizeTest(String[][] arrData) throws MyArrayDataException, MySizeArrayException {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        new ArrayTransform().getSum(arrData);
    }

    @Test(expected = MyArrayDataException.class)
    @UseDataProvider("fourByfourArrayIncorrectDataProvider")
    // TODO здесь throws писать надо ли?
    public void fourByfourArrayDataTest(String[][] arrData) throws MyArrayDataException, MySizeArrayException {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        new ArrayTransform().getSum(arrData);
    }

    @Test
    public void arrayIteratorViewerTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        String[] arr = {"hello", "world", "check", "java", "give", "fuck", "punisher :)", "java", "do", "it", "from", "another", "give", "hello", "java", "cool"};
        IViewer arrayIteratorViewer = new ArrayIteratorViewer(arr);

        Assert.assertEquals(arrayIteratorViewer.resultToPrint(), "repeated:give=2;hello=2;java=3");
    }

    @Test
    public void gsonSampleSlugTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        Gson gson = new GsonBuilder().create();
        Sample ex = gson.fromJson(Repository.sampleJson(), Sample.class);

        Assert.assertEquals(ex.slug, "privet-mir");
    }

    @Test
    public void gsonSamplePhraseTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        Gson gson = new GsonBuilder().create();
        Sample ex = gson.fromJson(Repository.sampleJson(), Sample.class);

        Assert.assertEquals(ex.phrase, "hello world!!!");
    }

    @Test
    public void gsonSampleLexicalReduplicationTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        Gson gson = new GsonBuilder().create();
        Sample ex = gson.fromJson(Repository.sampleJson(), Sample.class);

        Assert.assertEquals(ex.lexicalReduplication, "hello-huylo, world-huyeld");
    }
}
