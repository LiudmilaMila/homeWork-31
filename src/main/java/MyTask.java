
public class MyTask {
    public static boolean resultTask(String str) {

        char[] chArray = str.toCharArray();
        int sum = 0;

        for (char c : chArray) {
            int number = c - 48;
            sum = sum + number;
        }
        return sum % 3 == 0;
    }
}
