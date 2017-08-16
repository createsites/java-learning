import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import sprint2.collections.ArrayIteratorViewer;
import sprint2.collections.interfaces.IViewer;
import sprint2.exceptions.MyArrayDataException;
import sprint2.exceptions.MySizeArrayException;
import sprint2.fireandice.Repository;
import sprint2.fireandice.models.Sample;

public class Sprint2Test {
    @Rule
    public TestName name = new TestName();

    @Test
    public void assertTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        Assert.assertEquals(true, true);
    }

    @Test
    public void fourByfourArrayTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        // TODO: implement
    }

    @Test
    public void fourByfourArraySumTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        // TODO: implement
    }

    @Test(expected = MySizeArrayException.class)
    public void sizeArrayTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        // TODO: implement
    }

    @Test(expected = MyArrayDataException.class)
    public void arrayDataTest() {
        System.out.println("Test of " + name.getMethodName() + ": OK");
        // TODO: implement
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
