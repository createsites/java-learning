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
import sprint2.collections.PhoneDictionary;
import sprint2.collections.interfaces.IDictionary;
import sprint2.collections.interfaces.IViewer;
import sprint2.exceptions.ArrayTransform;
import sprint2.exceptions.MyArrayDataException;
import sprint2.exceptions.MySizeArrayException;
import sprint2.fireandice.Repository;
import sprint2.fireandice.models.Sample;

import java.util.ArrayList;

@RunWith(DataProviderRunner.class)
public class Sprint2Test {
    @Rule
    public TestName name = new TestName();

    // playing with data provider
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
    public void fourByfourArraySumTest(int sum, String[][] arrData) throws MyArrayDataException, MySizeArrayException {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        Assert.assertEquals(sum, new ArrayTransform().getSum(arrData));
    }

    @Test(expected = MySizeArrayException.class)
    @UseDataProvider("fourByfourArrayIncorrectSizeProvider")
    public void fourByfourArraySizeTest(String[][] arrData) throws MyArrayDataException, MySizeArrayException {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        new ArrayTransform().getSum(arrData);
    }

    @Test(expected = MyArrayDataException.class)
    @UseDataProvider("fourByfourArrayIncorrectDataProvider")
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

    // проверка сгенерированных телефонов на кол-во символов
    @Test
    public void phonesGeneratorTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        final int iterations = 20;
        final int phoneLength = 11; // кол-во символов в номере телефона
        int phonesLengsSum = 0;

        for (Long phone : new PhoneDictionary().generateTestPhones(iterations)) {
            int length = (int)Math.ceil(Math.log10(phone));
            phonesLengsSum += length;
        }
        Assert.assertEquals(phonesLengsSum, phoneLength * iterations);
    }

    // проверка что добавляется несколько телефонов к одной фамилии
    @Test
    public void oneSurnamePhonesAddingTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        IDictionary dictionary = new PhoneDictionary();
        dictionary.add("Jones", 79089980808L);
        Assert.assertEquals(3, dictionary.find("Jones").size());
    }

    // добавление номера, поиск номера
    @Test
    public void phonesFindTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        IDictionary dictionary = new PhoneDictionary();
        dictionary.add("Tester", 79089980808L);
        Assert.assertEquals(79089980808L, (long)dictionary.find("Tester").get(0));
    }

    // поиск по несуществующей фамилии
    @Test
    public void notExistingNamePhonesFindTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");

        IDictionary dictionary = new PhoneDictionary();
        Assert.assertEquals(new ArrayList<Long>(), dictionary.find("Tester"));
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
