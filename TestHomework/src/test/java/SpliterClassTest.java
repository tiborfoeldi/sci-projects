import homework.SpliterClass;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SpliterClassTest {

    Map<String, String> numbersList = new HashMap<String, String>();
    public Map<String, String> populateHashMap() {
        numbersList.put("one", "1");
        numbersList.put("two", "2");
        numbersList.put("three", "3");
        numbersList.put("four", "4");
        numbersList.put("five", "5");
        numbersList.put("six", "6");
        numbersList.put("seven", "7");
        numbersList.put("eight", "8");
        numbersList.put("nine", "9");
        numbersList.put("zero", "0");
        return populateHashMap();
    }

    @Test
    public void testSentenceSpitter() {
        String a = "I want four apples";
        SpliterClass split = new SpliterClass();
        String[] expectedResult = new String[]{"i", "want", "four", "apples"};
        String[] finalResult = split.sentenceSpitter(a);
        Assert.assertEquals(expectedResult, finalResult);
        System.out.println("sentenceSpitter OK");
    }

    @Test
    public void testChangeWritenNumbersToDigits() {
        String a = "I want twenty 9 dollars";
        SpliterClass split = new SpliterClass();
        String[] expectedResult = new String[]{"i", "want",  "twenty", "9", "dollars"};
        String[] finalResult = split.changeWritenNumbersToDigits(split.sentenceSpitter(a), numbersList);
        Assert.assertEquals(expectedResult, finalResult);
        System.out.println("testChangeWritenNumbersToDigits OK");

    }

    @Test
    public void testprintChangedSentence() {
        String a = "i want twenty-nine dollars";
        SpliterClass split = new SpliterClass();
        String expectedResult ="i want twenty-nine dollars";
        String finalResult = split.printChangedSentence(split.changeWritenNumbersToDigits(split.sentenceSpitter(a), numbersList));
        Assert.assertEquals(expectedResult, finalResult);
        System.out.println("testprintChangedSentence OK");

    }
}
