import java.util.ArrayList;
import java.util.Collection;

public class ChangeStringTask {

    public static String changeWord(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return str;
        }

        String[] words = str.split(" ");
        Collection<String> changedWords = new ArrayList<>();
        for (String word : words) {

            String changedWord = transformWord(word);
            changedWords.add(changedWord);

        }


        String changedStr;
        changedStr = String.join(" ", changedWords);
        return changedStr;
    }

    private static String transformWord(String word) {
        if (word.isEmpty()) {
            return word;
        }

        char[] changingWord = word.toCharArray();

        char character = changingWord[0];
        int ascii = (int) character;
        String firstValue = String.valueOf(ascii);

        String secondValue = "";

        if (changingWord.length > 1) {

            char temp = changingWord[changingWord.length - 1];
            changingWord[changingWord.length - 1] = changingWord[1];
            changingWord[1] = temp;

            secondValue = String.valueOf(changingWord, 1, changingWord.length - 1);
        }


        String result = firstValue + secondValue;

        return result;
    }
}
