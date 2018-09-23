package homework;

import java.util.HashMap;
import java.util.Map;

public class SpliterClass {

    Map<String, String> list = new HashMap<String, String>();
    public final int STAITIC = 112;

    public String[] sentenceSpitter(String sentance) {
        String[] splitedSentance = sentance.toLowerCase().split(" ");
        return splitedSentance;
    }


    public String[] changeWritenNumbersToDigits(String[] array, Map<String, String> toVerify) {

        for (int i = 0; i < array.length; i++) {
            if (toVerify.containsKey(array[i])) {
                array[i] = toVerify.get(array[i]);
            }
        }
        return array;
    }

    public String printChangedSentence(String[] array) {
        String sentance = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sentance += array[i];
            } else {
                sentance += array[i] + " ";
            }
        }
        return sentance;
    }

}

